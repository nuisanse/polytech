package model;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.PrincipalCadre;
//import controler.Principal;


public class SoundAction extends AbstractAction {
	private static final long serialVersionUID = 1L;
	private PrincipalCadre frame; 

	public SoundAction(PrincipalCadre frame) {
		super();
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent arg0) {
		if (SoundManager.getInstance().isMute()==true){
			SoundManager.getInstance().getZik().playSound();
			SoundManager.getInstance().setMute(false);
		}
		else {
			SoundManager.getInstance().getZik().stopSound();
			SoundManager.getInstance().setMute(true);
		}
	}
}