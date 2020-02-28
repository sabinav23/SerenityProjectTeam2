package test;

import com.firestarters.steps.CartPageSteps;
import com.firestarters.steps.LoginSteps;
import com.firestarters.steps.SearchPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CartPageTest extends BaseTest{

    @Steps
    CartPageSteps cartPageSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    SearchPageSteps searchPageSteps;

    @Test
    public void correctSubtotal(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginUser();
        searchPageSteps.addProductFromSearch("eye","eye");
        searchPageSteps.addProductFromSearch("table","table");
       // webdriver.get("http://qa2.dev.evozon.com/checkout/cart/");
        cartPageSteps.verifyIfSubtotalIsCorrect();
    }
}
