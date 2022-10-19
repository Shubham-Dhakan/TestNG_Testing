package testPackage2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing_Day1 {

@Test(groups= {"Smoke"})
public void testing_seleniumJava() {
	System.out.println("Automated message from TestNG, performing selenium testing"); 
}
	
@BeforeTest
public void testing_appium() {
	System.out.println("Automated message from TestNG, performing appium mobile testing: I will get executed first of all tests.");
}

@AfterTest
public void testing_restapi() {
	System.out.println("Automated message from TestNG, performing REST api testing: I will get executed after all tests.");
}

@BeforeMethod
public void testing_soapui() {
	System.out.println("Automated message from TestNG, performing SOAP UI testing and i will get printed before once before all the testcases.");
}

@Test 
public void testing_jmeter() {
	System.out.println("Automated message from TestNG, performing jmeter testing");
}

}
