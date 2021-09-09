/**
 * @(#)Rectangle.java
 *
 *
 * @author
 * @version 1.00 2021/7/12
 */


public class Rectangle extends Shape {

    public Rectangle() {
    	type = "Rectangle";
    }//end constructor

    @Override
    public void draw(){
    	System.out.println("Drawing Rectangle...");
    }//end draw method


}