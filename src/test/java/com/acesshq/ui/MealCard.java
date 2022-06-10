package com.acesshq.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class MealCard {

    private WebElement element;

    public MealCard(WebElement element) {
        this.element = element;
    }

    public String getTitle() {
        return this.element.findElement(By.className("name")).getText();
    }


    }


