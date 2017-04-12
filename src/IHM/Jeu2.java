package IHM;


import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.Chronometre;
import model.MessagePopupAccueil;
import model.NextJPanelAction;
import model.SoundAction;
import view.PrincipalCadre;


public class Jeu2 extends JPanel{

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
	private JLabel bandeau = null;
	private String Prenom = "";
	private JPanel panelbandeau = null;
	//private Chronometre chrono = null;
	private JLabel time = null;
	private String langue = null;
	private String theme = null;
	private String difficulte = null;
	private Thread thread = null;
	

	public Jeu2(PrincipalCadre frame)
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(626, 42, 89, 25);
		//add(lblNewLabel);
		
		JButton btnNewButton = new JButton(new NextJPanelAction(this,this.cadre.getJeu3()));
		btnNewButton.setText("NEXT");
		btnNewButton.setBounds(657, 359, 89, 23);
		add(btnNewButton);
		
		//this.add(getchrono(),null);
		this.add(getPanel(),null);
		this.add(gettime(),null);
		this.add(gettxtpnPourUnePremiere(),null);
		this.add(getbouton1(),null);
		this.add(getjLabel3(),null);
		this.add(getjLabel2(),null);
		this.add(getjLabel4(),null);
		this.add(getjLabel1(),null);
		
	}
/*La méthode nextInt() de la classe Random permet de générer un entier aléatoire compris
 * entre 0 inclus et l'entier passé en paramètre exclus. En ajoutant 1 et en enlevant le minimum
 * dans l'entier en paramètre, puis en ajoutant le nombre minimum au résultat, on arrive à obtenir
 * un nombre aléatoire compris entre les deux valeurs:
Random rand = new Random();
int nombreAleatoire = rand.nextInt(max - min + 1) + min;*/
	
	
	/*public Chronometre getchrono() throws InterruptedException{
		if (chrono==null){
			chrono=new Chronometre(this.cadre,this,this.cadre.getJeu3());
		}
		return chrono;
	}*/
	
	
	public void affichechrono() throws InterruptedException{
		int i;
		thread = new Thread();
		for (i=60;i>=0;i--)
		{
			Thread.sleep(1000);
			this.cadre.getJeu2().settime("Temps restant : "+Integer.toString(i)+"s");
		}
		this.cadre.getJeu2().setVisible(false);
		this.cadre.getJeu3().setVisible(true);
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
	
	public JLabel gettime(){
		if (this.time==null){
			time= new JLabel("CHRONO");
			time.setBounds(626, 42, 500, 100);
			time.setHorizontalAlignment(SwingConstants.CENTER);
			time.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			time.setBackground(Color.WHITE);
			time.setVisible(false);
		}
		return this.time;
	}
	
	public void settime(String s){
		this.time.setText(s);
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
			txtinstruction.setText("M\u00E9morise le nom de chaque carte avant la fin du temps");
			txtinstruction.setBounds(144, 191, 290, 77);
		}
		return this.txtinstruction;
	}


	private JLabel getjLabel1() {
		if (this.imfond == null) {
			this.imfond = new JLabel();
			imfond.setBounds(0, 0, 1144, 571);
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
			imoiseau.setBounds(10, 293, 308, 262);
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
			imbulle.setBounds(73, 114, 400, 279);
			imbulle.setName("image_bulle");
			imbulle.setText(null);
			imbulle.setIcon(new ImageIcon(getClass().getClassLoader().getResource(BASE_IMG_URI + "bulle.png")));
		}
		return this.imbulle;
	}


	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}


	public String getLangue() {
		return langue;
	}


	public void setLangue(String langue) {
		this.langue = langue;
	}


	public String getTheme() {
		return theme;
	}


	public void setTheme(String theme) {
		this.theme = theme;
	}


	public String getDifficulte() {
		return difficulte;
	}


	public void setDifficulte(String difficulte) {
		this.difficulte = difficulte;
	}
}
