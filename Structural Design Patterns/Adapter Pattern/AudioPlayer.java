/**
 * @(#)AudioPlayer.java
 *
 *
 * @author
 * @version 1.00 2021/7/19
 */


public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName){
		//inbuilt support to play mp3 music files
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing MP3 file. Name: " + fileName);
		}//end if

		//mediaAdapter is providing support to play other file formats
		else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4") ){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}//end els eif

		else{
			System.out.println("Invalid Media. " + audioType + "format not supported");
		}//end else


	}


}