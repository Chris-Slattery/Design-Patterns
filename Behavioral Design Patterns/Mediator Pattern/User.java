/**
 * @(#)User.java
 *
 *
 * @author
 * @version 1.00 2021/7/29
 */


public class User {

	private String name;

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

    public User(String name) {
    	this.name = name;
    }

    public void sendMessage(String message){
    	ChatRoom.showMessage(this, message);
    }


}