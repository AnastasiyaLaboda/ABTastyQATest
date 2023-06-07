package com.ab_tasty.steps;

import com.ab_tasty.navigation.ABtastyUrls;
import com.ab_tasty.pages.LoginPage;
import com.ab_tasty.pages.SsoLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.assertj.core.api.Assertions.*;

import static com.ab_tasty.navigation.ABtastyNavigation.navigateToABtastyPage;

public class StepsDefinition {
    private LoginPage loginPage = new LoginPage();
    private SsoLoginPage ssoLoginPage = new SsoLoginPage();

    @Given("an user is navigated to ABTasty log in page")
    public void userIsNavigatedToABTastyLogInPage() {
        navigateToABtastyPage(ABtastyUrls.LOGIN);
    }

    @When("the user enters {string} in the email field")
    public void userEntersEmail(String email) {
        loginPage.inputEmail(email);
    }

    @When("the user enters {string} in the password field")
    public void userEntersPassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("the user clicks on the Sing in button")
    public void userClickOnSingInButton() {
        loginPage.clickOnSignInButton();
    }

    @When("the user click on the Sign in with SSO button")
    public void userClickOnTheSignInWithSSOButton() {
        loginPage.clickOnSignInSsoButton();
    }

    @Then("message {string} is displayed")
    public void defaultErrorMessageIsDisplayed(String message) {
        assertThat(loginPage.getDefaultErrorMessageText())
                .as("The default error message is different from the displayed message")
                .isEqualTo(message);
    }

    @Then("the login Captcha is displayed")
    public void loginCaptchaIsDisplayed() {
        loginPage.verifyLoginRecaptchaIsDisplayed();
    }

    @Then("logo {string} is displayed")
    public void logoIsDisplayed(String logoText) {
        assertThat(ssoLoginPage.getSignInSsoLogoText())
                .isEqualTo(logoText);
    }

    @Then("email field is enable")
    public void emailFieldIsEnable() {
        ssoLoginPage.verifyEmailFieldIsDisplayed();
    }

    @Then("Sing in button is enable")
    public void singInButtonIsEnable() {
        ssoLoginPage.verifySignInButtonIsDisplayed();
    }
}
