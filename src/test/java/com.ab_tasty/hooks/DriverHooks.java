package com.ab_tasty.hooks;

import com.ab_tasty.framework.DriverManager;
import io.cucumber.java.BeforeAll;

public class DriverHooks {
    @BeforeAll
    public static void setUpDriver() {
        DriverManager.initDriver();
    }
}