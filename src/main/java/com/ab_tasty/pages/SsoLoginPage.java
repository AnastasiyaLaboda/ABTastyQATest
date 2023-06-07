package com.ab_tasty.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;
import static java.time.Duration.ofSeconds;

public class SsoLoginPage extends BasePage {
    private final SelenideElement signInWithSsoLogo =
            $x("//form[contains(@class, 'SSOLoginPage')]/div[contains(@class, 'header')]");
    private final SelenideElement email = $x("//*[contains(@class, 'commonInput')]");
    private final SelenideElement signInButton = $x("//button[contains(@class, 'button')]");

    public String getSignInSsoLogoText() {
        return signInWithSsoLogo
                .shouldBe(visible, ofSeconds(10))
                .getText();
    }
    public void verifySignInWithSsoLogoDisplayed() {
        signInWithSsoLogo.shouldBe(visible, ofSeconds(10));
    }

    public void verifyEmailFieldIsDisplayed() {
        email.shouldBe(and("clickable", visible, enabled), ofSeconds(10));
    }

    public void verifySignInButtonIsDisplayed() {
        signInButton.shouldBe(and("clickable", visible, enabled), ofSeconds(10));
    }
}
