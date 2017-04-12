package model;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Chronometre {
	private static Thread thread;
	private Timer tm;
	private JPanel panel;
	private JLabel lb;
	
	
	public Chronometre(JPanel panel) throws InterruptedException
	{
		this.panel=panel;
		int i=0;
		thread = new Thread();
		for (i=60;i>=0;i--)
		{
			Thread.sleep(1000);
			lb.setText(""+i);
		}
	}
	
	
	
	
	
}

