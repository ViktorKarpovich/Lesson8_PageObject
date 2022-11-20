package org.tms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage{

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    private WebElement cartButton;

    public String getTextOfNameOfMainPageSection() {
        return nameOfMainPageSection.getText();
    }

    public void clickAddToCartButton(){
        addToCartButton.click();
    }

    public void clickGoToCartButton(){
        cartButton.click();
    }

    public boolean checkAddToCartButtonDisplayed(){
        return addToCartButton.isDisplayed();
    }

}
