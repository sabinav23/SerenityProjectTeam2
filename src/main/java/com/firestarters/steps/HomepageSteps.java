package com.firestarters.steps;

import com.firestarters.page.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class HomepageSteps  {

    @Steps
    HomePage homePage;

    @Steps
    ProductDetailsSteps productDetailsSteps;


    @Step
    public void selectProductFromNewProductsOnHomepage(){
        homePage.selectRandomProductFromNewProductsOnHomepage();
    }

    @Step
    public void selectDetails(){
        productDetailsSteps.configureProductAndAddToCart();
    }
}
