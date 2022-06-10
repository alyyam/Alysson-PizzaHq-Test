package com.acesshq.test;

import com.acesshq.pages.ContactPage;
import com.acesshq.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactsPageTest extends BaseTestSuite {

    @Test
    void testFieldValidation() {
        HomePage homePage = new HomePage(driver);
        ContactPage contactPage = homePage.clickContactMenuItem();
        contactPage.setEmail("xxx");
        contactPage.setTelephone("xxx");
        contactPage.clickSubmit();

        Assertions.assertEquals("Email is invalid", contactPage.getEmailErrorText(), "Validate the email error is correct.");
        Assertions.assertEquals("Telephone is invalid", contactPage.getTelephoneErrorText(), "Validate the telephone error is correct.");

        contactPage.clickClear();

        Assertions.assertEquals("", contactPage.getEmailErrorText(), "Validate the email error is not shown.");
        Assertions.assertEquals("", contactPage.getTelephoneErrorText(), "Validate the telephone error is not shown.");

    }



}
