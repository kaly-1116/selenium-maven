package com.selenium.practice;
import com.selenium.helpers.Driver;
import com.selenium.pages.W3schoolsDemoPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class W3schoolsDemoTest extends Driver {
    static Logger log = Logger.getLogger(W3schoolsDemoTest.class);
    @Test
    public static void W3schoolsDemoTest() throws IOException, InterruptedException {
        try {
            driver = getDriver();
        } catch (IOException e) {
            e.printStackTrace();

        }
        log.info("Open Browser w3schools url");

        String w3schoolsBaseUrl = (String) Driver.getProperty("w3schoolsBaseUrl");
        driver.get(w3schoolsBaseUrl + "/html/tryit.asp?filename=tryhtml5_draganddrop");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        W3schoolsDemoPage w3schoolsDemoPage = PageFactory.initElements(driver, W3schoolsDemoPage.class);

        driver.switchTo().frame(w3schoolsDemoPage.iframe);

        Thread.sleep(5000);
        System.out.println(w3schoolsDemoPage.para.getText());
        System.out.println(w3schoolsDemoPage.src.getAttribute("src"));

        w3schoolsDemoPage.src.click();
        Actions actions = new Actions(driver);
      // actions.click(w3schoolsDemoPage.src).build().perform();
                //.moveToElement(w3schoolsDemoPage.des).build().perform();
        actions.dragAndDrop(w3schoolsDemoPage.src, w3schoolsDemoPage.des).build().perform();







    }
}
