package com.saucedemo.stepdefinitions;

import com.saucedemo.config.DriverManager;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepDefinitions {
    private LoginPage loginPage;
    private ProductsPage productsPage;

    @Before
    public void setUp() {
        DriverManager.initializeDriver();
        loginPage = new LoginPage();
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }

    @Given("I am on the SauceDemo login page")
    public void i_am_on_the_saucedemo_login_page() {
        loginPage.navigateToLoginPage();
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("I should be redirected to the products page")
    public void i_should_be_redirected_to_the_products_page() {
        Assert.assertTrue(productsPage.isProductsPageDisplayed(), "Products page should be displayed after successful login");
    }
}
