package uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.testBase;

import java.math.BigInteger;
import java.security.SecureRandom;
//import com.github.javafaker.name;





/* For every new class always extend from testBase*/
    public class ProdspecPageext  extends testBase {


        public final static Logger log = Logger.getLogger(uiActions.HomePage.class.getName());
        WebDriver driver;

        /* Create WebElements per each page here*/
        @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-buttons > div > p-button > button")
        WebElement Savedraft;
        @FindBy(css = "#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input")
        WebElement ProductionName;


        /*Create constructor class for each new pageclass --Copy this constructor method*/
        public ProdspecPageext(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
   /* public String firstName() {
        return faker.fakeValuesService().resolve("name.first_name", this, faker);
    }*/



    public String generateRandomString() {

        return "Autotest" + new BigInteger(120, new SecureRandom()).toString(32);
    }


    public void saveform() {
            ProdspecPage hcode = new ProdspecPage(driver);
            hcode.selecthcodefromdropdown();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            waitForElement(driver, 10, ProductionName);
            ProductionName.sendKeys(generateRandomString());
            log.info("Enter Production Name:-" + ProductionName.toString());
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Savedraft)).click();
            log.info("Click Save Draft:-" + Savedraft.toString());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

        public void saveform_relus() {
            HomePage homepage = new HomePage(driver);
            homepage.NewFormcreation_relus();
            saveform();

        }

        public void saveform_reluk() {
            HomePage homepage = new HomePage(driver);
            homepage.NewFormcreation_reluk();
            saveform();

        }

        public void saveform_slus() {
            HomePage homepage = new HomePage(driver);
            homepage.NewFormcreation_slus();
            saveform();

        }

        public void saveform_sluk() {
            HomePage homepage = new HomePage(driver);
            homepage.NewFormcreation_sluk();
            saveform();

        }

        public boolean verifysavedform () {
            try {
                new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > app-root > app-main > div > div > div.layout-menu > app-menu > div > a:nth-child(1)"))).click();
                EditexistingPage editexistingpage = new EditexistingPage(driver);
            editexistingpage.editexistingform();
            editexistingpage.editexistingProdspecforms();
            String prodName = driver.findElement(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input")).getAttribute("class");
            prodName.contains("Autotest" + new BigInteger(120, new SecureRandom()).toString(32));

            return true;
            } catch (Exception e) {
                return false;
            }
        }



    }


