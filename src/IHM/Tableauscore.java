package IHM;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import model.NextJPanelActionMenu;
import model.SoundAction;
import view.PrincipalCadre;

public class Tableauscore extends JPanel
{
	//attributs pour mettre les �l�ments du panel
	private static final String BASE_IMG_URI = "img/";
	private static final long serialVersionUID = 1L;
	private PrincipalCadre cadre;
	private JButton btnaccueil = null;
	private JComboBox choixlangue = null;
	private JLabel titrepanel = null;
	private JLabel imfond = null;
	private JLabel imchampion = null;
	private JButton btnson = null;
	private JTable tableauscore = null;


	public Tableauscore(PrincipalCadre frame)
	{
		super();
		this.cadre=frame;
		setJContentPane1();
	}


	private void setJContentPane1() {
		this.setLayout(null);
		this.setName("Tableau des scores");
		this.setBounds(0,0,1150,600);

		this.add(getcomboBox(),null);
		this.add(getTable_1(),null);
		this.add(getjLabel3(),null);
		this.add(getjLabel4(),null);
		this.add(gettitremenu(),null);
		this.add(getbouton1(),null);
		this.add(getjLabel1(),null);
	}



	private JComboBox getcomboBox() {
		if (this.choixlangue == null) {
			this.choixlangue = new JComboBox();
			choixlangue.setModel(new DefaultComboBoxModel(new String[] {"Fran\u00E7ais", "Anglais", "Allemand ", "Arabe"}));
			choixlangue.setToolTipText("");
			choixlangue.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 13));
			choixlangue.setPreferredSize(new Dimension(50, 20));
			choixlangue.setBounds(507, 140, 242, 30);
		}
		return this.choixlangue;
	}

	private JLabel gettitremenu() {
		if (this.titrepanel == null) {
			this.titrepanel = new JLabel();
			titrepanel.setForeground(Color.BLACK);
			titrepanel.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
			titrepanel.setHorizontalAlignment(SwingConstants.TRAILING);
			titrepanel.setBounds(404,21,467,57);
			titrepanel.setText("TABLEAU DES SCORES");
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
			imfond.setName("image_fondecran"
					+ "");
			imfond.setText(null);
			imfond.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "fond.png")));
		}
		return this.imfond;
	}

	private JLabel getjLabel4() {
		if (this.imchampion == null) {
			this.imchampion = new JLabel();
			imchampion.setHorizontalAlignment(SwingConstants.CENTER);
			imchampion.setBounds(32, 11, 237, 241);
			imchampion.setName("image_champion");
			imchampion.setText(null);
			imchampion.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "champion.png")));
		}
		return this.imchampion;
	}

	private JButton getjLabel3() {
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

	private JTable getTable_1() {
		if (tableauscore == null) {
			tableauscore = new JTable();
			tableauscore.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
			tableauscore.setGridColor(Color.DARK_GRAY);
			tableauscore.setForeground(Color.BLACK);
			tableauscore.setRowHeight(50);
			tableauscore.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			tableauscore.setColumnSelectionAllowed(true);
			tableauscore.setCellSelectionEnabled(true);
			tableauscore.setToolTipText("");
			tableauscore.setFillsViewportHeight(true);
			tableauscore.setSurrendersFocusOnKeystroke(true);
			tableauscore.setModel(new DefaultTableModel(
					new Object[][] {
							{null, "    CLASSEMENT", "    NOM", "    THEME", "    TEMPS", "    DATE"},
							{"   FACILE", "", null, null, null, null},
							{"   MOYEN", "", null, null, null, null},
							{"   DIFFICILE", null, null, null, null, null},
					},
					new String[] {
							"New column", "New column", "New column", "New column", "New column", "New column"
					}
					));
			tableauscore.getColumnModel().getColumn(0).setPreferredWidth(200);
			tableauscore.getColumnModel().getColumn(0).setMinWidth(200);
			tableauscore.getColumnModel().getColumn(1).setPreferredWidth(172);
			tableauscore.getColumnModel().getColumn(1).setMinWidth(100);
			tableauscore.getColumnModel().getColumn(1).setMaxWidth(3000);
			tableauscore.getColumnModel().getColumn(2).setPreferredWidth(172);
			tableauscore.getColumnModel().getColumn(2).setMinWidth(100);
			tableauscore.getColumnModel().getColumn(2).setMaxWidth(3000);
			tableauscore.getColumnModel().getColumn(3).setPreferredWidth(172);
			tableauscore.getColumnModel().getColumn(3).setMinWidth(100);
			tableauscore.getColumnModel().getColumn(3).setMaxWidth(3000);
			tableauscore.getColumnModel().getColumn(4).setPreferredWidth(172);
			tableauscore.getColumnModel().getColumn(4).setMinWidth(100);
			tableauscore.getColumnModel().getColumn(4).setMaxWidth(3000);
			tableauscore.getColumnModel().getColumn(5).setPreferredWidth(172);
			tableauscore.getColumnModel().getColumn(5).setMinWidth(100);
			tableauscore.getColumnModel().getColumn(5).setMaxWidth(3000);
			tableauscore.setBounds(0, 263, 1122, 200);
		}
		return tableauscore;
	}
}