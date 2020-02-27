package test;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.firestarters.steps.HomepageSteps;
import com.firestarters.steps.MainPageSteps;
import com.firestarters.steps.MenPageSteps;
import com.firestarters.steps.ProductSortingSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ProductSortingTest extends BaseTest{
	@Steps
	HomepageSteps mainPageSteps;
	
	@Steps
	MenPageSteps menPageSteps;
	
	@Steps
	ProductSortingSteps productSorting;
	
	@Test
	public void checkMenTeesAscendingPriceSort() {
		mainPageSteps.clickOnMenSection();
		menPageSteps.selectTeesKnitsPolosCategory();
		productSorting.verifyAscendingSortByPrice();
	}
	
	@Test
	public void checkMenTeesDescendingPriceSort() {
		mainPageSteps.clickOnMenSection();
		menPageSteps.selectTeesKnitsPolosCategory();
		productSorting.verifyDescendingSortByPrice();;
	}
	
	@Test
	public void checkMenTeesAscendingNameSort() {
		mainPageSteps.clickOnMenSection();
		menPageSteps.selectTeesKnitsPolosCategory();
		productSorting.verifyAscendingSortByName();
		
	}
	
	@Test
	public void checkMenTeesDescendingNameSort() {
		mainPageSteps.clickOnMenSection();
		menPageSteps.selectTeesKnitsPolosCategory();
		productSorting.verifyDescendingSortByName();;
		
	}
	
	
	
	

}
