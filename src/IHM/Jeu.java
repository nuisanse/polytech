package IHM;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.ConfigAction;
import model.MessagePopupAccueil;
import model.SoundAction;
import view.PrincipalCadre;

public class Jeu extends JPanel
{
	//attributs pour mettre les elements du panel
	private static final String BASE_IMG_URI = "img/";
	private static final long serialVersionUID = 1L;
	private JRadioButton rdbtnDifficile = null;
	private JRadioButton rdbtnMoyen = null;
	private JRadioButton rdbtnFacile = null;
	private JRadioButton rdbtnAnglais = null;
	private JRadioButton rdbtnFrancais = null;
	private JRadioButton rdbtnAllemand = null;
	private JRadioButton rdbtnArabe = null;
	private JRadioButton rdbtnAnimaux = null;
	private JRadioButton rdbtnNourriture = null;
	private JRadioButton rdbtnCorpsHumain = null;

	private JTextField textFieldPrenom = null;
	private JButton btnCommencer = null;
	private PrincipalCadre cadre;
	private JLabel imfond = null;	
	private JButton btnson = null;
	private JButton btnaccueil = null;


	public Jeu(PrincipalCadre frame)
	{
		super();
		this.cadre=frame;
		setJContentPane1();
	}


	private void setJContentPane1() {
		this.setLayout(null);
		this.setName("Configuration du Jeu");
		this.setBounds(0,0,1150,600);	


		JLabel lblTonPrenom = new JLabel();
		lblTonPrenom.setBounds(393, 412, 285, 38);
		lblTonPrenom.setText("TON PRENOM");
		lblTonPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		lblTonPrenom.setForeground(Color.BLACK);
		lblTonPrenom.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		this.add(lblTonPrenom);

		JButton btnOk = new JButton("OK");
		btnOk.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				btnCommencer.setVisible(true);
			}
		});
		btnOk.setBounds(718, 459, 53, 31);
		btnOk.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		this.add(btnOk);

		JLabel titre1 = new JLabel();
		titre1.setBounds(432, 21, 214, 57);
		titre1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		titre1.setForeground(Color.BLACK);
		titre1.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		titre1.setHorizontalAlignment(SwingConstants.CENTER);
		titre1.setText("LANGUE");
		this.add(titre1);

		JLabel titre2 = new JLabel();
		titre2.setBounds(435, 159, 173, 50);
		titre2.setForeground(new Color(0, 0, 0));
		titre2.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		titre2.setHorizontalAlignment(SwingConstants.CENTER);
		titre2.setText("THEME");
		this.add(titre2);

		JLabel titre3 = new JLabel();
		titre3.setBounds(415, 297, 243, 45);
		titre3.setForeground(new Color(0, 0, 0));
		titre3.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		titre3.setHorizontalAlignment(SwingConstants.CENTER);
		titre3.setText("DIFFICULTE");
		this.add(titre3);

		this.add(gettextFieldPrenom(),null);
		this.add(getrdbtnDifficile(),null);
		this.add(getrdbtnMoyen(),null);
		this.add(getrdbtnFacile(),null);
		this.add(getrdbtnNourriture(),null);
		this.add(getrdbtnCorpsHumain(),null);
		this.add(getrdbtnAnimaux(),null);
		this.add(getrdbtnArabe(),null);
		this.add(getrdbtnAllemand(),null);
		this.add(getrdbtnAnglais(),null);
		this.add(getrdbtnFrancais(),null);
		this.add(getjLabel3(),null);
		this.add(getbtnCommencer(),null);
		this.add(getbouton1(), null);
		this.add(getjLabel1(),null);
	}

	
	//Groupes de boutons radio regroupant chaque famille de paramètres
	private ButtonGroup grouplangue = new ButtonGroup();
	private ButtonGroup grouptheme = new ButtonGroup();
	private ButtonGroup groupdifficulte = new ButtonGroup();
	
	
	
	//Boutons radio pour sélectionner la difficulté du jeu
	public JRadioButton getrdbtnDifficile(){
		if (this.rdbtnDifficile==null){
			this.rdbtnDifficile= new JRadioButton("Difficile (9 cartes)");
			groupdifficulte.add(rdbtnDifficile);
			rdbtnDifficile.setBounds(767, 349, 143, 23);
			rdbtnDifficile.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnDifficile.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		}
		return this.rdbtnDifficile;
	}


	public JRadioButton getrdbtnMoyen(){
		if (this.rdbtnMoyen==null){
			this.rdbtnMoyen=new JRadioButton("Moyen (5 cartes)");
			groupdifficulte.add(rdbtnMoyen);
			rdbtnMoyen.setBounds(529, 349, 129, 23);
			rdbtnMoyen.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnMoyen.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		}
		return this.rdbtnMoyen;
	}

	public JRadioButton getrdbtnFacile(){
		if (this.rdbtnFacile==null){
			this.rdbtnFacile = new JRadioButton("Facile (3 cartes)");
			rdbtnFacile.setBounds(278, 349, 126, 23);
			groupdifficulte.add(rdbtnFacile);
			rdbtnFacile.setSelected(true);
			rdbtnFacile.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnFacile.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		}
		return this.rdbtnFacile;
	}

	
	//Boutons radio pour sélectionner le thème à apprendre
	public JRadioButton getrdbtnNourriture(){
		if (this.rdbtnNourriture==null){
			this.rdbtnNourriture = new JRadioButton("Nourriture");
			grouptheme.add(rdbtnNourriture);
			rdbtnNourriture.setBounds(767, 216, 97, 23);
			rdbtnNourriture.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnNourriture.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		}
		return this.rdbtnNourriture;
	}

	public JRadioButton getrdbtnCorpsHumain(){
		if (this.rdbtnCorpsHumain==null){
			this.rdbtnCorpsHumain = new JRadioButton("Corps humain");
			grouptheme.add(rdbtnCorpsHumain);
			rdbtnCorpsHumain.setBounds(514, 216, 109, 23);
			rdbtnCorpsHumain.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnCorpsHumain.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		}
		return this.rdbtnCorpsHumain;
	}

	public JRadioButton getrdbtnAnimaux(){
		if (this.rdbtnAnimaux==null){
			this.rdbtnAnimaux = new JRadioButton("Animaux");
			grouptheme.add(rdbtnAnimaux);
			rdbtnAnimaux.setSelected(true);
			rdbtnAnimaux.setBounds(294, 216, 83, 23);
			rdbtnAnimaux.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnAnimaux.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		}
		return this.rdbtnAnimaux;
	}

	
	//Boutons radio pour sélectionner la langue d'apprentissage
	public JRadioButton getrdbtnArabe(){
		if (this.rdbtnArabe==null){
			this.rdbtnArabe = new JRadioButton("Arabe");
			grouplangue.add(rdbtnArabe);
			rdbtnArabe.setBounds(819, 85, 70, 23);
			rdbtnArabe.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnArabe.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		}
		return this.rdbtnArabe;
	}

	public JRadioButton getrdbtnAllemand(){
		if (this.rdbtnAllemand==null){
			this.rdbtnAllemand = new JRadioButton("Allemand");
			grouplangue.add(rdbtnAllemand);
			rdbtnAllemand.setBounds(620, 85, 89, 23);
			rdbtnAllemand.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnAllemand.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		}
		return this.rdbtnAllemand;
	}

	public JRadioButton getrdbtnAnglais(){
		if (this.rdbtnAnglais==null){
			this.rdbtnAnglais = new JRadioButton("Anglais");
			grouplangue.add(rdbtnAnglais);
			rdbtnAnglais.setBounds(442, 85, 77, 23);
			rdbtnAnglais.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnAnglais.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		}
		return this.rdbtnAnglais;
	}

	public JRadioButton getrdbtnFrancais(){
		if (this.rdbtnFrancais==null){
			this.rdbtnFrancais= new JRadioButton("Fran\u00E7ais");
			grouplangue.add(rdbtnFrancais);
			rdbtnFrancais.setBounds(252, 85, 83, 23);
			rdbtnFrancais.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnFrancais.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
			rdbtnFrancais.setSelected(true);
		}
		return this.rdbtnFrancais;
	}



	//autres champs et paramètres du panel
	public JButton getbtnCommencer (){
		if (this.btnCommencer==null){
			this.btnCommencer= new JButton(new ConfigAction(this.cadre,this,this.cadre.getJeu2()));
			btnCommencer.setText("COMMENCER");
			btnCommencer.setBounds(435, 520, 189, 35);
			btnCommencer.setVisible(false);
			btnCommencer.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
			btnCommencer.setBackground(new Color(107, 142, 35));
		}
		return this.btnCommencer;
	}
	
	private JTextField gettextFieldPrenom(){
		if (this.textFieldPrenom==null){
			this.textFieldPrenom= new JTextField();
			textFieldPrenom.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
			textFieldPrenom.setHorizontalAlignment(JTextField.CENTER);
			textFieldPrenom.setBounds(393, 461, 285, 30);
			textFieldPrenom.setColumns(10);
		}
		return this.textFieldPrenom;
	}
	
	public String getPrenom() {
		return textFieldPrenom.getText();
	}

	public void setPrenom(String s) {
		textFieldPrenom.setText(s);
	}
	
	
	private JButton getbouton1(){
		if (this.btnaccueil == null) {
			this.btnaccueil = new JButton(new MessagePopupAccueil(this,this.cadre,"Veux-tu vraiment retourner au menu principal ?","Retour au menu principal"));
			btnaccueil.setText("ACCUEIL");
			btnaccueil.setBounds(953, 526, 164, 45);
			btnaccueil.setBackground(new Color(255, 0, 0));
			btnaccueil.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		}
		return this.btnaccueil;
	}

	private JLabel getjLabel1() {
		if (this.imfond == null) {
			this.imfond = new JLabel();
			imfond.setBounds(0, 0, 1144, 571);
			imfond.setHorizontalAlignment(SwingConstants.TRAILING);
			imfond.setName("image_fondecran");
			imfond.setText(null);
			imfond.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "fond.png")));
		}
		return this.imfond;
	}

	private JButton getjLabel3() {
		if (this.btnson == null) {
			this.btnson = new JButton(new SoundAction(cadre));
			btnson.setBounds(1008, 21, 70, 57);
			btnson.setHorizontalAlignment(SwingConstants.CENTER);
			btnson.setName("jLabel3");
			btnson.setText(null);
			btnson.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "son.png")));
		}
		return this.btnson;
	}
}



