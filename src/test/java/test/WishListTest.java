package test;

import com.firestarters.steps.WishListSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class WishListTest extends BaseTest {

    @Steps
    WishListSteps wishListSteps;

    @Test
    public void isLoginPageDisplayedWhenNotLoggedIn(){
        wishListSteps.clicksOnWishListBtnWhenNotLoggedIn();
    }
    @Test
    public void isMyWishlistPageDisplayedWhenLoggedIn(){
        wishListSteps.clicksOnWishListWhenLoggedIn();
    }

}