package actions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public final class LoginActivityObject {

    private final AndroidDriver androidDriver;

    private MobileElement loginButton;
    private MobileElement cancelButton;
    private MobileElement userNameField;
    private MobileElement passwordField;

    public LoginActivityObject(final AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
    }

    private MobileElement getLoginButton() {
        if (loginButton == null) {
            loginButton = (MobileElement) androidDriver.findElementById("com.example.android:id/button");
        }
        return loginButton;
    }

    private MobileElement getCancelButton() {
        if (cancelButton == null) {
            cancelButton = (MobileElement) androidDriver.findElementById("com.example.android:id/button2");
        }
        return cancelButton;
    }

    private MobileElement getUserNameField() {
        if (userNameField == null) {
            userNameField = (MobileElement) androidDriver.findElementById("com.example.android:id/editTextTextEmailAddress");
        }
        return userNameField;
    }

    private MobileElement getPasswordField() {
        if (passwordField == null) {
            passwordField = (MobileElement) androidDriver.findElementById("com.example.android:id/editTextTextPassword");
        }
        return passwordField;
    }

    public void findLoginButton() {
        getLoginButton();
    }

    public void findCancelButton() {
        getCancelButton();
    }

    public void setUserName(String userName) {
        getUserNameField().sendKeys(userName);
    }

    public void setPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    public void clickLoginButton() {
        getLoginButton().click();
    }

    public void clickCancelButton() {
        getCancelButton().click();
    }

    public String getUserName() {
        return getUserNameField().getText();
    }

    public String getPassword() {
        return getPasswordField().getText();
    }
}
