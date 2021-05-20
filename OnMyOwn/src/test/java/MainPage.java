import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"credite\"]/span")
    private WebElement butonCredite;

    public void clickButonCredit() {
        this.butonCredite.click();
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
