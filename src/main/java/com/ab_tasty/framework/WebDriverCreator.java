package com.ab_tasty.framework;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface WebDriverCreator<T extends RemoteWebDriver> {
    T create();
}
