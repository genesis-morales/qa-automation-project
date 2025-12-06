package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;

import java.util.List;

public class RegisterPage extends BasePage {

    By registerLinkLocator = By.linkText("REGISTER");
    By registerPageLocator = By.xpath("//img[@src='images/mast_register.gif']");

    By usernameLocator = By.id("email");
    By passwordLocator = By.name("password");
    By confirmPasswordLocator = By.cssSelector("input[name='confirmPassword']");

    By registerBtnLocator = By.name("submit");
    By registeredMessage = By.tagName("font");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void registerUser() {
        click(registerLinkLocator);

        if (isDisplayed(registerPageLocator)) {
            type("useradmin", usernameLocator);
            type("password", passwordLocator);
            type("password", confirmPasswordLocator);
            click(registerBtnLocator);
        } else {
            System.out.println("Register page was not found");
        }
    }

    public String getRegisteredMessage() {
        List<WebElement> fonts = findAll(registeredMessage);
        return fonts.get(5).getText();
    }
}
