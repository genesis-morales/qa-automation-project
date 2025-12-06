package com.automation.tests;

import com.automation.core.DriverManager;
import com.automation.pages.SignInPage;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SignInTest {

    @ParameterizedTest(name = "[{index}] user={0}, pass={1}, success={2}")
    @CsvSource({
            "useradmin, password, true",
            "useradmin, wrongpass, false",
            "wronguser, password, false"
    })
    void signInScenarios(String user, String pass, boolean shouldSucceed) {
        DriverManager dm = new DriverManager();
        WebDriver driver = dm.getDriver();   // nuevo driver para este caso

        try {
            SignInPage signInPage = new SignInPage(driver);
            signInPage.visit("https://demo.guru99.com/test/newtours/");
            signInPage.signIn(user, pass);

            if (shouldSucceed) {
                assertTrue(signInPage.isSuccessLoginVisible());
            } else {
                assertTrue(signInPage.isInvalidLoginVisible());
            }
        } finally {
            driver.quit();
        }
    }
}