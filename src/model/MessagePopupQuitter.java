package model;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import view.PrincipalCadre;


public class MessagePopupQuitter extends AbstractAction {
	
	private static final long serialVersionUID = 1L;
	private PrincipalCadre cadre;
	private String question;
	private String message;
	
	
	public MessagePopupQuitter (PrincipalCadre cadre, String question, String message){
		this.cadre=cadre;
		this.question=question;
		this.message=message;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		int a = JOptionPane.showConfirmDialog(cadre, question, message, 0);
		 switch(a)
		 {
		 	case 0 :
		   System.exit(0);
		 	case 1 :
		 }
	}
	
}
