# TestNG_Testing
1) @Test ---> Annotations Concept and how it is superor to JAVA and we can create multiple TestCases in TestNG with help of annotations. 

2) What is TestNG.xml? ---> IF we want to run all the test cases together then we can use testng.xml file to perform that action, 
even we can prioritize test cases in testng.xml if we want to include or exclude specific file in testing.   

3) Include and Exclude Mechanism to control testcases. ### Refer testng.xml file for it ###

4) Executing the TestCases at Package level with Regex. ### Refer testng2.xml file for it ###

5) Types of Annotation: 

@BeforeTest - Method of this test case will execute first over all the other TestCases  <<< Eg: Login, Refresh, Clear webElement (email box) >>>.
@AfterTest - Method of this test case will execute last after all the other TestCases.  <<< Eg: SignOut, Submit. etc >>> 
@BeforeMethod - Method of this test case will execute before all the methods once. 
@BeforeSuite - Method of this test case will execute before all the methods of all the classes in a package.
@AfterSuite - Method of this test case will execute after all the methods of all the classes in a package.

