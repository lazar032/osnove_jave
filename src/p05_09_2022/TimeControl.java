package p05_09_2022;

public class TimeControl extends Control{
	private boolean pomeraj;

	public TimeControl(boolean pomeraj) {
		super();
		this.pomeraj = pomeraj;
	}

	public boolean isPomeraj() {
		return pomeraj;
	}

	public void setPomeraj(boolean pomeraj) {
		this.pomeraj = pomeraj;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer videoPlayer) {
		if (videoPlayer.getTrenutnoVreme() - 15 > 0 && videoPlayer.getTrenutnoVreme() + 15 > 0
				&& pomeraj == true) {
			videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme() + 15);
		} else if (videoPlayer.getTrenutnoVreme() - 15 > 0 && videoPlayer.getTrenutnoVreme() + 15 > 0
				&& pomeraj == false) {
			videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme() - 15);
		} else {
			System.out.println("Nije moguca ova akcija.");
		}
	}
	

}
