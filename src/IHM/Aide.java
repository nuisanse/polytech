package IHM;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import model.NextJPanelActionMenu;
import model.SoundAction;
import view.PrincipalCadre;

public class Aide extends JPanel 
{
	//attributs pour mettre les elements du panel
	private static final String BASE_IMG_URI = "img/";
	private static final long serialVersionUID = 1L;
	private JButton btnaccueil = null;
	private JButton btnbutjeu = null;
	private JButton btncmtjouer = null;
	private JButton btnexplication = null;
	private PrincipalCadre cadre;
	private JTextPane txtButJeu = null;
	private JTextPane txtExplication = null;
	private JScrollPane scrollPaneCmtJouer = null;
	private JTextPane txtCmtJouer = null;
	private JLabel imfond = null;
	private JLabel titrepanel = null;
	private JButton btnson = null;
	private JLabel imobjectif = null;
	private JLabel immanette = null;
	private JLabel imclassement = null;
	

	
	public Aide(PrincipalCadre frame)
	{
		super();
		this.cadre=frame;
		this.setJContentPane1();
	}

	
	private void setJContentPane1() {
		this.setLayout(null);
		this.setName("Aide");
		this.setBounds(0,0,1150,600);
		
		this.add(getscrollPaneCmtJouer(),null);
		this.add(gettxtExplication(),null);
		this.add(getjLabel2(),null);
		this.add(gettxtButJeu(),null);
		this.add(getbouton4(),null);
		this.add(getbouton3(),null);
		this.add(getbouton2(),null);
		this.add(getbouton1(),null);
			
		this.add(getjLabel3(),null);
		this.add(getjLabel5(),null);
		this.add(getjLabel6(),null);
		this.add(getjLabel4(),null);
		this.add(getjLabel1(),null);
		
		gettxtExplication().setVisible(false);
		getscrollPaneCmtJouer().setVisible(false);
	}
	
	private JButton getbouton1() {
		if (this.btnaccueil == null) {
			this.btnaccueil = new JButton(new NextJPanelActionMenu(this, cadre));
			this.btnaccueil.setText("ACCUEIL");
			this.btnaccueil.setBounds(953, 526, 164, 45);
			this.btnaccueil.setBackground(new Color(255, 0, 0));
			this.btnaccueil.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		}
		return this.btnaccueil;
	}
	
	
	private JButton getbouton2() {
		if (this.btnbutjeu == null) {
			this.btnbutjeu = new JButton("But du jeu");
			btnbutjeu.setBounds(280, 112, 186, 57);
			btnbutjeu.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					txtButJeu.setVisible(true);
					txtCmtJouer.setVisible(false);
					scrollPaneCmtJouer.setVisible(false);
					txtExplication.setVisible(false);
				}
		});
		btnbutjeu.setBackground(new Color(0, 128, 0));
		btnbutjeu.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		}
		return this.btnbutjeu;
	}
	
	private JButton getbouton3() {
		if (this.btncmtjouer == null) {
			this.btncmtjouer = new JButton("Comment jouer ?");
			btncmtjouer.setBounds(272, 256, 209, 57);
			btncmtjouer.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					txtCmtJouer.setVisible(true);
					scrollPaneCmtJouer.setVisible(true);
					txtButJeu.setVisible(false); 
					txtExplication.setVisible(false);
				}
			});
	btncmtjouer.setBackground(new Color(0, 128, 0));
	btncmtjouer.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		}
		return this.btncmtjouer;
	}
	
	private JButton getbouton4() {
		if (this.btnexplication == null) {
			this.btnexplication = new JButton("Explication du classement");
			btnexplication.setBounds(238, 403, 273, 57);
			btnexplication.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					txtExplication.setVisible(true);
					txtButJeu.setVisible(false);
					txtCmtJouer.setVisible(false);
					scrollPaneCmtJouer.setVisible(false);
				}
			});
	btnexplication.setBackground(new Color(0, 128, 0));
	btnexplication.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		}
		return this.btnexplication;
	}
	
	private final JTextPane gettxtButJeu() {
		if (this.txtButJeu == null) {
			this.txtButJeu = new JTextPane();
			txtButJeu.setBounds(537, 135, 461, 282);
			txtButJeu.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
			txtButJeu.setText("\t\t\t\t\t\t\t\t       But du jeu\r\n\r\n\r\nApprendre et m\u00E9moriser du vocabulaire dans quatre langues diff\u00E9rentes :\r\n-\tFran\u00E7ais\r\n-\tAnglais\r\n-\tAllemand\r\n-\tArabe\r\n\r\nCe jeu est accessible d\u00E8s l\u2019\u00E2ge de 7 ans.\r\n");
		}
		return this.txtButJeu;
	}
	
	private final JTextPane gettxtExplication() {
		if (this.txtExplication  == null) {
			this.txtExplication = new JTextPane();
			txtExplication.setText("\t\tExplication du classement\r\n\r\n\r\nLe classement se pr\u00E9sente sous forme d\u2019un tableau qui classe chaque partie selon le temps mis \u00E0 nommer toutes les cartes. Plus tu es rapide, meilleur est ton classement ! (Yeah !)\r\nLes scores sont rang\u00E9s selon la langue d\u2019apprentissage puis en fonction de chaque niveau de difficult\u00E9.");
			txtExplication.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
			txtExplication.setBounds(540, 218, 461, 211);
			txtExplication.setVisible(true);
		}
		return this.txtExplication ;
	}
	
	private final JScrollPane getscrollPaneCmtJouer() {
		if (this.scrollPaneCmtJouer  == null) {
			this.scrollPaneCmtJouer = new JScrollPane();
			scrollPaneCmtJouer.setEnabled(false);
			scrollPaneCmtJouer.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPaneCmtJouer.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPaneCmtJouer.setBounds(537, 89, 461, 423);
			txtCmtJouer = new JTextPane();
			txtCmtJouer.setText("\t\tComment jouer ?\r\n\r\n\r\nAvant le d\u00E9but de chaque partie, tu devras indiquer :\r\n-\tLa langue que tu souhaites apprendre\r\n-\tLe th\u00E8me \u00E0 m\u00E9moriser (animaux, corps humain ou nourriture)\r\n-\tLa difficult\u00E9 (facile, moyen ou difficile)\r\n-\tTon pr\u00E9nom pour retrouver ton classement\r\n\r\nSuivant le niveau de difficult\u00E9 choisi, tu auras un certain nombre de cartes qui apparaitront \u00E0 l\u2019\u00E9cran. \r\nTu devras retenir le nom correspondant \u00E0 chaque carte en 60 secondes car apr\u00E8s pouf ! les cartes disparaitront  =O\r\nEnsuite on te pr\u00E9sentera les m\u00EAmes cartes, une par une, et sans leur nom. Tu devras retrouver le nom associ\u00E9 \u00E0 chaque carte dans la liste de mots propos\u00E9s en cliquant sur le bon mot.\r\nATTENTION !! la liste de mots peut contenir des pi\u00E8ges  ;)\r\n\r\nTon classement d\u00E9pendra du temps mis pour retrouver le nom de toutes les cartes. A chaque erreur commise, tu recevras une p\u00E9nalit\u00E9 de 3 secondes. Leur cumul appara\u00EEtra qu\u2019\u00E0 la fin de la partie. Ton score est automatiquement enregistr\u00E9 dans le tableau des scores \u00E0 la fin d\u2019une partie.\r\n");
			txtCmtJouer.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
			txtCmtJouer.setVisible(false);
			scrollPaneCmtJouer.setVisible(false);
			scrollPaneCmtJouer.setViewportView(txtCmtJouer);
		}
		return this.scrollPaneCmtJouer ;
	}
	
	private JLabel getjLabel2() {
		if (this.titrepanel == null) {
			this.titrepanel = new JLabel("Aide");
			titrepanel.setHorizontalAlignment(SwingConstants.CENTER);
			titrepanel.setFont(new Font("Comic Sans MS", Font.PLAIN, 44));
			titrepanel.setBounds(540, 21, 192, 57);
		}
		return this.titrepanel;
	}
	
	private JLabel getjLabel1() {
		if (this.imfond == null) {
			this.imfond = new JLabel();
			imfond.setHorizontalAlignment(SwingConstants.TRAILING);
			imfond.setBounds(0, 0, 1144, 571);
			imfond.setName("image_fondecran");
			imfond.setText(null);
			imfond.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "fond.png")));
		}
		return this.imfond;
	}
	
	public JButton getjLabel3() {
		if (this.btnson == null) {
			this.btnson = new JButton(new SoundAction(cadre));
			btnson.setBounds(1008, 21, 70, 57);
			btnson.setHorizontalAlignment(SwingConstants.CENTER);
			btnson.setName("bouton_son");
			btnson.setText(null);
			btnson.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "son.png")));
		}
		return this.btnson;
	}
	
	private JLabel getjLabel4() {
		if (this.imobjectif == null) {
			this.imobjectif = new JLabel();
			imobjectif.setBounds(44, 90, 133, 109);
			imobjectif.setHorizontalAlignment(SwingConstants.CENTER);
			imobjectif.setName("image_objectif");
			imobjectif.setText(null);
			imobjectif.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "objectif.png")));
		}
		return this.imobjectif;
	}
	
	private JLabel getjLabel5() {
		if (this.immanette == null) {
			this.immanette = new JLabel();
			immanette.setBounds(58, 237, 119, 109);
			immanette.setOpaque(false);
			immanette.setBackground(new Color(0, 0, 0));
			immanette.setHorizontalAlignment(SwingConstants.CENTER);
			immanette.setName("image_manette");
			immanette.setText(null);
			immanette.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "manette1.png")));
		}
		return this.immanette;
	}
	
	private JLabel getjLabel6() {
		if (this.imclassement == null) {
			this.imclassement = new JLabel();
			imclassement.setBounds(44, 380, 144, 127);
			imclassement.setHorizontalAlignment(SwingConstants.CENTER);
			imclassement.setName("image_classement");
			imclassement.setText(null);
			imclassement.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "classement.png")));
		}
		return this.imclassement;
	}
}

	
	
	



