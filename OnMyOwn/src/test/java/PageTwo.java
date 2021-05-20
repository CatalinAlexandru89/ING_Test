import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageTwo extends PageObject{
    private final String SUMA_CREDIT = "0";
    //private final String AVANS_CREDIT = "0";

    @FindBy(xpath = "//*[@id=\"front_valoare_proprietate\"]")
    private WebElement sumaTotalaCredit;

    public void butonSumaCredit() {
        this.sumaTotalaCredit.click();
        //this.sumaTotalaCredit.clear();
        //this.sumaTotalaCredit.sendKeys(SUMA_CREDIT);
    }
    public void butonSumaCreditt() {
        //this.sumaTotalaCredit.click();
        this.sumaTotalaCredit.clear();
        //this.sumaTotalaCredit.sendKeys(SUMA_CREDIT);
    }
    public void butonSumaCredittt() {
        //this.sumaTotalaCredit.click();
        //this.sumaTotalaCredit.clear();
        this.sumaTotalaCredit.sendKeys(SUMA_CREDIT);
    }

    @FindBy(xpath = "//*[@id=\"simulator\"]/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/div[7]/a[2]")
    private WebElement scandentar;

    public void butonScadentar() {
        this.scandentar.click();
    }


    public PageTwo(WebDriver driver) {
        super(driver);
    }

}
