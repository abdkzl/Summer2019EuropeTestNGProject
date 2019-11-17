package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElementTest {

@Test
    public void DisabledElementTest(){

    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/radio_buttons");

    WebElement RadioButton=driver.findElement(By.id("green"));

    RadioButton.click();

    System.out.println("is Radio Button Enabled " + RadioButton.isEnabled() );

    Assert.assertFalse(RadioButton.isEnabled(),"Verify that Radio Button is enabled");

}

@Test
    public void Test2(){
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("http://practice.cybertekschool.com/dynamic_controls");


    WebElement inputBox=driver.findElement(By.cssSelector("#input-example>input"));

    System.out.println("is inputBox enabled " + inputBox.isEnabled());

    inputBox.sendKeys("Mike Smith");
}
}
