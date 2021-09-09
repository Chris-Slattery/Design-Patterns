/**
 * @(#)Meal.java
 *
 *
 * @author
 * @version 1.00 2021/7/12
 */


import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
    	items.add(item);
    }

    public float getCost(){
    	float cost = 0.0f;

    	for(Item item : items){
    		cost += item.price();
    	}//end for

    	return cost;
    }

    public void showItems(){
    	for(Item item : items){
    		System.out.print("Item : " + item.name());
    		System.out.print(", Packing : " + item.packing().pack());
    		System.out.println(", Price : " + item.price());
    	}//end for
    }


}