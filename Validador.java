package model;

import javax.swing.JOptionPane;

public class Validador {
	
	public Validador() {
		super();
	}

	public void validarUsuario(Usuario usu) {
		if(usu.getLogin() == usu.getSenha()) {
			if(usu.isAtivo() == true) {
				JOptionPane.showMessageDialog(null, usu.getClass().toString() + " autorizado!");
			} else {
				JOptionPane.showMessageDialog(null, "Usuário boqueado!");
			}
		} else {
			JOptionPane.showMessageDialog(null, usu.getClass().toString() + " desconhecido!");
		}
	}
}
