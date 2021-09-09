/**
 * @(#)Context.java
 *
 *
 * @author
 * @version 1.00 2021/8/2
 */


public class Context {

	private State state;

    public Context() {
    	state = null;
    }

    public void setState(State state){
    	this.state = state;
    }

    public State getState(){
    	return state;
    }


}