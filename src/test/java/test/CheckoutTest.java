package test;

import com.firestarters.steps.*;
import com.firestarters.utils.Constants;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 *
 * @author ionutciuverca
 *
 */
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = Constants.CSV_FILES_PATH + "ciuve.csv")
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

    public String searchWord, expectedWordInTitle;
    @Test
    public void checkoutTest(){
        headerSteps.goToProductsPage();
        productPageSteps.selectAProduct();
        productDetailsSteps.configureProductAndAddToCart();
        //give this params : // "Eye" and "eye"
        searchPageSteps.addProductFromSearch(searchWord, expectedWordInTitle);
        cartPageSteps.proceedToCheckout(2);
        checkoutPageSteps.selectCheckoutMethodAndContinue();
        checkoutPageSteps.completeTheCheckoutStepsAndPlaceOrder();
    }
}
