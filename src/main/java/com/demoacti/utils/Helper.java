package com.demoacti.utils;

import com.demoacti.base.DriverScript;

public class Helper extends DriverScript{
 public static void sleep() {
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
 }
}
