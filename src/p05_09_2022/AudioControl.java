package p05_09_2022;

public class AudioControl extends Control{
	public boolean zvuk;

	public boolean isZvuk() {
		return zvuk;
	}

	public void setZvuk(boolean zvuk) {
		this.zvuk = zvuk;
	}

	public AudioControl(boolean zvuk) {
		super();
		this.zvuk = zvuk;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer videoPlayer) {
		if (videoPlayer.getJacinaZvuka() + 1 < 100 && this.zvuk == true) {
			videoPlayer.setJacinaZvuka(videoPlayer.getDuzina() + 1);
		} else if (videoPlayer.getJacinaZvuka() - 1 > 0 && this.zvuk == false) {
			videoPlayer.setJacinaZvuka(videoPlayer.getDuzina() - 1);
		} else {
			System.out.println("Nije validna akcija.");
		}
		
	}
	 
	

}
