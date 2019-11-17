package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class VerifyConfirmationMessage {

   /* Verify confirmation message
    open browser
    go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
    enter any email
    verify that email is displayed in the input box
    click on Retrieve password
    verify that confirmation message says 'Your e-mail's been sent!'

    */

   
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("");






    }
}
