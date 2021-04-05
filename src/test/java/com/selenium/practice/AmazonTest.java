package com.selenium.practice;

import com.selenium.helpers.Driver;
import com.selenium.pages.AmazonPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class AmazonTest  extends Driver {




    @Test
    public void AmazonTest() throws IOException {
        try {
            driver = getDriver();
        } catch (IOException e) {
            e.printStackTrace();

        }


        String amazonBaseUrl = (String) Driver.getProperty("amazonBaseUrl");
        driver.get(amazonBaseUrl);


        AmazonPage amazonPage = PageFactory.initElements(driver, AmazonPage.class);
        Driver.scrollToElement(amazonPage.countryName);
    }
}