package qaTesting;

import org.testng.annotations.Test;

public class Testing_Day1 {

@Test
public void testing_seleniumJava() {
	System.out.println("Automated message from TestNG, performing selenium testing"); 
}
	
@Test
public void testing_appium() {
	System.out.println("Automated message from TestNG, performing appium mobile testing");
}

@Test
public void testing_restapi() {
	System.out.println("Automated message from TestNG, performing REST api testing");
}

@Test
public void testing_soapui() {
	System.out.println("Automated message from TestNG, performing SOAP UI testing");
}

@Test 
public void testing_jmeter() {
	System.out.println("Automated message from TestNG, performing jmeter testing");
}

}
