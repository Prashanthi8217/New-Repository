package com.ecommerce.falcom;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KeyboardHandRobotClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Robot r=new Robot();
		String app="microsoft store";
		char[] ch=app.toCharArray();
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		Thread.sleep(2000);
		for(char c:ch) {
			int KeyCode=KeyEvent.getExtendedKeyCodeForChar(c);
			r.keyPress(KeyCode);
			r.keyRelease(KeyCode);
			Thread.sleep(2000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
