package test;

import com.firestarters.page.ProductListPage;
import com.firestarters.steps.LoginSteps;
import com.firestarters.steps.SearchPageSteps;
import com.firestarters.steps.WishListSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class WishListTest extends BaseTest {

    @Steps
    WishListSteps wishListSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    SearchPageSteps searchPageSteps;

    @Test
    public void isLoginPageDisplayedWhenNotLoggedIn(){
        wishListSteps.clicksOnWishListBtnWhenNotLoggedIn();
    }
    @Test
    public void isMyWishlistPageDisplayedWhenLoggedIn(){
        wishListSteps.clicksOnWishListWhenLoggedIn();
    }
    @Test
    public void clickOnWishlistBtnInCart() {
        loginSteps.navigateToLoginPage();
        loginSteps.loginUser();
        searchPageSteps.addProductFromSearch("dress", "dress");
        wishListSteps.clickOnWishListBtninCart();
        Assert.assertTrue(wishListSteps.getSuccesMsgAddedInWishlist().contains("moved to wishlist Wishlist"));
    }

}