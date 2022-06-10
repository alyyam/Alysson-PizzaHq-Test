package com.acesshq.pages;

import com.acesshq.ui.MealCard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class MenuPage extends BasePage {

        public MenuPage(WebDriver driver) {
            super(driver);
        }

    public ArrayList<WebElement> getVeganPizza(){
        var veganPizzas= new ArrayList<WebElement>();
        for(WebElement pizza : driver.findElements(By.className(".v-badge__badge orange"))) {
            veganPizzas.add(pizza);
        }
        return veganPizzas;
    }
    }
