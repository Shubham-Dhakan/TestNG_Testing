package testPackage2;

import org.testng.annotations.Test;

public class Testing_Day2 {

@Test
public void Beta() {
	System.out.println("Automated message from TestNG, Helper Attribute Concept");
	}
@Test(dependsOnMethods= {"Beta"})
public void Alpha() {
	System.out.println("Automated message from TestNG, Helper Attribute Concept again");
	}
	
}
