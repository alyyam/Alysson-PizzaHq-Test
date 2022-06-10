package com.acesshq.test;

import com.acesshq.pages.HomePage;
import com.acesshq.pages.MenuPage;
import com.acesshq.ui.MealCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class MenuPageTests extends BaseTestSuite{


    @Test
    void testVeganPizzaPrice() throws Exception {
        HomePage homePage = new HomePage(driver);
        MenuPage menuPage = homePage.clickMenuMenuItem();

        var veganPizzas = driver.findElement(By.partialLinkText("Vegan"));



    }


}




