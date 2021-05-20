import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);

    }


    @Test(testName = "Click buton credit unu")
    public static void creditClick() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);

        webForm.clickButonCredit();
        webForm.clickButonCreditDoi();
    }

    @Test(testName = "Click buton suma credit")
    public static void butonSumaCredit() {
        driver.get(Utils.SECOND_URL);
        PageTwo webForm = new PageTwo(driver);

        webForm.butonSumaCredit();
        webForm.butonSumaCreditt();
        webForm.butonSumaCredittt();
        webForm.butonScadentar();
    }



    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }


}
