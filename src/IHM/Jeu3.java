package IHM;


import java.awt.Color;
import java.awt.Font;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.MessagePopupAccueil;
import model.SoundAction;
import view.PrincipalCadre;


public class Jeu3 extends JPanel {

	//attributs pour mettre les elements du panel
	private static final long serialVersionUID = 1L;
	private static final String BASE_IMG_URI = "img/";
	private PrincipalCadre cadre;
	private JLabel imfond = null;
	private JLabel imoiseau = null;
	private JButton btnson = null;
	private JLabel imbulle = null;
	private JButton btnabandonner = null;
	private JTextPane txtinstruction = null;
	private int configuration=0;
	private JPanel panelbandeau = null;
	private JLabel bandeau = null;
	private String Prenom = "";


	public Jeu3(PrincipalCadre frame)
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
		

		JList list = new JList();
		list.setInheritsPopupMenu(true);
		list.setIgnoreRepaint(true);
		list.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		list.setBackground(Color.PINK);
		list.setVisibleRowCount(20);
		list.setValueIsAdjusting(true);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"     Le lapin", "     Le chien", "     L'abeille", "     Le cheval"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(457, 414, 166, 110);
		add(list);

		JEditorPane dtrpnCartes = new JEditorPane();
		dtrpnCartes.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		dtrpnCartes.setBackground(Color.LIGHT_GRAY);
		dtrpnCartes.setForeground(Color.RED);
		dtrpnCartes.setBounds(858, 149, 251, 214);
		add(dtrpnCartes);
		
		this.add(getPanel(),null);
		this.add(gettxtpnPourUnePremiere(),null);
		this.add(getbouton1(),null);
		this.add(getjLabel3(),null);
		this.add(getjLabel2(),null);
		this.add(getjLabel4(),null);
		this.add(getjLabel1(),null);
	}

	private JPanel getPanel() {
		if (panelbandeau == null) {
			panelbandeau = new JPanel();
			panelbandeau.setBackground(new Color(255, 204, 204));
			panelbandeau.setBorder(new LineBorder(new Color(102, 0, 0), 2));
			panelbandeau.setBounds(0, 0, 434, 67);
			panelbandeau.setLayout(null);
			panelbandeau.add(getbandeau());
		}
		return panelbandeau;
	}
	
	public JLabel getbandeau(){
		if (this.bandeau == null){
			this.bandeau = new JLabel();
			bandeau.setBounds(0, 0, 434, 67);
			bandeau.setHorizontalAlignment(SwingConstants.CENTER);
			bandeau.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			bandeau.setBackground(Color.WHITE);
		}
		return this.bandeau;
	}
	
	private JButton getbouton1(){
		if (this.btnabandonner == null){
			this.btnabandonner = new JButton(new MessagePopupAccueil(this,this.cadre,"Veux-tu vraiment abandonner la partie et retourner au menu principal ?","Abandon de la partie"));
			btnabandonner.setText("ABANDONNER");
			btnabandonner.setBounds(890, 526, 227, 45);
			btnabandonner.setBackground(new Color(255, 0, 0));
			btnabandonner.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		}
		return this.btnabandonner;
	}

	private JTextPane gettxtpnPourUnePremiere() {
		if (this.txtinstruction == null) {
			this.txtinstruction = new JTextPane();
			txtinstruction.setEditable(false);
			txtinstruction.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
			txtinstruction.setText("Clique sur le nom qui correspond \u00E0 la carte ");
			txtinstruction.setBounds(165, 203, 221, 76);
		}
		return this.txtinstruction;
	}

	private JLabel getjLabel1() {
		if (this.imfond == null) {
			this.imfond = new JLabel();
			imfond.setBounds(0, 0, 1294, 571);
			imfond.setName("image_fondecran");
			imfond.setText(null);
			imfond.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "fond.png")));
		}
		return this.imfond;
	}

	private JLabel getjLabel2() {
		if (this.imoiseau == null) {
			this.imoiseau = new JLabel();
			imoiseau.setHorizontalAlignment(SwingConstants.CENTER);
			imoiseau.setBounds(20, 290, 308, 262);
			imoiseau.setName("image_oiseau");
			imoiseau.setText(null);
			imoiseau.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "oiseau.png")));
		}
		return this.imoiseau;
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

	private JLabel getjLabel4() {
		if (this.imbulle == null) {
			this.imbulle = new JLabel();
			imbulle.setHorizontalAlignment(SwingConstants.CENTER);
			imbulle.setBounds(66, 122, 399, 282);
			imbulle.setName("image_bulle");
			imbulle.setText(null);
			imbulle.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "bulle.png")));
		}
		return this.imbulle;
	}

	public int getConfiguration() {
		return configuration;
	}

	public void setConfiguration(int configuration) {
		this.configuration = configuration;
	}
	
	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
}

