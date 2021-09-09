/**
 * @(#)FacadePatternDemo.java
 *
 *
 * @author
 * @version 1.00 2021/7/21
 */


public class FacadePatternDemo {

    public static void main(String[] args) {

    	ShapeMaker shapeMaker = new ShapeMaker();

    	shapeMaker.drawCircle();
    	shapeMaker.drawRectangle();
    	shapeMaker.drawSquare();
    }


}