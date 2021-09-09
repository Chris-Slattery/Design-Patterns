/**
 * @(#)BuyStock.java
 *
 *
 * @author
 * @version 1.00 2021/7/28
 */


public class BuyStock implements Order {
	private Stock abcStock;


    public BuyStock(Stock abcStock) {
    	this.abcStock = abcStock;
    }

    public void execute(){
    	abcStock.buy();
    }


}