package com.laxman.Browser;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DemoLocators {

    @Test
    public void test() {
        WebDriver driver;
        System.out.println("Welcome");
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email") ).sendKeys("9705439917");
        driver.findElement(By.id("pass")).sendKeys("620873218323554");
        driver.findElement(By.name("login")).click();


    }



}
