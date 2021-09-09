/**
 * @(#)Circle.java
 *
 *
 * @author
 * @version 1.00 2021/7/19
 */


public class Circle extends Shape {
	private int x, y, radius;


    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
    	super(drawAPI);
    	this.x = x;
    	this.y = y;
    	this.radius = radius;
    }

    public void draw(){
    	drawAPI.drawCircle(radius, x, y);
    }//end draw Method


}