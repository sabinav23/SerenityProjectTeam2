package com.firestarters.page;

import com.firestarters.steps.ProductDetailsSteps;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Random;

@DefaultUrl("http://qa2.dev.evozon.com")
public class HomePage extends AbstractPage {


    @FindBy ( css = ".widget-products ul li.item > a")
    private List<WebElementFacade> newProductsSectionList;
    
	@FindBy(css = ".nav-5.parent > a")
	private WebElementFacade saleHeaderOption;

	@FindBy(css = "li[class=\"level0 nav-2 parent\"]")
	private WebElementFacade menHeaderOption;
	
	@FindBy(css=".level0.nav-1.first.parent>a")
	private WebElementFacade womenHeaderOption;
	
	@FindBy(css = "#newsletter")
	private WebElementFacade newsletterInputField;
	
	@FindBy(css= ".success-msg>ul>li>span")
	private WebElementFacade subscriptionSuccessMessage;

	@FindBy(css="button[title=\"Subscribe\"]")
	private WebElementFacade newsletterSubscribeButton;
	
	@FindBy(css=".validation-advice")
	private WebElementFacade validationAdvice;
	
	public void clickOnMenHeaderOption() {
		menHeaderOption.click();
	}

	public void clickOnSaleHeaderOption() {
		saleHeaderOption.click();
	}
	
	public void womenHeaderOption() {
		womenHeaderOption.click();
	}
	
	public void fillInNewsletterInput(String emailAddress) {
		newsletterInputField.clear();
		newsletterInputField.sendKeys(emailAddress);	
	}
	
	public void clickNewsletterSubscribe() {
		newsletterSubscribeButton.click();
	}
    
	public String getSubscriptionSuccessMessage() {
	    if(validationAdvice.isCurrentlyVisible()) {
	    	return validationAdvice.getText();
	    }
	
		String message1 = subscriptionSuccessMessage.getText();
	    
		return message1;
		
	}
	
	public boolean isSubscriptionSuccessMessageVisible() {
		return subscriptionSuccessMessage.isVisible();
	}
	

    public void selectRandomProductFromNewProductsOnHomepage(){
        Random productsSectionSize = new Random();
        WebElementFacade randomNewProducts = newProductsSectionList.get(productsSectionSize.nextInt(newProductsSectionList.size()));
        randomNewProducts.click();
    }







}
