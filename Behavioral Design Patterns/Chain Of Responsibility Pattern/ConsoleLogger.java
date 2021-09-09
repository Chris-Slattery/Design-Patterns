/**
 * @(#)ConsoleLogger.java
 *
 *
 * @author
 * @version 1.00 2021/7/26
 */


public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
    	this.level = level;
    }

    @Override
    protected void write(String message){
    	System.out.println("Standard Console::Logger: " + message);
    }


}