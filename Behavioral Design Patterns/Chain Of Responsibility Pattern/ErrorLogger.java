/**
 * @(#)ErrorLogger.java
 *
 *
 * @author
 * @version 1.00 2021/7/26
 */


public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
    	this.level = level;
    }

    @Override
    protected void write(String message){
    	System.out.println("Error Console::Logger: " + message);
    }


}