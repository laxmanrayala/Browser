package com.laxman.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exp9 {
    @Test
    public void test(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://github.com/login");

        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("2000031963@kluniversity.in");

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("62087321Rr");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        if (driver.getTitle().contains("Your Profile")) {
            System.out.println("Git account is active");
        } else {
            System.out.println("Git account is inactive");
        }
    }

}
