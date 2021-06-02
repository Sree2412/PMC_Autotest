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
//import com.github.javafaker.name;





/* For every new class always extend from testBase*/
    public class ProdspecPageext  extends testBase {


        public final static Logger log = Logger.getLogger(uiActions.HomePage.class.getName());
        WebDriver driver;

        /* Create WebElements per each page here*/
        @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-buttons > div > p-button > button")
        WebElement Savedraft;


        /*Create constructor class for each new pageclass --Copy this constructor method*/
        public ProdspecPageext(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
   /* public String firstName() {
        return faker.fakeValuesService().resolve("name.first_name", this, faker);
    }*/


    public void saveform() {
            ProdspecPage hcode = new ProdspecPage(driver);
            hcode.selecthcodefromdropdown();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("Databasename");
            System.out.println("Productionname");

            waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(1) > input")));
            log.info("Enter Database Name:-" + driver.findElement(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(1) > input")).toString());
            waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input")));
            log.info("Enter Production Name:-" + driver.findElement(By.cssSelector("#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input")).toString());
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Savedraft)).click();
            log.info("Click Save Draft:-" + Savedraft.toString());



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
            EditexistingPage editexistingpage = new EditexistingPage(driver);
            editexistingpage.editexistingform();
            WebElement dialogwrapper = driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div"));
            WebElement dialog = dialogwrapper.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content"));
            WebElement ptable = dialog.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-table"));
            WebElement tablehoover =ptable.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-table > div"));
            WebElement tablewrapper = tablehoover.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-table > div > div"));
            WebElement tablegrid = tablewrapper.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-table > div > div > table"));
            WebElement tablebody = tablegrid.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-table > div > div > table > tbody"));
            // find the row
            WebElement tablerow= tablebody.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-table > div > div > table > tbody > tr:nth-child(1)"));
            log.info("tablerow object is:-" + driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-table > div > div > table > tbody > tr:nth-child(1)")) .toString());
            //click on the row



                return true;
            } catch (Exception e) {
                return false;
            }
        }



    }


