package com.laxman.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exp3 {
    @Test
    public void test(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://github.com/login");
        driver.findElement(By.id("login_field")).sendKeys("2000031963@kluniversity.in");
        highlight(driver,driver.findElement(By.id("login_field")));
        driver.findElement(By.id("password")).sendKeys("62087321Rr");
        driver.findElement(By.name("commit")).click();


    }

    private void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }

}
