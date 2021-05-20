import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"credite\"]/span")
    private WebElement butonCredite;
    public void clickButonCredit() {
        this.butonCredite.click();
    }

    @FindBy(xpath = "//*[@id=\"main-navbar\"]/div/ul[1]/li[3]/div/ul/li[3]/a/span")
    private WebElement butonCreditDoi;
    public void clickButonCreditDoi() {
        this.butonCreditDoi.click();
    }



    public MainPage(WebDriver driver) {
        super(driver);
    }
}
