/**
 * @(#)SingleObject.java
 *
 *
 * @author
 * @version 1.00 2021/7/22
 */


public class SingleObject {

	//create and object of SingleObject
	private static SingleObject instance = new SingleObject();

	//Make constructor private so that this class cannot be instatiated
    private SingleObject() {
    }

    //Get the only object available
    public static SingleObject getInstance(){
    	return instance;
    }

    public void showMessage(){
    	System.out.println("Hello World!");
    }


}