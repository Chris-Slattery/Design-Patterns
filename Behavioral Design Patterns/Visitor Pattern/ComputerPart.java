/**
 * @(#)ComputerPart.java
 *
 *
 * @author
 * @version 1.00 2021/8/5
 */


public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);
}