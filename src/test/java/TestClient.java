import Pages.Defaults;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestClient extends BaseTest {

    private static final String SuccessfulMessage = "Клиентът е добавен успешно.";


    @Test
    @DisplayName("Create client successfully")
    public void canCreateClientWithValidInformation() throws InterruptedException {
        loginPage.navigateTo();
        //Assert that we are on Login page
        Assertions.assertEquals("Вход в inv.bg", loginPage.getHeadingText());
        loginPage.enterEmail(Defaults.EMAIL);
        loginPage.enterPassword(Defaults.PASSWORD);
        loginPage.pressLoginButton();
        //Assert that we are logged in successfully
        Assertions.assertEquals(Defaults.EMAIL, homePage.getUserPanelText());
        homePage.clickOnClientsButton();
        //Assert that we are on clients page
        Assertions.assertEquals("Клиенти", clientPage.getHeadTextOnClientPage());
        clientPage.createClient("NovKlient", "Centur", "Sofia");
        //Assert that client is create successfully
        Assertions.assertEquals(SuccessfulMessage, clientPage.getSuccessfullCreateClientMessage());
        Thread.sleep(3000);

    }

    @Test
    @DisplayName("Delete client")
    public void deleteClient() throws InterruptedException {
        loginPage.navigateTo();
        //Assert that we are on Login page
        Assertions.assertEquals("Вход в inv.bg", loginPage.getHeadingText());
        loginPage.enterEmail(Defaults.EMAIL);
        loginPage.enterPassword(Defaults.PASSWORD);
        loginPage.pressLoginButton();
        //Assert that we are logged in successfully
        Assertions.assertEquals(Defaults.EMAIL, homePage.getUserPanelText());
        homePage.clickOnClientsButton();
        //Assert that we are on clients page
        Assertions.assertEquals("Клиенти", clientPage.getHeadTextOnClientPage());
        Thread.sleep(2000);

    }

}
