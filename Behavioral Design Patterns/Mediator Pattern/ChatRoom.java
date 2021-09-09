/**
 * @(#)ChatRoom.java
 *
 *
 * @author
 * @version 1.00 2021/7/29
 */

import java.util.Date;

public class ChatRoom {

    public static void showMessage(User user, String message) {
    	System.out.println(new Date().toString() + "[" + user.getName() + "] : " + message);
    }


}