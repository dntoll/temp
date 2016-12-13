package csquiz.selenium;

import csquiz.selenium.playground.AccessCsquiz11;
import csquiz.selenium.playground.AccessCsquiz17;
import csquiz.selenium.playground.AccessCsquiz12;
import csquiz.selenium.playground.AccessCsquiz13;
import csquiz.selenium.playground.AccessCsquiz14;
import csquiz.selenium.playground.AccessCsquiz15;
import csquiz.selenium.playground.AccessCsquiz16;

public class LoaderMain {

	public static void main(String[] args) {
		
		boolean tc1_1 = true;
		boolean tc1_2 = true;
		boolean tc1_3 = true;
		boolean tc1_4 = true;
		boolean tc1_5 = true;
		boolean tc1_6 = true;
		boolean tc1_7 = true;

		
		System.out.print("\nLets start !!!");
		
		// 1.1 navigate to page
		if (tc1_1 == true){
			
			AccessCsquiz11 access = new AccessCsquiz11 ();
			access.runMe();
			
		}

		// 1.2 failed login all data missing
		if (tc1_2 == true){
			
			AccessCsquiz12 access = new AccessCsquiz12 ();
			access.runMe();
			
		}

		// 1.3 failed login with only user name
		if (tc1_3 == true){
			
			AccessCsquiz13 access = new AccessCsquiz13 ();
			access.runMe();
			
		}

		// 1.4 failed login with only password
		if (tc1_4 == true){
			
			AccessCsquiz14 access = new AccessCsquiz14 ();
			access.runMe();
			
		}

		
		// 1.5 failed login with wrong password
		if (tc1_5 == true){
			
			AccessCsquiz15 access = new AccessCsquiz15 ();
			access.runMe();
			
		}
		
		// 1.6 failed login with wrong username
		if (tc1_6 == true){
			
			AccessCsquiz16 access = new AccessCsquiz16 ();
			access.runMe();
			
		}
		
		// 1.7 successful login
		if (tc1_7 == true){
			
			AccessCsquiz17 access = new AccessCsquiz17 ();
			access.runMe();
			
		}

		
		System.out.print("\nThat was it! !!!");
		

	}

}
