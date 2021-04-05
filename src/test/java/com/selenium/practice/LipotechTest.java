package com.selenium.practice;

import com.selenium.helpers.Driver;
import com.selenium.pages.AmazonPage;
import com.selenium.pages.LipotechPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

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

        driver.switchTo().frame(lipotechPage.fancybox);
        lipotechPage.asiaPacific.click();

        driver.switchTo().defaultContent();
        System.out.println(driver.getTitle());

    }
}
