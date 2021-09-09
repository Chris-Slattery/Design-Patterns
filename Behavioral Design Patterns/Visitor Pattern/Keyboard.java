/**
 * @(#)Keyboard.java
 *
 *
 * @author
 * @version 1.00 2021/8/5
 */


public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor){
		computerPartVisitor.visit(this);
	}
}