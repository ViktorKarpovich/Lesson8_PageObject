package org.tms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement removeButton;

    @FindBy(xpath = "//button[@id='continue-shopping']")
    private WebElement continueButton;

    public boolean checkButtonDisplayed(){
        return removeButton.isDisplayed();
    }


    public void clickRemoveButton(){
        removeButton.click();
    }
    public void clickContinueButton(){
        continueButton.click();
    }

}
