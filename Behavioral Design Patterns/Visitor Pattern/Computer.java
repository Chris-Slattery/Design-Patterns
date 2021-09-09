/**
 * @(#)Computer.java
 *
 *
 * @author
 * @version 1.00 2021/8/5
 */


public class Computer implements ComputerPart {

	ComputerPart[] parts;

    public Computer() {
    	parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor){
    	for(int i = 0; i < parts.length; i++){
    		parts[i].accept(computerPartVisitor);
    	}//end for
    	computerPartVisitor.visit(this);
    }


}