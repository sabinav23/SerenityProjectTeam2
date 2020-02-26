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
<<<<<<< HEAD
//        homePageSteps.goToProductsPage();
=======
<<<<<<< HEAD
        headerSteps.goToProductsPage();
=======
        //homePageSteps.goToProductsPage();
>>>>>>> 056d19bff6c4427d993fa1f3733ef496c0053840
>>>>>>> cde4c8d0517afc442b6e1ea1298424436995c640
        productPageSteps.selectAProduct();
        productDetailsSteps.configureProductAndAddToCart();
        searchPageSteps.addProductFromSearch();
        cartPageSteps.proceedToCheckout();
        checkoutPageSteps.selectCheckoutMethodAndContinue();
        checkoutPageSteps.completeTheCheckoutStepsAndPlaceOrder();
    }
}
