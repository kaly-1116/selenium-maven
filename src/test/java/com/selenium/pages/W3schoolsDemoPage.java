package com.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class W3schoolsDemoPage {

    @FindBy(id = "iframeResult")
    public WebElement iframe;

    @FindBy(xpath = "//p")
    public WebElement para;

    @FindBy(id = "drag1")
    public WebElement src;

    @FindBy(id = "div1")
    public WebElement des;

    @FindBy(partialLinkText = "Try it Yourself »")
    public WebElement tryLink;

    @FindBy(linkText = "LEARN HTML")
 public WebElement learnHtmlLink;
}
