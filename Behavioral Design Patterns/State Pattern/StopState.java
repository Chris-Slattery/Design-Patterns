/**
 * @(#)StopState.java
 *
 *
 * @author
 * @version 1.00 2021/8/2
 */


public class StopState implements State {

    public void doAction(Context context) {
    	System.out.println("Player is in stop state");
    	context.setState(this);
    }

    public String toString(){
    	return "Stop State";
    }


}