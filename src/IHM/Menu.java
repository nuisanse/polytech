package IHM;


import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import model.NextJPanelActionAide;
import model.NextJPanelActionCatalogue;
import model.NextJPanelActionJeu;
import model.NextJPanelActionTableauscore;
import model.MessagePopupQuitter;
import model.SoundAction;
import model.SoundManager;
import view.PrincipalCadre;


public class Menu extends JPanel
{
	//attributs pour mettre les elements du panel
	private static final long serialVersionUID = 1L;
	private static final String BASE_IMG_URI = "img/";
	private PrincipalCadre cadre;
	private JLabel imfond = null;
	private JLabel imoiseau = null;
	private JLabel imbulle = null;
	private JButton btnson = null;
	private JButton btnjouer = null;
	private JButton btnquitter= null;
	private JButton btntableauscore = null;
	private JButton btncatalogue = null;
	private JButton btnaide = null;
	private JLabel titrepanel = null;
	private JTextPane txtbulle = null;


	public Menu(PrincipalCadre frame)
	{
		super();
		this.cadre=frame;
		setJContentPane1();
	}


	private void setJContentPane1()
	{
		this.setBounds(0,0,1150,600);
		this.setName("Menu");
		this.setLayout(null);

		this.add(gettitremenu(),null);
		this.add(gettxtpnPourUnePremiere(),null);

		this.add(getbouton(),null);
		this.add(getbouton1(),null);
		this.add(getbouton2(),null);
		this.add(getbouton3(),null);
		this.add(getbouton4(),null);

		this.add(getsoundButton(),null);
		this.add(getjLabel2(),null);
		this.add(getjLabel4(),null);
		this.add(getjLabel1(),null);
	}

	private JButton getbouton(){
		if (this.btnjouer == null){
			this.btnjouer = new JButton(new NextJPanelActionJeu(this,cadre));
			btnjouer.setText("JOUER");
			btnjouer.setBounds(512, 316, 137, 35);
			btnjouer.setBackground(new Color(255, 255, 0));
			btnjouer.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		}
		return this.btnjouer;
	}

	private JButton getbouton1(){
		if (this.btnquitter == null){
			this.btnquitter = new JButton(new MessagePopupQuitter(this.cadre,"Veux-tu vraiment quitter le jeu ?","Quitter le jeu MEMO-RI-"));
			btnquitter.setText("QUITTER");
			btnquitter.setBounds(953, 526, 164, 45);
			btnquitter.setBackground(new Color(255, 0, 0));
			btnquitter.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		}
		return this.btnquitter;
	}

	private JButton getbouton2(){
		if (this.btntableauscore == null){
			this.btntableauscore = new JButton(new NextJPanelActionTableauscore(this,cadre));
			btntableauscore.setText("Tableau des scores");
			btntableauscore.setBounds(470, 416, 218, 28);
			btntableauscore.setBackground(new Color(0, 128, 0));
			btntableauscore.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		}
		return this.btntableauscore;
	}

	private JButton getbouton3(){
		if (this.btncatalogue == null){
			this.btncatalogue = new JButton(new NextJPanelActionCatalogue(this,cadre));
			btncatalogue.setText("Catalogue des mots");
			btncatalogue.setBounds(470, 461, 218, 35);
			btncatalogue.setBackground(new Color(0, 128, 0));
			btncatalogue.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		}
		return this.btncatalogue;
	}

	private JButton getbouton4(){
		if (this.btnaide == null){
			this.btnaide = new JButton(new NextJPanelActionAide(this,cadre));
			btnaide.setText("Aide");
			btnaide.setBounds(540, 507, 89, 23);
			btnaide.setBackground(new Color(0, 128, 0));
			btnaide.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		}
		return this.btnaide;
	}		

	private JLabel gettitremenu(){
		if (this.titrepanel == null){
			this.titrepanel = new JLabel();
			titrepanel.setBounds(110,21,787,57);
			titrepanel.setForeground(new Color(0, 128, 0));
			titrepanel.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
			titrepanel.setHorizontalAlignment(SwingConstants.TRAILING);
			titrepanel.setText("BIENVENUE DANS LE JEU MEMO-RI-");
		}
		return this.titrepanel;
	}		

	private JTextPane gettxtpnPourUnePremiere() {
		if (this.txtbulle == null) {
			this.txtbulle = new JTextPane();
			txtbulle.setEditable(false);
			txtbulle.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
			txtbulle.setText("Pour une premi\u00E8re partie, va dans l'aide pour apprendre les r\u00E8gles  ;)");
			txtbulle.setBounds(191, 139, 266, 99);
		}
		return this.txtbulle;
	}


	private JLabel getjLabel1() {
		if (this.imfond == null) {
			this.imfond = new JLabel();
			imfond.setBounds(0, 0, 1294, 571);
			imfond.setName("jLabel1");
			imfond.setText(null);
			imfond.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "fondecran1.jpg")));
		}
		return this.imfond;
	}

	private JLabel getjLabel2() {
		if (this.imoiseau == null) {
			this.imoiseau = new JLabel();
			imoiseau.setHorizontalAlignment(SwingConstants.CENTER);
			imoiseau.setBounds(10, 222, 308, 262);
			imoiseau.setName("jLabel2");
			imoiseau.setText(null);
			imoiseau.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "oiseau.png")));
		}
		return this.imoiseau;
	}

	private JLabel getjLabel4() {
		if (this.imbulle == null) {
			this.imbulle = new JLabel();
			imbulle.setHorizontalAlignment(SwingConstants.CENTER);
			imbulle.setBounds(108, 83, 400, 279);
			imbulle.setName("jLabel4");
			imbulle.setText(null);
			imbulle.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "bulle.png")));
		}
		return this.imbulle;
	}

	public JButton getsoundButton() {
		if (this.btnson == null) {
			this.btnson = new JButton(new SoundAction(cadre));
			btnson.setHorizontalAlignment(SwingConstants.CENTER);
			btnson.setBounds(1008, 21, 70, 57);
			btnson.setName("soundButton");
			btnson.setText(null);
			btnson.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "son.png")));
			if(SoundManager.getInstance().isMute()==true){
				btnson.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "sonmuet.png")));
			}
			else{
				btnson.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "son.png")));
			}
		}
		return this.btnson;
	}
}
