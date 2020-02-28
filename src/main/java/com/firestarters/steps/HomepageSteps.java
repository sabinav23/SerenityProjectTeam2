package com.firestarters.steps;

import org.junit.Assert;

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
    @Step
    public void clickOnSaleSection() {
    	homePage.clickOnSaleHeaderOption();
    }
    
    @Step
    public void clickOnMenSection() {
   	 homePage.clickOnMenHeaderOption();
    }
    
    @Step
    public void clickOnWomenSection() {
    	homePage.womenHeaderOption();
    }
    
    @Step
    public void testSubscriptionInput(String emailAddress, String expectedResult) {
    	homePage.fillInNewsletterInput(emailAddress);
    	homePage.clickNewsletterSubscribe();
    	String actualResult = homePage.getSubscriptionSuccessMessage();
    	Assert.assertTrue(actualResult.equals(expectedResult));
    	
    	
    	
    }
    
   
}
