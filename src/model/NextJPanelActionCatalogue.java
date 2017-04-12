package model;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JPanel;
import view.PrincipalCadre;


public class NextJPanelActionCatalogue extends AbstractAction {

	private static final long serialVersionUID = 1L;
	
	private JPanel cur;
	private PrincipalCadre frame;
	
	public NextJPanelActionCatalogue(JPanel cur, PrincipalCadre frame) {
		super();
		this.cur = cur;
		this.frame=frame;
	}

	public void actionPerformed(ActionEvent arg0) {
		this.cur.setVisible(false);
		this.frame.getCatalogue().setVisible(true);
	}
}