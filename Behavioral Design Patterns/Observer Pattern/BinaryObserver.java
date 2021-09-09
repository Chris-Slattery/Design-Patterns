/**
 * @(#)BinaryObserver.java
 *
 *
 * @author
 * @version 1.00 2021/7/30
 */


public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
    	this.subject = subject;
    	this.subject.attach(this);
    }

    @Override
    public void update(){
    	System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }


}