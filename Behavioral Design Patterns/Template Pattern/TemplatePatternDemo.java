/**
 * @(#)TemplatePatternDemo.java
 *
 *
 * @author
 * @version 1.00 2021/8/5
 */


public class TemplatePatternDemo {

    public static void main(String args[]) {

    	Game game = new Cricket();
    	game.play();
    	System.out.println();
    	game = new Football();
    	game.play();
    }


}