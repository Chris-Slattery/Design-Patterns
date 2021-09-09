/**
 * @(#)ComputerPartVisitor.java
 *
 *
 * @author
 * @version 1.00 2021/8/5
 */


public interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);

}