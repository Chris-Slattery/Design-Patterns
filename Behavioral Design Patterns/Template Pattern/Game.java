/**
 * @(#)Game.java
 *
 *
 * @author
 * @version 1.00 2021/8/5
 */


public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();

	//template method
    public final void play() {

    	//initialize the game
    	initialize();

    	//start the game
    	startPlay();

    	//end the game
    	endPlay();
    }


}