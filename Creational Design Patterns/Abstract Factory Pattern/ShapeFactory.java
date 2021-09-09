/**
 * @(#)ShapeFactory.java
 *
 *
 * @author
 * @version 1.00 2021/7/26
 */


public class ShapeFactory extends AbstractFactory {

	@Override
    public Shape getShape(String shapeType) {
    	if(shapeType.equalsIgnoreCase("RECTANGLE")){
    		return new Rectangle();
    	}else if(shapeType.equalsIgnoreCase("SQUARE")){
    		return new Square();
    	}//end else if
    	return null;
    }


}