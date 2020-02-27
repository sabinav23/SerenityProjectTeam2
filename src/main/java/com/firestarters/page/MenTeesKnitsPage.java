package com.firestarters.page;

import java.util.List;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.dev.evozon.com/men/tees-knits-and-polos.html")
public class MenTeesKnitsPage extends AbstractPage {
	
	@FindBy(css="span.price")
	private List<WebElementFacade> productPriceList;
	
	@FindBy(css="select[title=\"Sort By\"]")
	private WebElementFacade sortBySelect;
	
	public void clickSortByPriceOption() {
		sortBySelect.selectByVisibleText("Price");
	}
	
	public boolean checkSortByPriceAscending() {
		boolean isCorrect = true;
		
		for(int i = 0; i < productPriceList.size()-1; i++) {
			if(Double.valueOf(productPriceList.get(i).getText().replace("$", "")) > Double.valueOf(productPriceList.get(i + 1).getText().replace("$",""))) {
				isCorrect = false;
				return isCorrect;
			}
		}
		
		return isCorrect;
		
	}
	
	
	
	

}
