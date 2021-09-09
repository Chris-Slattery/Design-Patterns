/**
 * @(#)SingletonPatternDemo.java
 *
 *
 * @author
 * @version 1.00 2021/7/22
 */


public class SingletonPatternDemo {

    public static void main(String args[]) {

    	//illegal construct
    	//compile time error: the constructor SingleObject() is not visible
    	//SingleObject object = new SingleObject();

    	//Get the only object available
    	SingleObject object = SingleObject.getInstance();

    	//Show the message
    	object.showMessage();
    }


}