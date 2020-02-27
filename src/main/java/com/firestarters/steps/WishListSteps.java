package com.firestarters.steps;

import com.firestarters.page.WishListPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;



public class WishListSteps extends ScenarioSteps {
    WishListPage wishListPage;
    @Steps
    HeaderSteps headerSteps;
    @Steps
    LoginSteps loginSteps;

    @Step
    public void clicksOnWishListBtnWhenNotLoggedIn(){
        headerSteps.clickOnAccountButton();

        wishListPage.getWishListBtn().click();

        String registerURL = getDriver().getCurrentUrl();
        Assert.assertEquals("http://qa2.dev.evozon.com/customer/account/login/", registerURL);
    }

    public void clicksOnWishListWhenLoggedIn(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginUser();
        headerSteps.clickOnAccountButton();
        wishListPage.getWishListBtn().click();
        String registerURL = getDriver().getCurrentUrl();
        Assert.assertEquals("http://qa2.dev.evozon.com/wishlist/", registerURL);

    }
}
