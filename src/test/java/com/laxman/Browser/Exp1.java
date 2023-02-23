package com.laxman.Browser;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Exp1 {
    @Test
    public void test() {
        // Check that the page title is "My Account"
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/account");
        driver.findElement(By.id("ap_email")).sendKeys("laxmanrayala8@icloud.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("62087321Rr");
        driver.findElement(By.id("signInSubmit")).click();
        boolean accountInfoDisplayed = driver.findElement(By.id("nav-link-accountList-nav-line-1")).isDisplayed();
        System.out.println(accountInfoDisplayed);

    }

}
