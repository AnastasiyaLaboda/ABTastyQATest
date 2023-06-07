package com.ab_tasty.framework;
import com.codeborne.selenide.Configuration;

import static com.ab_tasty.constants.WaitTimeouts.IMPLICIT_WAIT;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class DriverManager {
    public static void initDriver() {
        Configuration.browser = DriverProvider.class.getName();
        Configuration.pageLoadTimeout = IMPLICIT_WAIT;
        open();
        getWebDriver().manage().window().maximize();
    }
}
