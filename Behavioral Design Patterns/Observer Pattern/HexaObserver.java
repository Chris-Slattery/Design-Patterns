/**
 * @(#)HexaObserver.java
 *
 *
 * @author
 * @version 1.00 2021/7/30
 */


public class HexaObserver extends Observer{

    public HexaObserver(Subject subject) {
    	this.subject = subject;
    	this.subject.attach(this);
    }

    @Override
    public void update(){
    	System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }


}