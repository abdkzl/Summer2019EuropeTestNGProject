package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameTest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");


        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement FullName=driver.findElement(By.tagName("input"));

        FullName.sendKeys("abdullah");

        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("test@test.com");

        WebElement signUp=driver.findElement(By.tagName("button"));
        signUp.click();

        WebElement message=driver.findElement(By.tagName("h3"));
        
        String Message=message.getText();

        System.out.println("Message = " + Message);



    }
}
