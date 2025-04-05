package view;

import javax.swing.JOptionPane;
import model.Administrador;
import model.Cliente;
import model.Operador;
import model.Validador;

public class Principal {

    public static void main(String[] args) {
    	Cliente cliente = new Cliente("", "", "", false, "", 0.00, 0.00);
        Administrador administrador = new Administrador("admin", "admin", "admin", true, 500.00, 1234);
        Operador operador = new Operador("", "", "", true, 0.00, "", 0.00);
        Validador v = new Validador();

        int opcaoMenuPrincipal; 

        do {
            // Menu Principal
            String menuPrincipal = "Escolha uma opção:"
                    + "\n1 - Cliente"
                    + "\n2 - Operador"
                    + "\n3 - Administrador"
                    + "\n0 - Sair";

            opcaoMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));

            switch (opcaoMenuPrincipal) {

                case 1: // Cliente
                    int opcaoCliente;
                    do {
                        // Submenu para Cliente
                        String menuCliente = "Escolha uma opção para o Cliente:"
                                + "\n1 – Logar no sistema"
                                + "\n2 – Cadastrar cliente"
                                + "\n3 – Visualizar cliente"
                                + "\n0 – Voltar ao menu anterior";

                        opcaoCliente = Integer.parseInt(JOptionPane.showInputDialog(menuCliente));
                        switch (opcaoCliente) {
                            case 1:
                                v.validarUsuario(cliente);
                                break;
                            case 2:
                                cliente.cadastrarCliente(
                                        JOptionPane.showInputDialog("Digite o nome do cliente:"),
                                        JOptionPane.showInputDialog("Digite o CPF do cliente:"),
                                        JOptionPane.showInputDialog("Digite o login:"),
                                        JOptionPane.showInputDialog("Digite a senha:"),
                                        Double.parseDouble(JOptionPane.showInputDialog("Digite sua renda mensal:"))
                                );
                                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                                break;
                                
                            case 3:
                                JOptionPane.showMessageDialog(null, cliente.apresentarCliente());
                                break;
                        }
                    } while (opcaoCliente != 0);
                    break;

                case 2: // Operador
                    int opcaoOperador;
                    do {
                        // Submenu para Operador
                        String menuOperador = "Escolha uma opção para o Operador:"
                                + "\n1 – Logar no sistema"
                                + "\n2 – Cadastrar operador"
                                + "\n3 – Visualizar operador"
                                + "\n4 – Calcular salário final do operador"
                                + "\n0 – Voltar ao menu anterior";

                        opcaoOperador = Integer.parseInt(JOptionPane.showInputDialog(menuOperador));
                        switch (opcaoOperador) {
                            case 1:
                                v.validarUsuario(operador);
                                break;
                                
                            case 2:
                                operador.cadastrarOperador(
                                        JOptionPane.showInputDialog("Digite o nome do operador:"),
                                        JOptionPane.showInputDialog("Digite o login:"),
                                        JOptionPane.showInputDialog("Digite a senha:"),
                                        JOptionPane.showInputDialog("Digite o cargo:"),
                                        3000.0,
                                        Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da comissão:"))
                                );
                                JOptionPane.showMessageDialog(null, "Operador cadastrado com sucesso!");
                                break;
                                
                            case 3:
                               operador.apresentarOperador();
                                break;
                                
                            case 4:
                                JOptionPane.showMessageDialog(null, "Salário final do operador:\n" + operador.calcularSalario());
                                break;
                        }
                    } while (opcaoOperador != 0);
                    break;

                case 3: // Administrador
                    int opcaoAdministrador;
                    do {
                        // Submenu para Administrador
                        String menuAdministrador = "Escolha uma opção para o Administrador:"
                                + "\n1 – Logar no sistema"
                                + "\n2 – Autorizar usuário"
                                + "\n3 – Calcular limite de crédito"
                                + "\n0 – Voltar ao menu anterior";

                        opcaoAdministrador = Integer.parseInt(JOptionPane.showInputDialog(menuAdministrador));
                        switch (opcaoAdministrador) {
                            case 1:
                                v.validarUsuario(administrador);
                                break;
                                
                            case 2:
                                int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código de liberação:"));

                                // Menu para escolher se autoriza Cliente ou Operador
                                int opcaoUsuario = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Escolha o tipo de usuário a ser autorizado:" 
                                        + "\n1 - Cliente" 
                                        + "\n2 - Operador"
                                ));

                                if (opcaoUsuario == 1) {
                                    // Autorizar Cliente
                                    administrador.autorizarUsuario(cod, cliente); 
                                } else if (opcaoUsuario == 2) {
                                    // Autorizar Operador
                                    administrador.autorizarUsuario(cod, operador);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                                }
                                break;
                            case 3:
                                cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código de liberação:"));
                                administrador.calcularLimiteCredito(cod, cliente);
                                break;
                                
                        }
                    } while (opcaoAdministrador != 0);
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcaoMenuPrincipal != 0);
    }
}
