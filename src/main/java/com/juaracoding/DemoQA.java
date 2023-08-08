package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        System.out.println("Open Browser");

        driver.findElement(By.id("userName")).sendKeys("ferry0601");
        driver.findElement(By.id("userEmail")).sendKeys("ferriendonesia@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Medan");
        driver.findElement(By.id("permanentAddress")).sendKeys("Serdang Bedagai");
        js.executeScript("window.scroll(0,500)");
        driver.findElement(By.id("submit")).click();

        delay();
        driver.quit();
        System.out.println("close it");
    }

    public static void delay(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
