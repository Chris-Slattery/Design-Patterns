/**
 * @(#)Circle.java
 *
 *
 * @author
 * @version 1.00 2021/7/12
 */


public class Circle extends Shape {

    public Circle() {
    	type = "Circle";
    }//end constructor

    @Override
    public void draw(){
    	System.out.println("Drawing Circle...");
    }


}