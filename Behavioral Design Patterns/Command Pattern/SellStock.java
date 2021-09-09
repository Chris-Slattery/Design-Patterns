/**
 * @(#)SellStock.java
 *
 *
 * @author
 * @version 1.00 2021/7/28
 */


public class SellStock implements Order {
	private Stock abcStock;

    public SellStock(Stock abcStock) {
    	this.abcStock = abcStock;
    }

    public void execute(){
    	abcStock.sell();
    }


}