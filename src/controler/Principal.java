package controler;


import model.SoundManager;
import view.PrincipalCadre;

public class Principal {

	public static void main(String[] args) {
		new PrincipalCadre().setVisible(true);
		SoundManager.getInstance().getZik().playSound();
	}
}