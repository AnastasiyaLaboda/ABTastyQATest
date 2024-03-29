package com.ab_tasty.framework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.ab_tasty.constants.Config.CHROME_DRIVER_PATH;

public class ChromeDriverCreator implements WebDriverCreator<RemoteWebDriver> {
    @Override
    public ChromeDriver create() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        return new ChromeDriver(new ChromeOptions()
                .addArguments("--remote-allow-origins=*")
                .addArguments("enable-features=NetworkServiceInProcess"));
    }
}
