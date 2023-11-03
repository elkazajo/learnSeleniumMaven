package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{
    @FindBy(className = "resplash-btn")
    WebElement enterButton;

    @FindBy(css = "[name=\"username\"]")
    WebElement usernameInputField;
    @FindBy(css = "[data-test-id=\"next-button\"]")
    WebElement enterPasswordButton;
    @FindBy(css = "[name=\"password\"]")
    WebElement passwordInputField;
    @FindBy(css = "[data-test-id=\"submit-button\"]")
    WebElement loginButton ;
    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public LoginPage ClickEnterButton() {
        click(enterButton);
        return this;
    }

    public LoginPage inputUserName(String username) {
        click(usernameInputField);
        enterText(usernameInputField, username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(enterPasswordButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(passwordInputField)).click();
        wait.until(ExpectedConditions.elementToBeClickable(passwordInputField)).sendKeys(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        return this;
    }
}
