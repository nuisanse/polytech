package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import IHM.Aide;
import IHM.Catalogue;
import IHM.Jeu;
import IHM.Jeu2;
import IHM.Jeu3;
import IHM.FinJeu;
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
	
	
	public PrincipalCadre()
	{
		super();
		initialize();
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