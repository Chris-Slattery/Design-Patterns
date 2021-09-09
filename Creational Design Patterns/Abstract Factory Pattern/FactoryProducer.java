/**
 * @(#)FactoryProducer.java
 *
 *
 * @author
 * @version 1.00 2021/7/26
 */


public class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded) {
    	if(rounded){
    		return new RoundedShapeFactory();
    	}else{
    		return new ShapeFactory();
    	}//end else
    }


}