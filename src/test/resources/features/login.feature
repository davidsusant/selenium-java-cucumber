@login
  Feature: SauceDemo Login Functionality

    Background:
      Given I am on the SauceDemo login page

    @smoke @positive
      Scenario: Successful login with valid credentials
        When I enter username "standard_user" and password "secret_sauce"
        Then I should be redirected to the products page