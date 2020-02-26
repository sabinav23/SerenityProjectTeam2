package test;



import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.firestarters.steps.HomePageSteps;

@RunWith(SerenityRunner.class)
public class HomePageTest extends BaseTest {

   @Steps
    HomePageSteps homePageSteps;


   @Test
    public void checkTitleTest(){
        homePageSteps.appearsOnHomepage();
    }

    @Test
    public void checkURL(){
       homePageSteps.isTheCorrectURL();
    }

    @Test
    public void logoIsDisplayed(){
       homePageSteps.logoIsDisplayed();
    }

    @Test
    public void clickOnLogo(){
       homePageSteps.clickOnLogo();
    }

    @Test
    public void navigateBack(){
       homePageSteps.navigateBack();
    }

    @Test
    public void clickOnAccount(){
       homePageSteps.clickOnAccountButton();
    }

    @Test
    public void checkAccountDropDown(){
       homePageSteps.isAccountDropDownDIsplayed();
    }

    @Test
    public void checkAccountTextIsCorrect(){
       homePageSteps.checkAccountText();
    }

    @Test
    public void checkTheNumberOfLanguages(){
       homePageSteps.verifyTheNumberOfLanguages();

    }

    @Test
    public void newLanguageIsSelected(){
       homePageSteps.selectTheNewLanguage();

    }

    @Test
    public void clearSearchField() {
        homePageSteps.clearsSearchField();
    }

    String word = "DRESS";
    @Test
    public void submitInSearch(String word){

    }

}
