package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLocator {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com/");

        WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("selenium");
        WebElement searchButton=driver.findElement(By.xpath("//input[@value='Go']"));
        searchButton.click();

        WebElement numOfResults= driver.findElement(By.xpath("//span[contains(text(),'result')]"));
        String resultMessage=numOfResults.getText();
        System.out.println("numOfResults = " + resultMessage);



    }
}
