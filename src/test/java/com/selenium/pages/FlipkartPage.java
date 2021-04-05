package com.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartPage {

    @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
    public WebElement close;
    @FindBy(xpath=" //img[@alt='Best Selling Laptops (Up to 40 % Off)']")
     public WebElement laptops;

    @FindBy(xpath = "//div[contains(@class,'_12FhcQ')]/div[1]/div")
    public WebElement priceDragLeft;

    @FindBy(xpath = "//div[contains(@class,'_12FhcQ')]/div[2]/div")
    public WebElement priceDragRight;
}
