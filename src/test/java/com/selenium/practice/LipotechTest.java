package com.selenium.practice;

import com.selenium.helpers.Driver;
import com.selenium.pages.AmazonPage;
import com.selenium.pages.LipotechPage;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class LipotechTest extends Driver{
    @Test
    public void LipotechTest() throws IOException {
        try {
            driver = getDriver();
        } catch (IOException e) {
            e.printStackTrace();

        }


        String lipotechBaseUrl = (String) Driver.getProperty("lipotechBaseUrl");
        driver.get(lipotechBaseUrl + "/en/products/skin-care/");


        LipotechPage lipotechPage = PageFactory.initElements(driver, LipotechPage.class);

        Wait fluentWait = new FluentWait<WebDriver>(driver).withTimeout(100, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS).ignoring(ElementNotVisibleException.class
        );


        driver.switchTo().frame(lipotechPage.fancybox);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(lipotechPage.asiaPacific));
        lipotechPage.asiaPacific.click();

        driver.switchTo().defaultContent();


        System.out.println(driver.getTitle());

    }
}
