package com.ab_tasty.navigation;

import static com.codeborne.selenide.Selenide.open;
public class ABtastyNavigation {
    private static final String ABTASTY_BASE_URL = "https://app2.abtasty.com/";

    public static void navigateToABtastyPage(ABtastyUrls page) {
        open(ABTASTY_BASE_URL + page.getUrl());
    }
}