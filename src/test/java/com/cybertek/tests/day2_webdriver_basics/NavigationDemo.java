package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //import class CMD+ENTER or ALT+enter or CONTROL +SPACE
        //selenium object
        WebDriver driver = new ChromeDriver();
        //navigate to website
        driver.get("http:/google.com");

        driver.navigate().to("https:www.facebook.com");

        Thread.sleep(3);

        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().refresh();
    }






}
