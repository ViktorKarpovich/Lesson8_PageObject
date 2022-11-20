package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.pages.BasePage;
import org.tms.pages.CartPage;
import org.tms.pages.InventoryPage;
import org.tms.services.LoginPageService;

public class RemovingFromCartTest extends BaseTest {
    private LoginPageService loginPageService;
    private InventoryPage inventoryPage;

    private CartPage cartPage;

    @BeforeClass
    public void setUp(){
        loginPageService = new LoginPageService();
        inventoryPage = new InventoryPage();
        cartPage = new CartPage();
        User user = new User();
        loginPageService.login(user);
    }

    @Test
    public void removingFromCartTest(){
        inventoryPage.clickAddToCartButton();
        inventoryPage.clickGoToCartButton();
        cartPage.clickRemoveButton();
        cartPage.clickContinueButton();
        Assert.assertTrue(inventoryPage.checkAddToCartButtonDisplayed(), "Test");
    }

}
