package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {

    private By userLocator = By.name("userName");
    private By passLocator = By.name("password");
    private By signInBtnLocator = By.name("submit");

    // Locator para el mensaje de credenciales inválidas
    private By invalidCredentialsMessage = By.xpath(
            "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/span"
    );

    // Locator para el mensaje de login exitoso (ajusta al elemento real de la página siguiente)
    private By successMessage = By.xpath("//b[contains(text(),'Thank you for Loggin')]");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void signIn(String username, String password) {
        type(username, userLocator);
        type(password, passLocator);
        click(signInBtnLocator);
    }

    public String getInvalidCredentialsMessage() {
        return getText(invalidCredentialsMessage);
    }

    public String getSuccessMessage() {
        return getText(successMessage);
    }

    public boolean isInvalidLoginVisible() {
        return isDisplayed(invalidCredentialsMessage);
    }

    public boolean isSuccessLoginVisible() {
        return isDisplayed(successMessage);
    }
}