/**
 * @(#)MediaAdapter.java
 *
 *
 * @author
 * @version 1.00 2021/7/19
 */


public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(String audioType){

		if(audioType.equalsIgnoreCase("vlc") ){
			advancedMediaPlayer = new VlcPlayer();

		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer = new Mp4Player();
		}//end else if
	}

	@Override
	public void play(String audioType, String fileName){
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer.playVlc(fileName);
		}
		else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer.playMp4(fileName);
		}//end else if
	}

}