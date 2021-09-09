/**
 * @(#)BridgePatternDemo.java
 *
 *
 * @author
 * @version 1.00 2021/7/19
 */


public class BridgePatternDemo {

    public static void main(String args[]) {
    	Shape redCircle = new Circle(100, 100, 10, new RedCircle());
    	Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

    	redCircle.draw();
    	greenCircle.draw();
    }


}