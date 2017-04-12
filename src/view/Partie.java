package view;

public class Partie {

	
	public String nom = null;
	public String langue = null;
	public String theme = null;
	public String difficulte = null;
	
	public Partie()
	{

	}
	
	public Partie(String nom, String langue, String theme, String difficulte)
	{
		this.nom = new String(nom);
		this.langue = new String(langue);
		this.theme = new String(theme);
		this.difficulte = new String(difficulte);
	}
	
}
