package com.ab_tasty.pages;

import com.ab_tasty.framework.DriverManager;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public abstract class BasePage {
    public BasePage() {
        DriverManager.initDriver();
    }

    public String getCurrentUrl() {
        return getWebDriver().getCurrentUrl();
    }

    public void exitFrame() {
        getWebDriver().switchTo().defaultContent();
    }
}
