/**
 * @(#)VisitorPatternDemo.java
 *
 *
 * @author
 * @version 1.00 2021/8/5
 */


public class VisitorPatternDemo {

    public static void main(String args[]) {

    	ComputerPart computer = new Computer();
    	computer.accept(new ComputerPartDisplayVisitor());
    }


}