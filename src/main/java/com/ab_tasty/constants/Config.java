package com.ab_tasty.constants;

public class Config {
    public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\browsers\\chromedriver.exe";
    public static final String EDGE_DRIVER_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\browsers\\msedgedriver.exe";
    public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\browsers\\geckodriver.exe";

    public static String BROWSER_TO_OPEN = "chrome";
}
