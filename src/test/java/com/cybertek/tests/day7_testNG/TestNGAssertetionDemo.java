package com.cybertek.tests.day7_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertetionDemo {
    @Test
    public void Test1(){
        System.out.println("First Assertion");
        Assert.assertEquals(1  ,234);

        System.out.println("Second Assertion");
        Assert.assertEquals("TITLE","TITLE");
    }
    @Test
    public void Test2(){
        System.out.println("Second Test");
        Assert.assertEquals("one","one");

        String actualTitle="Cybertek";
        String expectedTitleBegining="C";
        System.out.println("First Assertion");
        Assert.assertTrue(actualTitle.startsWith(expectedTitleBegining),"Verfiy title starts withs C");
    }
    @Test
    public void emailTest(){
        String email="abd@gmail.com";
        String attr="@";
        Assert.assertTrue(email.contains(attr),"Verify that @ in email");
    }

    @Test
    public  void Test3(){
        Assert.assertNotEquals("one","two","Verify that one not equal two");
    }
    @Test
    public void Test4(){
        Assert.assertFalse(1<0);
    }
    @Test
    public void Test5(){
        Assert.assertTrue(1>0);
    }
}
