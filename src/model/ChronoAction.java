package model;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JLabel;
import javax.swing.Timer;

import view.PrincipalCadre;

public class ChronoAction extends AbstractAction{
	private static final long serialVersionUID = 1L;
	private Timer tm;
	private int time = 0;
	private PrincipalCadre cadre;
	private JLabel lb;
	
	public ChronoAction(PrincipalCadre cadre, Timer tm, JLabel lb){
		this.cadre=cadre;
		this.tm=tm;
		this.lb=lb;
		tm.start();
	}
	
	public void logic(){
		//while ()
		setTime(getTime() + 1);
		lb.setText(""+time);
	}
	
	public void actionPerformed(ActionEvent e){
		logic();
		//repaint();
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Timer getTimer() {
		return tm;
	}

	public void setTimer(Timer tm) {
		this.tm = tm;
	}
	
	
}
