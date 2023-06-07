package com.ab_tasty.steps;

import com.ab_tasty.navigation.ABtastyNavigation;
import com.ab_tasty.navigation.ABtastyUrls;
import io.cucumber.java.en.Given;

import static com.ab_tasty.navigation.ABtastyNavigation.navigateToABtastyPage;

public class MyStepdefs {
    @Given("the user is navigated to AB Tasty log in page")
    public void userIsNavigatedToABTastyLogInPage() {
        navigateToABtastyPage(ABtastyUrls.LOGIN);
    }
}
