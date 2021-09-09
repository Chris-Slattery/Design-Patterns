/**
 * @(#)RoundedShapeFactory.java
 *
 *
 * @author
 * @version 1.00 2021/7/26
 */


public class RoundedShapeFactory extends AbstractFactory {

	@Override
    public Shape getShape(String shapeType) {
    	if(shapeType.equalsIgnoreCase("RECTANGLE")){
    		return new RoundedRectangle();
    	}else if(shapeType.equalsIgnoreCase("SQUARE")){
    		return new RoundedSquare();
    	}//end else if
    	return null;

    }


}