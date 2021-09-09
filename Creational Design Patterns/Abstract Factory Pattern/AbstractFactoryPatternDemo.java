/**
 * @(#)AbstractFactoryPatternDemo.java
 *
 *
 * @author
 * @version 1.00 2021/7/26
 */


public class AbstractFactoryPatternDemo {

    public static void main(String args[]) {
    	//get shape factory
    	AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

    	//get an object of shape rectangle
    	Shape shape1 = shapeFactory.getShape("RECTANGLE");
    	//call draw method of Shape Rectangle
    	shape1.draw();

    	//get an object of shape square
    	Shape shape2 = shapeFactory.getShape("SQUARE");
    	//call draw method of shape square
    	shape2.draw();

    	//get shape factory
    	AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

    	//get an object of shape rectangle
    	Shape shape3 = shapeFactory1.getShape("RECTANGLE");
    	//cal draw method of shape Rectangle
    	shape3.draw();

    	//get an object of shape square
    	Shape shape4 = shapeFactory1.getShape("SQUARE");
    	//cal draw method of Shape square
    	shape4.draw();
    }


}