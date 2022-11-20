package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.pages.CartPage;
import org.tms.pages.InventoryPage;
import org.tms.services.LoginPageService;

public class AddingToCartTest extends BaseTest{

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
    public void addingToCartTest() {
        inventoryPage.clickAddToCartButton();
        inventoryPage.clickGoToCartButton();
        Assert.assertTrue(cartPage.checkButtonDisplayed(), "Test");
    }

}
