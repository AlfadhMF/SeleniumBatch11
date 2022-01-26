package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.name("customer.firstName")).sendKeys("Mohanad");
        driver.findElement(By.id("customer.lastName")).sendKeys("Alfadhli");
        driver.findElement(By.id("customer.address.street")).sendKeys("13513 TackHouse ct.");
        driver.findElement(By.id("customer.address.city")).sendKeys("Gainesville");
        driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("20155");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("703-473-8602");
        driver.findElement(By.id("customer.ssn")).sendKeys("733-48-8470");
        driver.findElement(By.id("customer.username")).sendKeys("AlfadhMF16");
        driver.findElement(By.id("customer.password")).sendKeys("Moh@1997");
        driver.findElement(By.id("repeatedPassword")).sendKeys("?");
        driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
    }
}
