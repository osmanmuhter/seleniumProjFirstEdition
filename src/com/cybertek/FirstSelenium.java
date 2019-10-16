package com.cybertek;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/osman/Documents/selenium dependencies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

    }
}
