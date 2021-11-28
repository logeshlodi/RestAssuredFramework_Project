package Org.Testing.TestTrigger;

import java.io.IOException;

import org.testng.annotations.Test;

import Org.Testing.TestCases.TC1;
import Org.Testing.TestCases.TC2;
import Org.Testing.TestCases.TC3;
import Org.Testing.TestCases.TC4;

public class Trigger {
	
		@Test(priority=1)
		public void second() throws IOException
		{
			System.out.println("Called Test Case 2- post() Request");
			TC2 TC2Obj=new TC2();
			TC2Obj.testcase2();
			System.out.println("--------------End of Test Case 2 the post() Request-------------");
			System.out.println("\n");
		}
		
		//We have set the priority of TC1 as 2 with @Test annotation to this test case
		@Test(priority=2)
		public void first() throws IOException
		{
			System.out.println("Called Test Case 1- get() Request");
			TC1 TC1Obj=new TC1();
			TC1Obj.testcase1();
			System.out.println("--------------End of Test Case 1 the get() Request--------------");
			System.out.println("\n");
		}
		
		//We have set the priority of TC4 as 3 with @Test annotation to this test case
		@Test(priority=3)
		public void fourth() throws IOException
		{
			System.out.println("Called Test Case 4- put() Request");
			TC4 TC4Obj=new TC4();
			TC4Obj.testcase4();
			System.out.println("--------------End of Test Case 4 the put() Request--------------");
			System.out.println("\n");
		}
		
		//We have set the priority of TC3 as 4 with @Test annotation to this test case
		@Test(priority=4)
		public void third() throws IOException
		{
			System.out.println("Called Test Case 3- delete() Request");
			TC3 TC3Obj=new TC3();
			TC3Obj.testcase3();
			System.out.println("-------------End of Test Case 3 the delete() Request------------");
		}

}