package testPackage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDay1 {

@Test(groups= {"Smoke"})
public void demo() {
	System.out.println("Hello");				// Automation 
}

@Test
public void demo1() {
	System.out.println("Hello World");
}

@BeforeTest
public void demo3() {
	System.out.println("I will execute first ");
}

}


/*  
 * How to run test in TestNG
 * You need to have """ @Test """ Annotation followed by methods 
 */