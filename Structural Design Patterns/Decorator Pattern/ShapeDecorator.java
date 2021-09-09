/**
 * @(#)ShapeDecorator.java
 *
 *
 * @author
 * @version 1.00 2021/7/20
 */


public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
    	this.decoratedShape = decoratedShape;
    }

    public void draw(){
    	decoratedShape.draw();
    }


}