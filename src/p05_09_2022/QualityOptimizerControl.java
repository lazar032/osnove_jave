package p05_09_2022;

public class QualityOptimizerControl extends Control{
	private double brzinaNeta;

	public double getBrzinaNeta() {
		return brzinaNeta;
	}

	public void setBrzinaNeta(double brzinaNeta) {
		this.brzinaNeta = brzinaNeta;
	}

	public QualityOptimizerControl(double brzinaNeta) {
		super();
		this.brzinaNeta = brzinaNeta;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer videoPlayer) {
		if (this.brzinaNeta * 10.1 < 144) {
			videoPlayer.setKvalitet(144);
		} else if (this.brzinaNeta * 10.1 > 144 && this.brzinaNeta * 10.1 <240) {
			videoPlayer.setKvalitet(240);
		} else if (this.brzinaNeta * 10.1 > 240 && this.brzinaNeta * 10.1 < 360) {
			videoPlayer.setKvalitet(360);
		} else if (this.brzinaNeta * 10.1 > 360 && this.brzinaNeta * 10.1 < 480) {
			videoPlayer.setKvalitet(480);
		} else if (this.brzinaNeta * 10.1 > 480 && this.brzinaNeta * 10.1 < 720) {
			videoPlayer.setKvalitet(720);
		} else if (this.brzinaNeta * 10.1 > 720) {
			videoPlayer.setKvalitet(1080);
		}
		
	}
	

}
