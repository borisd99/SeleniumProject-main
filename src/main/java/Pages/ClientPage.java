package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientPage {

    private WebDriver driver;

    public ClientPage(WebDriver driver){
        this.driver = driver;
    }

    public ClientPage clickOnAddClientButton() {
        System.out.println("Clicking on add client");
        driver.findElement(By.xpath("//a[@class='newbtn selenium-add-client-button']")).click();
        return this;
    }


    public String getHeadTextOnClientPage() {
        return driver.findElement(By.xpath("//div[@id=\"headline2\"]/h2")).getText();
    }

    public ClientPage enterNameOfClient(String name) {
       WebElement nameField = driver.findElement(By.xpath("//input[@name=\"firm_name\"]"));
       nameField.clear();
       nameField.sendKeys(name);
       return this;
    }

    public ClientPage enterAddressOfClient(String address) {
        WebElement addressField = driver.findElement(By.xpath("//textarea[@name='firm_addr']"));
        addressField.clear();
        addressField.sendKeys(address);
        return this;
    }

    public ClientPage enterCity(String city) {
        WebElement cityField = driver.findElement(By.xpath("//input[@name='firm_town']"));
        cityField.clear();
        cityField.sendKeys(city);
        return this;
    }

    public ClientPage clickCreateClientButton() {
        driver.findElement(By.xpath("//input[@value='Добави клиента']")).click();
        return this;
    }

    public void createClient(String name, String address, String city) {
        clickOnAddClientButton()
                .enterNameOfClient(name)
                .enterAddressOfClient(address)
                .enterCity(city)
               .clickCreateClientButton();

    }

    public String getSuccessfullCreateClientMessage() {
        return driver.findElement(By.xpath("//div[@id='okmsg']")).getText().trim();
    }

//    public void deleteClient() {
//        driver.findElement(By.xpath("//a[@href='https://proba-ood.inv.bg/clients/manage/view:13']")).click();
//        driver.findElement(By.xpath("//a[@href='https://proba-ood.inv.bg/clients/manage/delete:13']")).click();
//
//    }

}
