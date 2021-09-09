/**
 * @(#)GreenCircle.java
 *
 *
 * @author
 * @version 1.00 2021/7/19
 */


public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y){
		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
	}



}