package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class W3schoolsPage {

   @FindBy(id = "iframeResult")
    public WebElement outerIframe;

   @FindBy(id = "iframe")
   public WebElement iframe;

   @FindBy(xpath = "//iframe[contains(@title,'W3Schools')]")
   public WebElement innerIframe;

   @FindBy(xpath = "//h1")
   public WebElement heading;


  //  String text = driver.findElement(By.xpath("/html/body/h1")).getText();
// System.out.println("text")
}
