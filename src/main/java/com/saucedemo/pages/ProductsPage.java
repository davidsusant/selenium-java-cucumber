package com.saucedemo.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{
    @FindBy(className = "title")
    private WebElement pageTitle;

    @Step("Verify products page is displayed")
    public boolean isProductsPageDisplayed() {
        waitForElementToBeVisible(pageTitle);
        return getText(pageTitle).equals("Products");
    }
}
