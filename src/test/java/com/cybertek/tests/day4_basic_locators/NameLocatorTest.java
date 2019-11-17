package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement FullName=driver.findElement(By.name("full_name"));

        FullName.sendKeys("abdullah");

        WebElement Email=driver.findElement(By.name("email"));
        Email.sendKeys("test@test.gmail.com");

        WebElement signUp= driver.findElement(By.name("wooden_spoon"));
        signUp.click();


        String expectedMessage="Thank you for signing up. Click the button below to return to the home page.";

        WebElement messageElement= driver.findElement(By.name("signup_message"));
        String actualMessage=messageElement.getText();

                if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualMessage = " + actualMessage);
            System.out.println("expectedMessage = " + expectedMessage);

                }
        driver.quit();




    }






}
