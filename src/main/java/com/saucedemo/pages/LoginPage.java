package com.saucedemo.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(className = "login_logo")
    private WebElement loginLogo;

    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @Step("Navigate to login page")
    public void navigateToLoginPage() {
        driver.get("https://www.saucedemo.com/");
        waitForElementToBeVisible(loginLogo);
    }

    @Step("Enter username: {username}")
    public void enterUsername(String username) {
        sendKeys(usernameField, username);
    }

    @Step("Enter password")
    public void enterPassword(String password) {
        sendKeys(passwordField, password);
    }

    @Step("Click login button")
    public void clickLoginButton() {
        click(loginButton);
    }

    @Step("Login with credentials: {username}")
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}
