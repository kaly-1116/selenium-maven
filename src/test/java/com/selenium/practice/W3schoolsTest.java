package com.selenium.practice;

import com.selenium.helpers.Driver;
import com.selenium.pages.W3schoolsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Element;

import java.io.IOException;

public class W3schoolsTest extends Driver {

    @Test
    public static void W3schoolsTest() throws IOException {
        try {
            driver = getDriver();
        } catch (IOException e) {
            e.printStackTrace();

        }

        String w3schoolsBaseUrl = (String) Driver.getProperty("w3schoolsBaseUrl");
        driver.get(w3schoolsBaseUrl + "/tags/tryit.asp?filename=tryhtml_iframe");

       W3schoolsPage w3schoolsPage = PageFactory.initElements(driver, W3schoolsPage.class);

      driver.switchTo().frame(w3schoolsPage.outerIframe);
      // driver.switchTo().frame(2);

       Assert.assertEquals(w3schoolsPage.heading.getText(), "The iframe element", "Title is not as expected");

       driver.switchTo().frame(w3schoolsPage.innerIframe);
       Assert.assertEquals(w3schoolsPage.heading.getText(), "HTML", "Inner Iframe title is not matching");

        Driver.scrollToBottom();

       // driver.switchTo().defaultContent();
       // w3schoolsPage.iframe.isDisplayed();
       // driver.switchTo().frame(1);
        driver.switchTo().parentFrame();
        //driver.switchTo().frame(w3schoolsPage.outerIframe);

        Assert.assertEquals(w3schoolsPage.heading.getText(), "The iframe element", "Title is not as expected");



    }

}