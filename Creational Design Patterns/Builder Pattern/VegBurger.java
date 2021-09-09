/**
 * @(#)VegBurger.java
 *
 *
 * @author
 * @version 1.00 2021/7/12
 */


public class VegBurger extends Burger {

	@Override
    public float price() {
    	return 25.0f;
    }

    @Override
    public String name(){
    	return "Veg Burger";
    }


}