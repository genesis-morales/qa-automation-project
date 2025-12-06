package com.automation.tests;

import com.automation.core.DriverManager;
import com.automation.pages.RegisterPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterTest {
    private WebDriver driver;
    private RegisterPage registerPage;

    @BeforeEach
    void setUp() {
        driver = new DriverManager().getDriver();
        registerPage = new RegisterPage(driver);
        registerPage.visit("https://demo.guru99.com/test/newtours/");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void testRegister() {
        registerPage.registerUser();
        assertEquals("Note: Your user name is useradmin.",
                registerPage.getRegisteredMessage());
    }
}
