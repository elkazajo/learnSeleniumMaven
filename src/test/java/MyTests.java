import org.testng.annotations.Test;
import pages.LoginPage;

public class MyTests extends BaseTest {
    @Test
    public void loginPageTest() {
        LoginPage loginPage = new LoginPage(driver);

        openUrl();

        loginPage.inputUserName("selenium.tester")
                .enterPassword("PRARppro3*u3")
                .clickLoginButton();
    }
}
