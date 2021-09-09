/**
 * @(#)OperationMultiply.java
 *
 *
 * @author
 * @version 1.00 2021/8/2
 */


public class OperationMultiply implements Strategy {

	@Override
    public int doOperation(int num1, int num2) {
    	return num1 * num2;
    }


}