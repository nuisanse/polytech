package model;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JPanel;


public class NextJPanelAction extends AbstractAction {

	private static final long serialVersionUID = 1L;
	private JPanel cur; 
	private JPanel next;
	
	
	public NextJPanelAction(JPanel cur, JPanel next) {
		super();
		this.cur = cur;
		this.next = next;
	}

	public void actionPerformed(ActionEvent arg0) {
		this.cur.setVisible(false);
		this.next.setVisible(true);
	}
}