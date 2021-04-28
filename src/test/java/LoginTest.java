import Pages.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseForBrowser {

    @Test
    @DisplayName("Can login with valid credentials")
    public void canLoginSuccessfully() {
        loginPage.navigateTo();
    }


}
