package testPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGDay3 {

	@Test(groups= {"Smoke"})
	public void Demo4() {
		System.out.println("Prioritizing Tests");
	}
	
	@Test 
	public void Demo5() {
		System.out.println("Practicing Prioritizing tests with TestNG ");
	}
	
	@AfterTest
	public void Demo6() {
		System.out.println("I will execute Last");
	}
} 
