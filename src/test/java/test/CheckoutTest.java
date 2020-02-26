package test;

import com.firestarters.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CheckoutTest extends BaseTest {

    @Steps
    HeaderSteps headerSteps;

    @Steps
    ProductPageSteps productPageSteps;

    @Steps
    ProductDetailsSteps productDetailsSteps;

    @Steps
    SearchPageSteps searchPageSteps;

    @Steps
    CartPageSteps cartPageSteps;

    @Steps
    CheckoutPageSteps checkoutPageSteps;

    @Test
    public void checkoutTest(){
        headerSteps.goToProductsPage();
        productPageSteps.selectAProduct();
        productDetailsSteps.configureProductAndAddToCart();
        searchPageSteps.addProductFromSearch();
        cartPageSteps.proceedToCheckout();
        checkoutPageSteps.selectCheckoutMethodAndContinue();
        checkoutPageSteps.completeTheCheckoutStepsAndPlaceOrder();
    }
}
