package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import view.PrincipalCadre;


public class Chronometre extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static Thread thread;
	private Timer tm = new Timer(1000,this);
	private int time = 60;
	private JPanel panel;
	private JPanel panel1;
	private PrincipalCadre cadre;


	public Chronometre(PrincipalCadre cadre, JPanel panel, JPanel panel1) throws InterruptedException
	{
		this.cadre=cadre;
		this.panel=panel;
		this.panel1=panel1;
		tm.start();
	}

	public void logic(){
		time--;
		this.cadre.getJeu2().settime("Temps restant : "+time+"s");
	}

	public void actionPerformed (ActionEvent e){
		logic();
		if(time==0){
			tm.stop();
			time=60;
			this.cadre.getJeu2().setVisible(false);
			this.cadre.getJeu3().setVisible(true);
		}
		this.cadre.repaint();
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}



