package model;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.PrincipalCadre;
import IHM.Jeu;
import IHM.Jeu2;


public class ConfigAction extends AbstractAction{

	private static final long serialVersionUID = 1L;


	private PrincipalCadre cadre;
	private Jeu current;
	private Chronometre chrono;
	//private Thread thread;


	public ConfigAction (PrincipalCadre cadre, Jeu current, Jeu2 next) {
		super();
		this.cadre=cadre;
		this.current = current;
	}

	
	/*public void affichechrono() throws InterruptedException{
		int i;
		thread = new Thread();
		for (i=60;i>=0;i--)
		{
			Thread.sleep(1000);
			this.cadre.getJeu2().settime("Temps restant : "+Integer.toString(i)+"s");
		}
		this.cadre.getJeu2().setVisible(false);
		this.cadre.getJeu3().setVisible(true);
	}*/
	
	
	public void actionPerformed(ActionEvent arg0) {
		if (this.current.getPrenom().equals(""))
		{
			this.current.setVisible(false);
			this.cadre.getJeu2().setPrenom("Joueur_Anonyme");
			this.cadre.getJeu3().setPrenom("Joueur_Anonyme");
			
			//Configurations pour un apprentissage du français
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Animaux / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Animaux / Facile ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(1);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Animaux / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Animaux / Moyen ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(2);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Animaux / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Animaux / Difficile ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(3);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Corps humain / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Corps humain / Facile ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(4);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Corps humain / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Corps humain / Moyen ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(5);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Corps humain / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Corps humain / Difficile ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(6);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Nourriture / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Nourriture / Facile ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(7);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Nourriture / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Nourriture / Moyen ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(8);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Nourriture / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Nourriture / Difficile ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(9);
			}
			
			
			//Configurations pour un apprentissage de l'anglais
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Animaux / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Animaux / Facile ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(10);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Animaux / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Animaux / Moyen ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(11);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Animaux / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Animaux / Difficile ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(12);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Corps humain / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Corps humain / Facile ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(13);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Corps humain / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Corps humain / Moyen ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(14);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais/ Corps humain / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais/ Corps humain / Difficile ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(15);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Nourriture / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Nourriture / Facile ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(16);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Nourriture / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Nourriture / Moyen ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(17);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Nourriture / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Nourriture / Difficile ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(18);
			}
			
			
			//Configurations pour un apprentissage de l'allemand
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Animaux / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Animaux / Facile ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(19);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Animaux / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Animaux / Moyen ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(20);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Animaux / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Animaux / Difficile ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(21);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Corps humain / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Corps humain / Facile ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(22);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Corps humain / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Corps humain / Moyen ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(23);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Corps humain / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Corps humain / Difficile ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(24);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Nourriture / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Nourriture / Facile ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(25);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Nourriture / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Nourriture / Moyen ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(26);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Nourriture / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Nourriture / Difficile ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(27);
			}
			
			
			//Configurations pour un apprentissage de l'arabe
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Animaux / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Animaux / Facile ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(28);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Animaux / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Animaux / Moyen ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(29);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Animaux / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Animaux / Difficile ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(30);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Corps humain / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Corps humain / Facile ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(31);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Corps humain / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Corps humain / Facile ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(32);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Corps humain / Difficile ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(33);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Nourriture / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Nourriture / Facile ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(34);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Nourriture / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Nourriture / Moyen ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(35);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Nourriture / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Nourriture / Difficile ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(36);
			}
			
			
			this.cadre.getJeu2().setVisible(true);
			this.cadre.getJeu2().gettime().setVisible(true);
			try {
				chrono=new Chronometre(this.cadre,this.current,this.cadre.getJeu3());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*try {
				this.cadre.getJeu2().affichechrono();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		
		
		else
		{
			this.current.setVisible(false);
			this.cadre.getJeu2().setPrenom(this.cadre.getJeu().getPrenom());
			this.cadre.getJeu3().setPrenom(this.cadre.getJeu().getPrenom());
			
			//Configurations pour un apprentissage du français
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Animaux / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Animaux / Facile ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(1);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Animaux / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Animaux / Moyen ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(2);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Animaux / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Animaux / Difficile ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(3);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Corps humain / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Corps humain / Facile ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(4);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Corps humain / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Corps humain / Moyen ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(5);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Corps humain / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Corps humain / Difficile ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(6);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Nourriture / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Nourriture / Facile ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(7);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Nourriture / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Nourriture / Moyen ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(8);
			}
			if (this.cadre.getJeu().getrdbtnFrancais().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Français / Nourriture / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Français / Nourriture / Difficile ");
				this.cadre.getJeu2().setLangue("Français");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(9);
			}
			
			
			//Configurations pour un apprentissage de l'anglais
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Animaux / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Animaux / Facile ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(10);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Animaux / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Animaux / Moyen ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(11);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Animaux / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Animaux / Difficile ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(12);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Corps humain / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Corps humain / Facile ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(13);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Corps humain / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Corps humain / Moyen ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(14);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais/ Corps humain / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais/ Corps humain / Difficile ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(15);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Nourriture / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Nourriture / Facile ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(16);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Nourriture / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Nourriture / Moyen ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(17);
			}
			if (this.cadre.getJeu().getrdbtnAnglais().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Anglais / Nourriture / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Anglais / Nourriture / Difficile ");
				this.cadre.getJeu2().setLangue("Anglais");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(18);
			}
			
			
			//Configurations pour un apprentissage de l'allemand
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Animaux / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Animaux / Facile ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(19);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Animaux / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Animaux / Moyen ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(20);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Animaux / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Animaux / Difficile ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(21);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Corps humain / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Corps humain / Facile ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(22);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Corps humain / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Corps humain / Moyen ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(23);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Corps humain / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Corps humain / Difficile ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(24);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Nourriture / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Nourriture / Facile ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(25);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Nourriture / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Nourriture / Moyen ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(26);
			}
			if (this.cadre.getJeu().getrdbtnAllemand().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Allemand / Nourriture / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Allemand / Nourriture / Difficile ");
				this.cadre.getJeu2().setLangue("Allemand");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(27);
			}
			
			
			//Configurations pour un apprentissage de l'arabe
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Animaux / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Animaux / Facile ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(28);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Animaux / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Animaux / Moyen ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(29);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnAnimaux().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Animaux / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Animaux / Difficile ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Animaux");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(30);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Corps humain / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Corps humain / Facile ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(31);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Corps humain / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Corps humain / Facile ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(32);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnCorpsHumain().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Corps humain / Difficile ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Corps humain");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(33);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnFacile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Nourriture / Facile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Nourriture / Facile ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Facile");
				this.cadre.getJeu3().setConfiguration(34);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnMoyen().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Nourriture / Moyen ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Nourriture / Moyen ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Moyen");
				this.cadre.getJeu3().setConfiguration(35);
			}
			if (this.cadre.getJeu().getrdbtnArabe().isSelected() && this.cadre.getJeu().getrdbtnNourriture().isSelected() && this.cadre.getJeu().getrdbtnDifficile().isSelected()){
				this.cadre.getJeu2().getbandeau().setText(this.cadre.getJeu2().getPrenom() + " / Arabe / Nourriture / Difficile ");
				this.cadre.getJeu3().getbandeau().setText(this.cadre.getJeu3().getPrenom() + " / Arabe / Nourriture / Difficile ");
				this.cadre.getJeu2().setLangue("Arabe");
				this.cadre.getJeu2().setTheme("Nourriture");
				this.cadre.getJeu2().setDifficulte("Difficile");
				this.cadre.getJeu3().setConfiguration(36);
			}
						
			
			this.cadre.getJeu2().setVisible(true);
			this.cadre.getJeu2().gettime().setVisible(true);
			try {
				this.cadre.getJeu2().affichechrono();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}


