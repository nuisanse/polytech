package IHM;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import model.NextJPanelActionMenu;
import model.SoundAction;
import view.PrincipalCadre;


public class Catalogue extends JPanel{	


	//attributs pour mettre les elements du panel
	private static final String BASE_IMG_URI = "img/";
	private static final long serialVersionUID = 1L;
	private PrincipalCadre cadre;
	private JButton btnaccueil = null;
	private JComboBox choixtheme = null;
	private JLabel titrepanel = null;
	private JLabel imfond = null;
	private JButton btnson = null;
	private JTable tablecatalogue = null;
	private JLabel imbanane = null;


	public Catalogue(PrincipalCadre frame)
	{
		super();
		this.cadre=frame;
		setJContentPane1();
	}


	private void setJContentPane1() {
		this.setLayout(null);
		this.setName("Catalogue des mots");
		this.setBounds(0,0,1150,600);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setRequestFocusEnabled(true);
		scrollBar.setValueIsAdjusting(true);
		scrollBar.setValue(1);
		scrollBar.setMaximum(150);
		scrollBar.setBlockIncrement(20);
		scrollBar.setBackground(Color.PINK);
		scrollBar.setBounds(903, 294, 17, 257);
		add(scrollBar);

		this.add(getTable_1_1(),null);
		this.add(getcomboBox_1(),null);	
		this.add(getjLabel3(),null);
		this.add(gettitremenu(),null);
		this.add(getbouton1(),null);
		this.add(getjLabel1(),null);
		this.add(getLabel(),null);
	}

	private JComboBox getcomboBox_1(){
		if (this.choixtheme == null) {
			this.choixtheme = new JComboBox();
			choixtheme.setModel(new DefaultComboBoxModel(new String[] {"\tAnimaux", "\tCorps Humain", "\tNourriture"}));
			choixtheme.setToolTipText("");
			choixtheme.setPreferredSize(new Dimension(50, 20));
			choixtheme.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 13));
			choixtheme.setBounds(391, 148, 242, 30);
		}
		return this.choixtheme;
	}

	private JLabel gettitremenu() {
		if (this.titrepanel == null) {
			this.titrepanel = new JLabel();
			titrepanel.setForeground(Color.BLACK);
			titrepanel.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
			titrepanel.setHorizontalAlignment(SwingConstants.TRAILING);
			titrepanel.setBounds(378,21,481,57);
			titrepanel.setText("CATALOGUE DES MOTS");
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
			btnson.setHorizontalAlignment(SwingConstants.CENTER);
			btnson.setBounds(1008, 21, 70, 57);
			btnson.setName("bouton_son");
			btnson.setText(null);
			btnson.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "son.png")));
		}
		return this.btnson;
	}


	private JTable getTable_1_1() {
		if (tablecatalogue == null) {
			tablecatalogue = new JTable();
			tablecatalogue.setColumnSelectionAllowed(true);
			tablecatalogue.setRowHeight(100);
			tablecatalogue.setBounds(new Rectangle(0, 0, 0, 20));
			tablecatalogue.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
			tablecatalogue.setBorder(new LineBorder(new Color(0, 0, 0)));
			tablecatalogue.setSelectionBackground(Color.BLACK);
			tablecatalogue.setGridColor(Color.BLACK);
			tablecatalogue.setForeground(Color.BLACK);
			tablecatalogue.setBackground(Color.WHITE);
			tablecatalogue.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			tablecatalogue.setCellSelectionEnabled(true);
			tablecatalogue.setAutoCreateRowSorter(true);
			tablecatalogue.setModel(new DefaultTableModel(
					new Object[][] {
							{"  IMAGES", "  FRANCAIS", "  ANGLAIS", "  ALLEMAND", "  ARABE"},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
					},
					new String[] {
							"New column", "New column", "New column", "New column", "New column"
					}
					));
			tablecatalogue.getColumnModel().getColumn(0).setPreferredWidth(155);
			tablecatalogue.getColumnModel().getColumn(0).setMinWidth(101);
			tablecatalogue.getColumnModel().getColumn(1).setPreferredWidth(146);
			tablecatalogue.getColumnModel().getColumn(1).setMinWidth(78);
			tablecatalogue.getColumnModel().getColumn(1).setMaxWidth(30000);
			tablecatalogue.getColumnModel().getColumn(2).setPreferredWidth(100);
			tablecatalogue.getColumnModel().getColumn(2).setMinWidth(72);
			tablecatalogue.getColumnModel().getColumn(3).setPreferredWidth(100);
			tablecatalogue.getColumnModel().getColumn(3).setMinWidth(72);
			tablecatalogue.getColumnModel().getColumn(4).setPreferredWidth(100);
			tablecatalogue.getColumnModel().getColumn(4).setMinWidth(72);
			tablecatalogue.setBounds(68, 199, 852, 352);
		}
		return tablecatalogue;
	}
	private JLabel getLabel() {
		if (imbanane == null) {
			imbanane = new JLabel("");
			imbanane.setBounds(76, 318, 200, 50);
			//imbanane.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "banana-hi.png")));
		}
		return imbanane;
	}
}
