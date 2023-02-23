package com.laxman.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exp7 {
    @Test
    public void test(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("laxmanrayala8@icloud.com");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("62087321Rr");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

    }
}