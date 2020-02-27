package test;


import com.firestarters.page.ProductDetailsPage;
import com.firestarters.page.ProductListPage;
import com.firestarters.page.SearchPage;
import com.firestarters.steps.HeaderSteps;
import com.firestarters.steps.HomepageSteps;
import com.firestarters.steps.ProductDetailsSteps;
import com.firestarters.steps.SearchPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AddToCartTest extends BaseTest{

   @Steps
    SearchPageSteps searchPageSteps;

   @Steps
    HomepageSteps homepageSteps;


    @Test
    public void addElementBySearchingTest(){
   searchPageSteps.addProductFromSearch("dress", "dress");
    }

    @Test
    public void addElementFromHomepageTest(){
        homepageSteps.selectProductFromNewProductsOnHomepage();
        homepageSteps.selectDetails();
    }




}
