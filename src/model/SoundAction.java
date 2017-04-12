package model;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

import view.PrincipalCadre;
//import controler.Principal;


public class SoundAction extends AbstractAction {
	private static final long serialVersionUID = 1L;
	private static final String BASE_IMG_URI = "img/";
	private PrincipalCadre frame; 

	public SoundAction(PrincipalCadre frame) {
		super();
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent arg0) {
		if (SoundManager.getInstance().isMute()==true){
			SoundManager.getInstance().getZik().playSound();
			SoundManager.getInstance().setMute(false);
			this.frame.getAide().getjLabel3().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "son.png")));
			this.frame.getCatalogue().getjLabel3().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "son.png")));
			this.frame.getFinJeu().getjLabel3().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "son.png")));
			this.frame.getJeu().getjLabel3().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "son.png")));
			this.frame.getJeu2().getjLabel3().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "son.png")));
			this.frame.getJeu3().getjLabel3().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "son.png")));
			this.frame.getMenu().getsoundButton().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "son.png")));
			this.frame.getTableauscore().getjLabel3().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "son.png")));
		}
		else {
			SoundManager.getInstance().getZik().stopSound();
			SoundManager.getInstance().setMute(true);
			this.frame.getAide().getjLabel3().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "sonmuet.png")));
			this.frame.getCatalogue().getjLabel3().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "sonmuet.png")));
			this.frame.getFinJeu().getjLabel3().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "sonmuet.png")));
			this.frame.getJeu().getjLabel3().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "sonmuet.png")));
			this.frame.getJeu2().getjLabel3().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "sonmuet.png")));
			this.frame.getJeu3().getjLabel3().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "sonmuet.png")));
			this.frame.getMenu().getsoundButton().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "sonmuet.png")));
			this.frame.getTableauscore().getjLabel3().setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "sonmuet.png")));

		}
	}
}