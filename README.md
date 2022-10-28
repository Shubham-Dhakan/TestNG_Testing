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

6) Groups Concept in TestNG: For reference refer tesng3.xml for understanding, if we want to call specific methods(TestCases) among 100 classes in a package then we have to use Groups concept in TestNG.
             <<< CODE Eg: @Test(groups={"abc"})
                          public void Demo() {}   >>>

7) FlipKartLogin - File showcases the perfect example of parametrization concept where we are fetching values from xml file in our java file through parameterization concept. 
8) DataProvider - Whenever we have to fill multiple forms on website and deal with mutliple data's then we have to DataProvider concept of testng. As it returns array of objects. 
