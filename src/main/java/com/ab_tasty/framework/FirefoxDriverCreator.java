package com.ab_tasty.framework;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.ab_tasty.constants.Config.GECKO_DRIVER_PATH;

public class FirefoxDriverCreator implements WebDriverCreator<RemoteWebDriver> {
    @Override
    public FirefoxDriver create() {
        System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_PATH);
        return new FirefoxDriver();
    }
}
