package com.syntax.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    /*
    task3:(use css)
goto:http://syntaxprojects.com/input-form-demo.php
fill in all the textboxes in the form (edited)
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/input-form-demo.php");


    }
}
