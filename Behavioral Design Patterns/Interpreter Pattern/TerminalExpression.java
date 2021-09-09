/**
 * @(#)TerminalExpression.java
 *
 *
 * @author
 * @version 1.00 2021/7/28
 */


public class TerminalExpression implements Expression {

	private String data;

    public TerminalExpression(String data) {
    	this.data = data;
    }

    @Override
    public boolean interpret(String context){

    	if(context.contains(data)){
    		return true;
    	}
    	return false;
    }


}