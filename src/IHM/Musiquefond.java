package IHM;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Musiquefond {
	public static Clip clip;
	static final int LOOP_CONTINUOUSLY=1000;

	
	public void playSound(){
		try{
			if(clip==null){
				File file = new File("BananaPancakes.wav");
				clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(file));
				clip.loop(LOOP_CONTINUOUSLY);
				Thread.sleep(clip.getMicrosecondLength());
			}
			else{
				clip.loop(LOOP_CONTINUOUSLY);
			}
		}

		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}


	public void stopSound(){
		clip.stop();
	}	

	
	public Musiquefond(){} 
}
