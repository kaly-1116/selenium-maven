package com.selenium.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Driver {

    public static WebDriver driver = null;
    public static String browserName ;
    public static Properties config = null;

    public static WebDriver getDriver() throws IOException {
      FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
      config = new Properties();
       config.load(fi);

       browserName = config.getProperty("browser");
        if (driver == null){
            if (browserName.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver_win32\\chromedriver.exe");

                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\resources\\geckodriver-v0.28.0-win64\\geckodriver.exe");
                driver = new FirefoxDriver();
            }

        }
        return driver;
    }

    public static Object getProperty(String key) throws IOException {

        Properties config = null;


        FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
        config = new Properties();
        config.load(fi);
        Object value = config.getProperty(key);
        return value;

    }
    public static void scrollToBottom(){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scroll(0, 2000)");
    }

    public static void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
    }



}
