package com.ab_tasty.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;
import static java.time.Duration.ofSeconds;

public class LoginPage extends BasePage {
    private final SelenideElement emailField = $x("//*[@id='email']");
    private final SelenideElement passwordField = $x("//*[@id='password']");
    private final SelenideElement defaultErrorMessage = $x("//div[contains(@class, 'commonError')]");
    private final SelenideElement signInButton = $x("//div[contains(@class, 'FormButtonRow')]//button");
    private final SelenideElement loginRecaptcha = $x("//div/iframe[@title='reCAPTCHA']");
    private final SelenideElement signInSsoButton = $x("//div[contains(@class, 'ssoSection')]//button");

    public LoginPage inputEmail(String email) {
        emailField.click();
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage inputPassword(String password) {
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage clickOnSignInButton() {
        signInButton
                .shouldBe(enabled, ofSeconds(10))
                .click();
        return this;
    }

    public SsoLoginPage clickOnSignInSsoButton() {
        signInSsoButton
                .shouldBe(enabled, ofSeconds(10))
                .click();
        return new SsoLoginPage();
    }

    public String getDefaultErrorMessageText() {
        return defaultErrorMessage
                .shouldBe(visible, ofSeconds(10))
                .getText();
    }

    public void verifyLoginRecaptchaIsDisplayed() {
        loginRecaptcha.should(enabled, ofSeconds(10));
    }
}
