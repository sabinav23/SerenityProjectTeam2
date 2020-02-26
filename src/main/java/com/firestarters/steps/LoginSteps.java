package com.firestarters.steps;


import com.firestarters.models.User;
import com.firestarters.page.HeaderPage;
import com.firestarters.page.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class LoginSteps {
    LoginPage loginPage;
    HeaderPage headerPage;
    //generate user types
    @Step
    public User generateUser(){
        User user=new User();
        user.setEmail("manolachi_ioana@yahoo.com");
        user.setPass("manolachiioana");
        return user;
    }
    @Step
    public User generateEmptyUser(){
        User user=new User();
        user.setEmail("");
        user.setPass("");
        return user;

    }
    //---------------------------------------
    @Step
    public void navigateToLoginPage(){
        loginPage.open();
    }
    @Step
    public void fillLoginData(User user){
        loginPage.typeEmail(user.getEmail());
        loginPage.typePass(user.getPass());
    }
    @Step
    public void clickLogin(){
        loginPage.clickLoginButton();
    }
    //login scenarious
    @Step
    public void loginUser(){
        //complete Login fields
        fillLoginData(generateUser());
        //click Login
        clickLogin();
    }
    @Step
    public void loginUserWithEmptyFields(){
        fillLoginData(generateEmptyUser());
        clickLogin();
    }
    //-----------------------------------
    @Step
    public void verifyUserIsLogedIn(String fName, String lName){
        String greetMessage = headerPage.getGreetMessage().toLowerCase();
        Assert.assertTrue(greetMessage.contains(fName.toLowerCase()));
        Assert.assertTrue(greetMessage.contains(lName.toLowerCase()));
    }

    @Step
    public void verifyMessegesAreDisplayed(){
        String requiredEmailMessage=loginPage.getRequiredEmailMessage();
        String requiredPassMessage=loginPage.getRequiredPassMessage();
        Assert.assertEquals(requiredEmailMessage,"This is a required field.");
        Assert.assertEquals(requiredPassMessage,"This is a required field.");
    }

}
