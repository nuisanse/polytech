package IHM;


import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import model.NextJPanelActionJeu;
import model.NextJPanelActionMenu;
import model.NextJPanelActionTableauscore;
import model.SoundAction;
import view.PrincipalCadre;


public class FinJeu extends JPanel{

	//attributs pour mettre les elements du panel
	private static final String BASE_IMG_URI = "img/";
	private static final long serialVersionUID = 1L;
	private PrincipalCadre cadre;
	private JButton btnaccueil = null;
	private JLabel titrepanel = null;
	private JLabel imfond = null;
	private JLabel imoiseau = null;
	private JLabel imbulle = null;
	private JButton btnson = null;
	private JTable tableauscore = null;
	private JButton btnTableauscore = null;
	private JButton btnRejouer = null;
	

	public FinJeu(PrincipalCadre frame)
	{
		super();
		this.cadre=frame;
		setJContentPane1();
	}


	private void setJContentPane1() {
		this.setLayout(null);
		this.setName("Tableau des scores");
		this.setBounds(0,0,1150,600);

		JTextArea txtrVaVoir = new JTextArea();
		txtrVaVoir.setEditable(false);
		txtrVaVoir.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		txtrVaVoir.setText("VA VOIR LE TABLEAU DES SCORES\r\nPOUR CONNAITRE TON CLASSEMENT !!");
		txtrVaVoir.setBounds(104, 227, 315, 57);
		add(txtrVaVoir);

		this.add(getbtnRejouer(),null);
		this.add(getbtnTableauscore(),null);
		this.add(gettablescore(),null);
		this.add(getjLabel3(),null);
		this.add(getjLabel4(),null);
		this.add(getjLabel5(),null);
		this.add(gettitremenu(),null);
		this.add(getbouton1(),null);
		this.add(getjLabel1(),null);
	}

	
	private JTable gettablescore(){
		if (this.tableauscore == null){
			this.tableauscore= new JTable();
			tableauscore.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			tableauscore.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 13));
			tableauscore.setRowHeight(50);
			tableauscore.setModel(new DefaultTableModel(
				new Object[][] {
					{"CLASSEMENT", "       NOM", "  TEMPS", "  LANGUE", "  THEME", "  NIVEAU"},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
			tableauscore.getColumnModel().getColumn(0).setPreferredWidth(76);
			tableauscore.getColumnModel().getColumn(1).setPreferredWidth(105);
			tableauscore.getColumnModel().getColumn(1).setMinWidth(71);
			tableauscore.getColumnModel().getColumn(2).setPreferredWidth(73);
			tableauscore.getColumnModel().getColumn(2).setMinWidth(73);
			tableauscore.getColumnModel().getColumn(3).setPreferredWidth(82);
			tableauscore.getColumnModel().getColumn(3).setMinWidth(73);
			tableauscore.getColumnModel().getColumn(4).setPreferredWidth(90);
			tableauscore.getColumnModel().getColumn(4).setMinWidth(72);
			tableauscore.getColumnModel().getColumn(5).setPreferredWidth(80);
			tableauscore.getColumnModel().getColumn(5).setMinWidth(75);
			tableauscore.setBounds(466, 140, 674, 250);
		}
		return this.tableauscore;
	}


	private JLabel gettitremenu() {
		if (this.titrepanel == null) {
			this.titrepanel = new JLabel();
			titrepanel.setForeground(Color.BLACK);
			titrepanel.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
			titrepanel.setHorizontalAlignment(SwingConstants.TRAILING);
			titrepanel.setBounds(325,21,369,57);
			titrepanel.setText("FIN DE LA PARTIE");
		}
		return this.titrepanel;
	}

	private JButton getbouton1() {
		if (this.btnaccueil == null) {
			this.btnaccueil = new JButton(new NextJPanelActionMenu(this,cadre));
			btnaccueil.setText("ACCUEIL");
			btnaccueil.setBackground(new Color(255, 0, 0));
			btnaccueil.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
			btnaccueil.setBounds(953, 526, 164, 45);
		}
		return this.btnaccueil;
	}

	private JButton getbtnRejouer(){
		if (this.btnRejouer == null){
			this.btnRejouer= new JButton(new NextJPanelActionJeu(this,cadre));
			btnRejouer.setText("REJOUER");
			btnRejouer.setBackground(new Color(255, 153, 0));
			btnRejouer.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
			btnRejouer.setBounds(561, 525, 170, 46);
		}
		return this.btnRejouer;
	}

	private JButton getbtnTableauscore(){
		if (this.btnTableauscore==null){
			this.btnTableauscore = new JButton(new NextJPanelActionTableauscore(this,cadre));
			btnTableauscore.setText("Tableau des scores");
			btnTableauscore.setBackground(new Color(102, 204, 51));
			btnTableauscore.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
			btnTableauscore.setBounds(737, 465, 217, 45);
		}
		return this.btnTableauscore;
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

	private JLabel getjLabel4() {
		if (this.imoiseau == null) {
			this.imoiseau = new JLabel();
			imoiseau.setHorizontalAlignment(SwingConstants.CENTER);
			imoiseau.setBounds(10, 298, 300, 250);
			imoiseau.setName("image_oiseau");
			imoiseau.setText(null);
			imoiseau.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "oiseau.png")));
		}
		return this.imoiseau;
	}

	private JLabel getjLabel5() {
		if (this.imbulle == null) {
			this.imbulle = new JLabel();
			imbulle.setHorizontalAlignment(SwingConstants.CENTER);
			imbulle.setBounds(60, 141, 400, 279);
			imbulle.setName("image_bulle");
			imbulle.setText(null);
			imbulle.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "bulle.png")));
		}
		return this.imbulle;
	}

	public JButton getjLabel3() {
		if (this.btnson == null) {
			this.btnson = new JButton(new SoundAction(cadre));
			btnson.setHorizontalAlignment(SwingConstants.CENTER);
			btnson.setBounds(1008, 21, 70, 57);
			btnson.setName("bouton_son");
			btnson.setText(null);
			btnson.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "son.png")));
		}
		return this.btnson;
	}
}
