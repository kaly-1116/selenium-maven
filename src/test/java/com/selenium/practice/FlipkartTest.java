package com.selenium.practice;

import com.selenium.helpers.Driver;
import com.selenium.pages.FlipkartPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class FlipkartTest extends Driver {

    @Test
    public static void flipkartTest() throws IOException, InterruptedException {
        try {
            driver = getDriver();
        } catch (IOException e) {
            e.printStackTrace();

        }

        String flipkartBaseUrl = (String) Driver.getProperty("flipkartBaseUrl");
        driver.get(flipkartBaseUrl);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        FlipkartPage flipkartPage = PageFactory.initElements(driver, FlipkartPage.class);
        flipkartPage.close.click();
        Thread.sleep(3000);
        flipkartPage.laptops.click();
        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(flipkartPage.priceDragLeft, 40, 0).build().perform();

        Thread.sleep(3000);
        actions.dragAndDropBy(flipkartPage.priceDragRight, -40, 0).build().perform();


        //actions.clickAndHold(source);
       // actions.dragAndDrop(sour, dest).build().perform();
        //actions.release(source)
    }
}
