/**
 * @(#)Burger.java
 *
 *
 * @author
 * @version 1.00 2021/7/12
 */


public abstract class Burger implements Item {

	@Override
    public Packing packing() {
    	return new Wrapper();
    }

    @Override
    public abstract float price();


}