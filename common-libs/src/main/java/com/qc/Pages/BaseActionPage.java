package com.qc.Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseActionPage {

    private final Logger logger = LoggerFactory.getLogger(BaseActionPage.class);
    private final Faker faker;

    BaseActionPage() {
        faker = new Faker();
    }

    public BaseActionPage enterText(WebElement element, String textToEnter) {
        element.sendKeys(textToEnter);
        return this;
    }


}
