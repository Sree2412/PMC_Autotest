package uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import testBase.testBase;





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

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > p-table > div > div > table > tbody > tr:nth-child(1)")
    WebElement Selectexistingform;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c120-5.ng-star-inserted > p-footer > button:nth-child(1) > span")
    WebElement Openexistingformbutton;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c120-5.ng-star-inserted > p-footer > button:nth-child(2) > span")
    WebElement CancelexistingformButton;

    @FindBy(css = "#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input")
    WebElement ProductionNamevalidation;



    /*Create constructor class for each new pageclass --Copy this constructor method*/
    public EditexistingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /* Create all page action  methods here*/
    public void editexistingProdspecforms()  {
        waitForElement(driver, 5000, EnterHCode);
        EnterHCode.click();
        log.info("clicked on EnterHcode object is:-" + EnterHCode.toString());
        EnterHCode.sendKeys("H45678 - QA - H45678");
        log.info("Enter Hcode value object is:-" + EnterHCode.toString());
        //Select hcode = new Select(EnterHCode);
        //log.info("select Hcode from the dropdown object is:-" + EnterHCode.toString());
        //hcode.selectByIndex(0);
        //log.info("1st hcode selected:-" + EnterHCode.toString());

        Editexistingformbutton.click();
        log.info("clicked on Edit existing form object is:-" + Editexistingformbutton.toString());
        Selectexistingform.click();
        log.info("clicked on Edit existing form object is:-" + Editexistingformbutton.toString());
        Openexistingformbutton.click();
        log.info("clicked on Open form object is:-" + Openexistingformbutton.toString());


    }

    public void editexistingcancelbutton() {
        waitForElement(driver, 5000, EnterHCode);
        EnterHCode.click();
        log.info("clicked on EnterHcode object is:-" + EnterHCode.toString());
        EnterHCode.sendKeys("H45678 - QA - H45678");
        log.info("Enter Hcode value object is:-" + EnterHCode.toString());
        //Select hcode = new Select(EnterHCode);
        //log.info("select Hcode from the dropdown object is:-" + EnterHCode.toString());
        //hcode.selectByIndex(0);
        //log.info("1st hcode selected:-" + EnterHCode.toString());

        Editexistingformbutton.click();
        log.info("clicked on Edit existing form object is:-" + Editexistingformbutton.toString());
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
