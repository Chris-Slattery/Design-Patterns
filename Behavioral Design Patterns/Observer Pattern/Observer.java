/**
 * @(#)Observer.java
 *
 *
 * @author
 * @version 1.00 2021/7/30
 */


public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}