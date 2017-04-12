package IHM;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Carte {
	
	public Image imgar = null;
	public Image imgfr = null;
	public Image imgang = null;
	public Image imgal = null;
	public Image imgano = null;
	
	public String nomfr = null;
	public String nomang = null;
	public String nomar = null;
	public String nomal = null;
	
	public Carte(String imgar, String imgfr, String imgang, String imgal, String imgano, String nomfr, String nomang, String nomar, String nomal)
	{
		try{
			this.imgfr = ImageIO.read(new File(imgfr));
			this.imgar = ImageIO.read(new File(imgar));
			this.imgang = ImageIO.read(new File(imgang));
			this.imgal = ImageIO.read(new File(imgal));
			this.imgano = ImageIO.read(new File(imgano));
		} catch(IOException e) {
			e.printStackTrace();
		}
		this.nomfr = new String(nomfr);
		this.nomang = new String(nomang);
		this.nomar = new String(nomar);
		this.nomal = new String(nomal);
	}
	
	public boolean egale(Carte carte, String langue)
	{
		if(langue.equals("Arabe"))
			return nomar.equals(carte.nomar);
		else if(langue.equals("Allemand"))
			return nomal.equals(carte.nomar);
		else if(langue.equals("Anglais"))
			return nomang.equals(carte.nomang);
		else
			return nomfr.equals(carte.nomfr);
	}
	
	public String toString(String langue)
	{
		if(langue.equals("Arabe"))
			return this.nomar;
		else if(langue.equals("Allemand"))
			return this.nomal;
		else if(langue.equals("Anglais"))
			return this.nomang;
		else
			return this.nomfr;
	}

}
