package com.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LipotechPage {

    @FindBy(className = "fancybox-iframe")
    public WebElement fancybox;

    @FindBy(xpath = "//div[@class='selubicacion__zonas']/div[2]//img")
    public WebElement asiaPacific;
}
