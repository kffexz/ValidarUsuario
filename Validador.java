package model;

import javax.swing.JOptionPane;

public class Validador {
    
    public Validador() {
        super();
    }

    public void validarUsuario(Usuario usu) {
    	if(usu.getLogin().equals(JOptionPane.showInputDialog("Digite o login:")) &&
                usu.getSenha().equals(JOptionPane.showInputDialog("Digite a senha:"))) {
                 usu.setAtivo(true);
                 JOptionPane.showMessageDialog(null, usu.getClass().getSimpleName() + " autorizado!");
             } else {
                 JOptionPane.showMessageDialog(null, "Login ou senha inválidos.");
             }
    }
    }