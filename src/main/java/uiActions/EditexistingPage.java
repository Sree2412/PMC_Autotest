package uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.testBase;

import java.util.concurrent.TimeUnit;


/* For every new class always extend from testBase*/
public class EditexistingPage  extends testBase {


    public final static Logger log = Logger.getLogger(HomePage.class.getName());
    WebDriver driver;

    /* Create WebElements per each page here*/

    @FindBy(css = "#ui-fieldset-2-content > div > p-autocomplete > span > input")
    WebElement EnterHCode;

    @FindBy(css = "#ui-fieldset-2-content > div > div > p-button:nth-child(1) > button > span")
    WebElement Editexistingformbutton;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-titlebar.ui-widget-header.ui-helper-clearfix.ui-corner-top.ng-tns-c120-5.ng-star-inserted")
    WebElement Openexistingformdialog;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-8.ui-dialog-content.ui-widget-content > p-table > div > div > table > tbody > tr:nth-child(1) > td:nth-child(1)")
    WebElement Selectexistingformtable;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c86-5.ng-star-inserted > p-footer > button:nth-child(1)")
    WebElement Openexistingformbutton;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c86-5.ng-star-inserted > p-footer > button:nth-child(2)")
    WebElement CancelexistingformButton;

    @FindBy(css = "#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input")
    WebElement ProductionNamevalidation;



    /*Create constructor class for each new pageclass --Copy this constructor method*/
    public EditexistingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void editexistingform() {
        waitForElement(driver, 5000, EnterHCode);
        EnterHCode.click();
        log.info("clicked on EnterHcode object is:-" + EnterHCode.toString());
        EnterHCode.sendKeys("H");
        log.info("Enter Hcode value object is:-" + EnterHCode.toString());
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EnterHCode.sendKeys(Keys.DOWN);
        log.info("Enter Hcode value object click down:-" + EnterHCode.toString());
        EnterHCode.sendKeys(Keys.ENTER);
        log.info("Enter Hcode value object enter:-" + EnterHCode.toString());
        Editexistingformbutton.click();
        log.info("clicked on Edit existing form object is:-" + Editexistingformbutton.toString());
        log.info("open dialog box:-" + Openexistingformdialog.toString());
    }


    /* Create all page action  methods here*/
    public void editexistingProdspecforms()  {
        editexistingform();
        waitForElement(driver, 10000,driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div")));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        // find the dialog
            WebElement dialogwrapper = driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div"));
            WebElement dialog = dialogwrapper.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content"));
            WebElement ptable = dialog.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-table"));
            WebElement tablehoover =ptable.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-table > div"));
            WebElement tablewrapper = tablehoover.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-table > div > div"));
            WebElement tablegrid = tablewrapper.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-table > div > div > table"));
            WebElement tablebody = tablegrid.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-table > div > div > table > tbody"));
            // find the row
            WebElement tablerow = tablebody.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-table > div > div > table > tbody > tr:nth-child(1)"));
            log.info("tablerow object is:-" + driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-table > div > div > table > tbody > tr:nth-child(1)")) .toString());
            //click on the row


          tablerow.click();
        //int x= dialog.getLocation().getX();
       // int y = dialog.getLocation().getY();
          // System.out.println("x cord" +x);
          // System.out.println("x cord" +y);

            log.info("click on 1st row of the table :-" + tablerow.toString());
            Openexistingformbutton.click();
            log.info("clicked on Open form object is:-" + Openexistingformbutton.toString());

    }

    public void editexistingcancelbutton() {
        editexistingform();
        waitForElement(driver, 5000, CancelexistingformButton);
        CancelexistingformButton.click();
        log.info("clicked on Cancel object is:-" + CancelexistingformButton.toString());
    }


    public boolean verifyexistingformsopens() {
        try {
            waitForElement(driver, 5000,ProductionNamevalidation);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyeditexistingCloseButton() {
        try {
            waitForElement(driver, 5000, Editexistingformbutton);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
