package com.firestarters.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Title;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@DefaultUrl("http://qa2.dev.evozon.com/customer/account/")
public class HeaderPage extends AbstractPage {


    public String getTitle() {
        return getDriver().getTitle();
    }

    public String getURL() {
        return getDriver().getCurrentUrl();
    }

    @FindBy(css="p.welcome-msg")
    private WebElementFacade greetMessage;

    @FindBy(css =".nav-2")
    private WebElementFacade category;

    @FindBy(css = ".nav-2-3")
    private WebElementFacade subcategory;

    @FindBy(css = ".logo" )
    private WebElementFacade logo;

    @FindBy(css = " .skip-account " )
    private WebElementFacade accountButton;

    @FindBy(css = " #header-account " )
    private WebElementFacade accountDropDown;

    @FindBy(css = " #select-language > option " )
    private List<WebElementFacade> languageOptions;

    @FindBy(css = " #select-language " )
    private WebElementFacade languageOpt;

    @FindBy (css = " #search " )
    private WebElementFacade searchField;

    @FindBy (css = " .page-title h1 ")
    private WebElementFacade searchTitle;

    public WebElementFacade getLogo() {
        return logo;
    }

    public void navigateBack() {
        getDriver().navigate().forward();
    }

    public WebElementFacade getAccountButton() {

        return accountButton;
    }

    public WebElementFacade getAccountDropDown() {
        return accountDropDown;
    }

    public int getNumberOfOptions() {
        return languageOptions.size();
    }

    public void selectDropdownValues() {
        languageOpt.selectByVisibleText("French");
        assertThat(languageOpt.getSelectedVisibleTextValue(), is("French"));
    }

    public void clearSearchField(){
        searchField.clear();
        Assert.assertTrue( searchField.getText().isEmpty());
    }

    public void fillAndSubmitSearchField() {
        searchField.sendKeys("dress");
        searchField.submit();
    }

    public String getSearchTitle() {
        return searchTitle.getText();
     }

    //Ciuverca Ionut
    public void navigateToAProductSubcategory(){
        Actions action = new Actions(getDriver());
        action.moveToElement(category).perform();
        action.moveToElement(subcategory).click().perform();
    }

    public String getGreetMessage(){
        return greetMessage.getText();
    }


}
