package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https:youtube.com");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Rick Astley - Never Gonna Give You Up (Official Music Video)");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

    }
}
