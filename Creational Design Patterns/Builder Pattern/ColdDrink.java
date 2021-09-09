/**
 * @(#)ColdDrink.java
 *
 *
 * @author
 * @version 1.00 2021/7/12
 */


public abstract class ColdDrink implements Item {

	@Override
    public Packing packing() {
    	return new Bottle();
    }

    @Override
    public abstract float price();


}