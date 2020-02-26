package test;


import com.firestarters.steps.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {
    @Steps
    LoginSteps loginSteps;
    @Test
    public void loginHappyFlow(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginUser();
        String fName="Manolachi".toLowerCase();
        String lName="Ioana".toLowerCase();
        loginSteps.verifyUserIsLogedIn(fName,lName);
    }
    @Test
    public void loginWithoutUserAndPass(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginUserWithEmptyFields();
        loginSteps.verifyMessegesAreDisplayed();
    }
}
