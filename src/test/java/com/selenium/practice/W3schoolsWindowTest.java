package com.selenium.practice;

import com.selenium.helpers.Driver;
import com.selenium.pages.W3schoolsDemoPage;
import com.selenium.pages.W3schoolsPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class W3schoolsWindowTest extends Driver {



    @Test
    public void W3schoolsTest() throws IOException {
        Logger log = Logger.getLogger(W3schoolsWindowTest.class);
        log.info("Start Test");
        try {
            driver = getDriver();
        } catch (IOException e) {
            log.error("Error ");
            log.warn("Error ");
            e.printStackTrace();

        }

        String w3schoolsBaseUrl = (String) Driver.getProperty("w3schoolsBaseUrl");
        driver.get(w3schoolsBaseUrl);
        log.info("Open W3Schools BaseURL");

        W3schoolsDemoPage w3schoolsPage = PageFactory.initElements(driver, W3schoolsDemoPage.class);

        String mainWindow = driver.getWindowHandle();
        w3schoolsPage.tryLink.click();


        Set<String> wins = driver.getWindowHandles();

        Iterator<String> itr = wins.iterator();

        //   for(String win : wins ){
        //     driver.switchTo().window(win);
        // }
        while (itr.hasNext()) {
            driver.switchTo().window(itr.next());
        }
        log.info("Switched to new window");

        //   String mainWindow = itr.next();
        // String childWindow = itr.next();
        // driver.switchTo().window(childWindow);


        driver.switchTo().frame(w3schoolsPage.iframe);

        Assert.assertEquals(w3schoolsPage.para.getText(), "This is a paragraph.");
        driver.close();

        driver.switchTo().window(mainWindow);
        w3schoolsPage.learnHtmlLink.click();

    }

}