/**
 * @(#)Shape.java
 *
 *
 * @author
 * @version 1.00 2021/7/19
 */


public abstract class Shape {

	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}

    public abstract void draw();


}