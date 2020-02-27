package test;


import com.firestarters.page.ProductListPage;
import com.firestarters.steps.HeaderSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AddToCartTest extends BaseTest{

   @Steps
    HeaderSteps headerSteps;
    ProductListPage productListPage;

    @Test
    public void addElementBySearching(){
        headerSteps.submitsInSearch();
        productListPage.selectAProduct();

    }




}
