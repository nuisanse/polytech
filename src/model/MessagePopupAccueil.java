package model;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import view.PrincipalCadre;


public class MessagePopupAccueil extends AbstractAction {
	
	private static final long serialVersionUID = 1L;
	private PrincipalCadre cadre;
	private String question;
	private String message;
	private JPanel cur; 

	
	public MessagePopupAccueil (JPanel cur, PrincipalCadre cadre, String question, String message){
		this.cur=cur;
		this.cadre=cadre;
		this.question=question;
		this.message=message;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		int a = JOptionPane.showConfirmDialog(cadre, question, message, 0);
		 switch(a)
		 {
		 	case 0 :
		 		this.cur.setVisible(false);
				this.cadre.getMenu().setVisible(true);
		 	case 1 :
		 }
	}
	
}

