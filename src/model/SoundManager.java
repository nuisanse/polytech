package model;

import IHM.Musiquefond;

public class SoundManager {

	private static SoundManager __instance;
	private Musiquefond zik;
	private static boolean mute;


	public static SoundManager getInstance() {
		if (__instance == null) {
			__instance = new SoundManager();
		}
		return __instance;
	}

	public SoundManager() {
		this.zik = new Musiquefond();
		this.setMute(false);
	}

	public Musiquefond getZik() {
		return zik;
	}

	public void setZik(Musiquefond zik) {
		this.zik = zik;
	}

	public boolean isMute(){
		return mute;
	}

	public void setMute(boolean m) {
		mute = m;
	}
}
