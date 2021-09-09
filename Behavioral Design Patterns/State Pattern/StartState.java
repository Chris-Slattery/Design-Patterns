/**
 * @(#)StartState.java
 *
 *
 * @author
 * @version 1.00 2021/8/2
 */


public class StartState implements State {

    public void doAction(Context context) {
    	System.out.println("Player is in start state");
    	context.setState(this);
    }

    public String toString(){
    	return "Start State";
    }


}