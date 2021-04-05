package com.selenium.practice;

import com.selenium.helpers.Driver;
import com.selenium.pages.ClearTripPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class ClearTripTest extends Driver {

    @Test
    public void clearTript() throws IOException {
        try {
            driver = getDriver();
        } catch (IOException e) {
            e.printStackTrace();

        }


        String baseUrl = (String) Driver.getProperty("baseUrl");
        driver.get(baseUrl);


        ClearTripPage clearTripPage = PageFactory.initElements(driver, ClearTripPage.class);
        Driver.scrollToElement(clearTripPage.searchButton);

       // Driver.scrollToBottom();

    }

}
