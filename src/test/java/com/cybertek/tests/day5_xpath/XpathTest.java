package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTest {
    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement Homelink= driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        Homelink.click();

        driver.navigate().back();
            WebElement button1= driver.findElement(By.xpath("//button[@onclick='button1()']"));
            button1.click();




    }
}
