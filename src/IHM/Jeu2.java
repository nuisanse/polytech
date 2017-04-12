package IHM;


import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.MessagePopupAccueil;
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
	private JLabel titrepanel = null;
	private JTextPane txtinstruction = null;
	private JLabel bandeau = null;
	private String Prenom = "papiJeu2";
	private JPanel panelbandeau = null;
	
	private boolean gg = true;
	private boolean continuer = true;
	/* Il faut remplir ces variables */
	private int difficulte = 0;
	private String theme = "Nourriture";
	private String langue = "Allemand";

	public Jeu2(PrincipalCadre frame)
	{
		super();
		this.cadre=frame;
		setJContentPane1();
		run();
	}
/* Voici le jeu:
 * On crée une classe carte contenant l'image de la carte et son nom et on implemente une methode test d'egalité
 * On crée un 3 ArrayList par theme de carte dans PrincipaleCadre contenant toutes les cartes du jeu
 * Selon la difficulté, on crée un tableau de taille "difficulté
 * on tire aléatoirement des indices et on rempli le tableau à partir de l'arraylist de principale cadre selon le theme choisi
 * on affiche ce tableau et on fait une copie anonyme du tableau
 * pour chaque carte on affiche la carte et un mot
 * 
 * après une minute, on tire aleatoirement des indices, on forme un nouveau arraylist
 * et on affiche les images correspondantes de cet array liste.
 * on affiche les noms de ces images dans la langue chosis de façon desordonné
 * le joueur fait son choix, qu'on enregistre dans un nouveau arraylist
 * on teste si l'egalité entre l'arraylist du joueur et du dernier arraylist sont correcte
 * si oui le joueur a gagné sinon non
 * on lui demande s'il veut rejouer
 **/

	private void run()
	{	
		Random r = new Random();
		ArrayList<Integer> nbrTiree = new ArrayList<Integer>();
		ArrayList<Carte> listedetheme = new ArrayList<Carte>(cadre.listeTheme(this.theme));
		ArrayList<String> listedemot = new ArrayList<String>(cadre.listeDico(this.langue));
		int valeur = 0;
		ArrayList<Carte> listeCartes = new ArrayList<Carte>();
		for(int i = 0; i < this.difficulte; i++)
		{
			/* Tirer aleatoirement un nombre entre 0 et 11*/
			while(nbrTiree.contains(valeur))
			{
				valeur = r.nextInt(11);
			}
			nbrTiree.add(valeur);
			listeCartes.add(listedetheme.get(valeur));
		}
		
		/* Implementation d'un bouton commencer qui quand on appuis deçu start devient true et on sort de la boucle */
		// affichage du tableau listeCartes pendant 1 minutes
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/* On fait disparaitre les mots et les cartes */
		
		String[] reponses = new String[4];
		
		/* On affiche sequentiellement les cartes */
		for(int i = 0; i < this.difficulte; i++)
		{
			// Affichage de listeCartes.get(i).imgano
			valeur = r.nextInt(3);
			nbrTiree.clear();
			for(int j = 0; j < 4; j++)
			{
				int valeur2 = r.nextInt(11);
				while(nbrTiree.contains(valeur2)) // a debuger
				{
					valeur2 = r.nextInt(11);
				}
				nbrTiree.add(valeur2);
				if(j == valeur)
					reponses[valeur] = new String(listeCartes.get(i).toString(this.langue));
				else
				{
					reponses[j] = listedemot.get(valeur2);
				}
			}
			
			/* Creation de bouton radio groupé a partir de listedemot */
			/* Affichage du bouton ok */
			/* On associe au bouton ok l'action de mettre continuer a false */
			while(continuer)
			{
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			continuer = true;			
		}
		
		/* On tire aléatoirement des positions pour les cartes */
		listeCartes.clear();
		nbrTiree.clear();
		for(int i = 0; i < this.difficulte; i++)
		{
			/* Tirer aleatoirement un nombre entre 0 et 8*/
			while(nbrTiree.contains(valeur))
			{
				valeur = r.nextInt(8);
			}
			nbrTiree.add(valeur);
			listeCartes.add(listedetheme.get(valeur));
		}
		
		// On affiche les images des cartes séparemement avec leur nom et on demande au joueur de choisir
		// On stock le choix du joueur dans ce tableau grace au bouton radio ou nimporte:
		ArrayList<Carte> choixJoueur = new ArrayList<Carte>();
		// Merci de gerer ça aussi
		
		/* On compare le choix du joueur avec le tableau affiché */
		for(int i = 0; i < this.difficulte; i++)
		{
			if(!choixJoueur.get(i).egale(listeCartes.get(i),this.langue))
			{
				gg = false;
				break;
			}
		}
		
		/* si gg = false le joueur a perdu sinon il a gagné */
		
	}
	
	
	private void setJContentPane1()
	{
		this.setBounds(0,0,1150,600);
		this.setName("Menu");
		this.setLayout(null);
		
		this.add(getPanel(),null);
		this.add(gettitremenu(),null);
		this.add(gettxtpnPourUnePremiere(),null);
		this.add(getbouton1(),null);
		this.add(getjLabel3(),null);
		this.add(getjLabel2(),null);
		this.add(getjLabel4(),null);
		this.add(getjLabel1(),null);
		
	}
/*La m�thode nextInt() de la classe Random permet de g�n�rer un entier al�atoire compris
 * entre 0 inclus et l'entier pass� en param�tre exclus. En ajoutant 1 et en enlevant le minimum
 * dans l'entier en param�tre, puis en ajoutant le nombre minimum au r�sultat, on arrive � obtenir
 * un nombre al�atoire compris entre les deux valeurs:
Random rand = new Random();
int nombreAleatoire = rand.nextInt(max - min + 1) + min;*/
	

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

	private JLabel gettitremenu(){
		if (this.titrepanel == null){
			this.titrepanel = new JLabel();
			titrepanel.setBounds(515,21,81,57);
			titrepanel.setForeground(Color.BLACK);
			titrepanel.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
			titrepanel.setHorizontalAlignment(SwingConstants.TRAILING);
			titrepanel.setText("JEU");
		}
		return this.titrepanel;
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
}
