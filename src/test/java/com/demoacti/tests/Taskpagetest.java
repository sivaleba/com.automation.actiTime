package com.demoacti.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.demoacti.utils.Helper;

public class Taskpagetest extends BaseTest {
	
	@Test
	public void testcreatecustomer() throws Exception {
		
		loginpage.enterusername("admin");
		loginpage.enterpassword("manager");
		loginpage.clickLogIn();
		entertimepage.task();
		 taskpage.clickonaddcustomer();
		 taskpage.clickonnewcustomer();
		 taskpage.entercustomername("kevin3");
		 taskpage.enterDescription("It's test message");
		 taskpage.clickoncreatenewcustomeraccount();
		 String msg=taskpage.getsuccessmessage();
		 System.out.println("Got Success message "+msg);
		 Assert.assertTrue(msg.contains("has been created"));
		 String title=taskpage.gettaskpagetitle();
		 System.out.println("Tittle= "+title);
		 entertimepage.logout();
	}	
		@Test(priority=2)
		public void testdeletecustomer() throws Exception {
			loginpage.enterusername("admin");
			loginpage.enterpassword("manager");
			loginpage.clickLogIn();
			entertimepage.task();
			Helper.sleep();
	        taskpage.searchcustomerusingtextbox("kevin3");
	        Helper.sleep();
		    taskpage.clickoncustomername();
		    Thread.sleep(2000);
		    taskpage.clickoneditbutton();
		    Helper.sleep();
		    taskpage.clickonactions();
		    Helper.sleep();
		    taskpage.clickondeletebutton();
		    Helper.sleep();
		    taskpage.deletepermanently();
		    Helper.sleep();
		    String msg=taskpage.getsuccessmessage();
			 System.out.println("Got Success message "+msg);
			 System.out.println();
		    Assert.assertTrue(msg.contains("has been deleted"));
		    entertimepage.logout();
	}

		

}
