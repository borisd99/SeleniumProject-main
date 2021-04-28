import Pages.Defaults;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LoginAndLogoutTest extends BaseTest{
    private String LOGIN_ERROR_MESSAGE = "Грешно потребителско име или парола. Моля, опитайте отново.";
    private String LOGOUT_SUCCESSFUL_MESSAGE = "Вие излязохте от акаунта си.";


    @Test
    @DisplayName("Can login with valid credentials and logout successfully")
    public void canLoginAndLogoutSuccessfully() {
        loginPage.navigateTo();
        //Assert login page heading
        Assertions.assertEquals("Вход в inv.bg", loginPage.getHeadingText());
        loginPage.enterEmail(Defaults.EMAIL);
        loginPage.enterPassword(Defaults.PASSWORD);
        loginPage.pressLoginButton();
        //Assert that login was successful
        Assertions.assertEquals(Defaults.EMAIL, homePage.getUserPanelText());
        homePage.logout();
        //Assert that we are logout successfully
        Assertions.assertEquals(LOGOUT_SUCCESSFUL_MESSAGE, loginPage.logoutSuccessfulMessage());
    }

    @Test
    @DisplayName("Can't login with invalid credentials")
    public void cantLoginSuccessfully() {
        loginPage.navigateTo();
        //Assert login page heading
        Assertions.assertEquals("Вход в inv.bg", loginPage.getHeadingText());
        loginPage.enterEmail(Defaults.EMAIL);
        loginPage.enterPassword("123");
        loginPage.pressLoginButton();
        //Assert that login was unsuccessful
        Assertions.assertEquals(LOGIN_ERROR_MESSAGE, loginPage.getLoginErrorMessage());

    }



}
