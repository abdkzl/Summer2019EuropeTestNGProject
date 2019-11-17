package com.cybertek.tests.day7_testNG;

import org.testng.annotations.*;

public class BeforeAndAfterMethod {

    @Test
    public void Test1(){
        System.out.println("This is Test 1");

    }
    @Test
    public void Test2()
    {
        System.out.println("This is Test 2");
    }

    @Ignore
    @Test
    public void Test3(){
        System.out.println("This is my Test 3");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("BEFORE METHOD");
        System.out.println("OPENING THE BROWSER");
    }

    @AfterMethod
    public void tearDown(){
    System.out.println("CLOSING THE BROWSER");
        System.out.println("----------------------------");
}
@BeforeClass
    public void beforeEverything(){
    System.out.println("BEFORE CLASS CODE");
}
@AfterClass
    public void afterClass(){
    System.out.println("AFTER CLASS CODE");
    System.out.println("REPORTING");
}
}
