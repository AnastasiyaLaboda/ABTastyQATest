package com.ab_tasty.framework;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.ab_tasty.constants.Config.EDGE_DRIVER_PATH;

public class EdgeDriverCreator implements WebDriverCreator<RemoteWebDriver> {
    @Override
    public EdgeDriver create() {
        System.setProperty("webdriver.edge.driver", EDGE_DRIVER_PATH);
        return new EdgeDriver();
    }
}
