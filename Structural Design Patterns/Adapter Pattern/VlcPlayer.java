/**
 * @(#)VlcPlayer.java
 *
 *
 * @author
 * @version 1.00 2021/7/19
 */


public class VlcPlayer implements AdvancedMediaPlayer {

    public void playVlc(String fileName) {
    	System.out.println("Playing VLC file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName){
    	//do nothing
    }


}