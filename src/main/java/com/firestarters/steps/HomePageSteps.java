package com.firestarters.steps;

import com.firestarters.page.HomepagePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class HomePageSteps {

    HomepagePage homepagePage;

    @Step
    public void appearsOnHomepage() {
        Assert.assertEquals("Madison Island", homepagePage.getTitle());
        System.out.println(homepagePage.getTitle());
    }

    @Step
    public void isTheCorrectURL() {
        Assert.assertEquals("http://qa2.dev.evozon.com/", homepagePage.getURL());
        System.out.println(homepagePage.getURL());
    }

    @Step
    public void logoIsDisplayed() {
        Assert.assertTrue(homepagePage.getLogo().isDisplayed());
    }

    @Step
    public void clickOnLogo() {
        logoIsDisplayed();
        homepagePage.getLogo().click();
    }

    @Step
    public void navigateBack() {
        homepagePage.navigateBack();
    }

    @Step
    public void clickOnAccountButton() {
        homepagePage.getAccountButton().click();
    }

    @Step
    public void isAccountDropDownDIsplayed() {
        clickOnAccountButton();
        Assert.assertTrue(homepagePage.getAccountDropDown().isDisplayed());
    }

    @Step
    public void checkAccountText() {
        Assert.assertEquals("ACCOUNT", homepagePage.getAccountButton().getText());
    }

    @Step
    public void verifyTheNumberOfLanguages() {
        Assert.assertTrue(homepagePage.getNumberOfOptions() == 3);
    }

    @Step
    public void selectTheNewLanguage() {
        homepagePage.selectDropdownValues();
    }

    @Step
    public void clearsSearchField(){
        homepagePage.clearSearchField();
    }

    @Step
    public void submitsInSearch(){

    }



}
