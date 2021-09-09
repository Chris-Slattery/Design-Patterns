/**
 * @(#)AdapterPatternDemo.java
 *
 *
 * @author
 * @version 1.00 2021/7/19
 */


public class AdapterPatternDemo {

    public static void main(String args[]) {
    	AudioPlayer audioPlayer = new AudioPlayer();

    	audioPlayer.play("mp3", "In Da Club.mp3");
    	audioPlayer.play("mp4", "Goldeneye.mp4");
    	audioPlayer.play("vlc", "Blood Diamond.vlc");

    	//Try avi which is not supported in program
    	audioPlayer.play("avi", "Chernobyl.avi");

    }//end main


}