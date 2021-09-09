/**
 * @(#)Square.java
 *
 *
 * @author
 * @version 1.00 2021/7/12
 */


public class Square extends Shape {

    public Square() {
    	type = "Square";
    }

    @Override
    public void draw(){
    	System.out.println("Drawing Square...");
    }//end draw method


}