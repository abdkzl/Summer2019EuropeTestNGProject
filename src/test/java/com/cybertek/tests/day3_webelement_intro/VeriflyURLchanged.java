package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * open browser
 * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
 * enter any email
 * click on Retrieve password
 * verify that url changed to http://practice.cybertekschool.com/email_sent
 */

public class VeriflyURLchanged {



    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput= driver.findElement(By.name("email"));

        emailInput.sendKeys("email@gmail.com");

        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));

            retrievePasswordButton.click();

        String expectedURL= driver.getCurrentUrl();
        String actualURL= "http://practice.cybertekschool.com/email_sent";

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.quit();








    }
}
