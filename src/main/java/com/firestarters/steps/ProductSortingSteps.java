package com.firestarters.steps;

import org.junit.Assert;

import com.firestarters.page.MainPage;
import com.firestarters.page.MenTeesKnitsPage;

import net.thucydides.core.annotations.Step;

public class ProductSortingSteps {
	
	MainPage mainPage;
	MenTeesKnitsPage teesKnitsProductPage;
	
	
	@Step
	public void verifyAscendingSortByPrice() {
		teesKnitsProductPage.clickSortByPriceOption();
		Assert.assertTrue(teesKnitsProductPage.checkSortByPriceAscending());;
		
	}

}
