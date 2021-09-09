/**
 * @(#)Football.java
 *
 *
 * @author
 * @version 1.00 2021/8/5
 */


public class Football extends Game {

	@Override
	void endPlay(){
		System.out.println("Football Game Finished");
	}

	@Override
	void initialize(){
		System.out.println("Football Game Initialized! Start Playing.");
	}

	@Override
	void startPlay(){
		System.out.println("Football Game Started. Enjoy the Game!");
	}
}