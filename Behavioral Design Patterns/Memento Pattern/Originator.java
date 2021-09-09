/**
 * @(#)Originator.java
 *
 *
 * @author
 * @version 1.00 2021/7/30
 */


public class Originator {

	private String state;

    public void setState(String state){
    	this.state = state;
    }

    public String getState(){
    	return state;
    }

    public Memento saveStateToMemento(){
    	return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
    	state = memento.getState();
    }


}