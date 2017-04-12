package view;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import IHM.Aide;
import IHM.Carte;
import IHM.Catalogue;
import IHM.FinJeu;
import IHM.Jeu;
import IHM.Jeu2;
import IHM.Jeu3;
import IHM.Menu;
import IHM.Tableauscore;

public class PrincipalCadre extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final int FRAME_WIDTH = 1150;
	public static final int FRAME_HEIGHT = 600;
	
	private JPanel jContentPane1 = null;
	
	private Aide aide = null;
	private Menu menu = null;
	private Jeu jeu = null;
	private Tableauscore tab = null;
	private Catalogue cat = null;
	private Jeu2 jeu2 = null;
	private Jeu3 jeu3 = null;
	private FinJeu finjeu = null;
	
	public ArrayList<Carte> liste1 = new ArrayList<Carte>(); //theme 1
	public ArrayList<Carte> liste2 = new ArrayList<Carte>(); //theme 2
	public ArrayList<Carte> liste3 = new ArrayList<Carte>(); //theme 3
	public ArrayList<String> dicoAr = new ArrayList<String>(); // arabe
	public ArrayList<String> dicoFr = new ArrayList<String>(); // français
	public ArrayList<String> dicoAng = new ArrayList<String>(); // anglais
	public ArrayList<String> dicoAl = new ArrayList<String>(); // allemand
	
	public ArrayList<Carte> listeTheme(String theme)
	{
		if(theme.equals("Animaux"))
			return liste1;
		else if(theme.equals("Nourriture"))
			return liste2;
		else
			return liste3;
	}
	
	public ArrayList<String> listeDico(String langue)
	{
		if(langue.equals("Arabe"))
			return dicoAr;
		else if(langue.equals("Anglais"))
			return dicoAng;
		else if(langue.equals("Allemand"))
			return dicoAng;
		else
			return dicoFr;
	}
	
	public PrincipalCadre()
	{
		super();
		/* Remplissage des tableaux de cartes */
		liste1.add(new Carte("abeille-Ar-.png","abeille-fr-.png","abeille-En-.png","abeille-Germ-.png","abeille.png","nomFr","nomAng","allemand","arabe"));
		/* fin du remplissage */
		initialize();
	}
	
	public void creationliste()
	{
		
		
	}

	
	private void initialize() {
		this.setTitle("Memo_RI_Version2017");
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    this.setContentPane(getJContentPane1());
	}

	
	private JPanel getJContentPane1() {
		if (this.jContentPane1 == null) {
			this.jContentPane1 = new JPanel();
			this.jContentPane1.setLayout(null);
			this.jContentPane1.add(getMenu(), null);
			this.jContentPane1.add(getAide(), null);
			this.jContentPane1.add(getJeu(), null);
			this.jContentPane1.add(getJeu2(), null);
			this.jContentPane1.add(getJeu3(), null);
			this.jContentPane1.add(getFinJeu(), null);
			this.jContentPane1.add(getTableauscore(), null);
			this.jContentPane1.add(getCatalogue(), null);
			
			getMenu().setVisible(true);
			getAide().setVisible(false);
			getJeu().setVisible(false);
			getJeu2().setVisible(false);
			getJeu3().setVisible(false);
			getFinJeu().setVisible(false);
			getTableauscore().setVisible(false);
			getCatalogue().setVisible(false);
		}
		return this.jContentPane1;
	}
	

	public Menu getMenu() {
		
		if (this.menu == null) {
			this.menu = new Menu(this);
			this.menu.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
		}
		return this.menu;
	}
	
	public Aide getAide() {
		if (this.aide == null) {
			this.aide = new Aide(this);
			this.aide.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
		}
		return this.aide;
	}
	
	public Jeu getJeu() {
		if (this.jeu == null) {
			this.jeu = new Jeu(this);
			this.jeu.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
		}
		return this.jeu;
	}
	
	public Jeu2 getJeu2() {
		if (this.jeu2 == null) {
			this.jeu2 = new Jeu2(this);
			this.jeu2.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
		}
		return this.jeu2;
	}
	
	public Jeu3 getJeu3() {
		if (this.jeu3 == null) {
			this.jeu3 = new Jeu3(this);
			this.jeu3.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
		}
		return this.jeu3;
	}
	
	public FinJeu getFinJeu() {
		if (this.finjeu == null) {
			this.finjeu = new FinJeu(this);
			this.finjeu.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
		}
		return this.finjeu;
	}
	
	public Tableauscore getTableauscore() {
		if (this.tab == null) {
			this.tab = new Tableauscore(this);
			this.tab.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
		}
		return this.tab;
	}
	
	public Catalogue getCatalogue() {
		if (this.cat == null) {
			this.cat = new Catalogue(this);
			this.cat.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
		}
		return this.cat;
	}

}