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


/* For every new class always extend from testBase*/
public class EditexistingPage  extends testBase {


    public final static Logger log = Logger.getLogger(HomePage.class.getName());
    WebDriver driver;

    /* Create WebElements per each page here*/

    @FindBy(css = "#ui-fieldset-2-content > div > filter-dropdown > div > input")
    WebElement EnterHCode;

    @FindBy(css = "#ui-fieldset-2-content > div > div > p-button:nth-child(1) > button > span")
    WebElement Editexistingformbutton;

    @FindBy(css = "#dropdown-list > li:nth-child(1) > div > input")
    WebElement HcodeSearch;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-titlebar.ui-widget-header.ui-helper-clearfix.ui-corner-top.ng-tns-c120-5.ng-star-inserted")
    WebElement Openexistingformdialog;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-8.ui-dialog-content.ui-widget-content > p-table > div > div > table > tbody > tr:nth-child(1) > td:nth-child(1)")
    WebElement Selectexistingformtable;

    @FindBy(xpath = "/html/body/app-root/app-main/div/div/div[2]/div/app-home/div/p-dialog/div/div/div[3]/p-footer/button[1]/span")
    WebElement Openexistingformbutton;

    @FindBy(xpath = "/html/body/app-root/app-main/div/div/div[2]/div/app-home/div/p-dialog/div/div/div[3]/p-footer/button[2]/span")
    WebElement CancelexistingformButton;

    @FindBy(css = "#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input")
    WebElement ProductionNamevalidation;



    /*Create constructor class for each new pageclass --Copy this constructor method*/
    public EditexistingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void editexistingform() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(EnterHCode)).click();
        log.info("clicked on EnterHcode object is:-" + EnterHCode.toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(HcodeSearch)).click();
        HcodeSearch.sendKeys("H45678 - QA - H45678");
        log.info("Enter Hcode value object is:-" + HcodeSearch.toString());
        driver.findElement(By.cssSelector("#dropdown-list > li.ng-star-inserted > cdk-virtual-scroll-viewport > div.cdk-virtual-scroll-content-wrapper > a:nth-child(1)")).click();
        log.info("Enter Hcode value object is:-" + EnterHCode.toString());

    }


    /* Create all page action  methods here*/
    public void editexistingProdspecforms()  {
        editexistingform();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Editexistingformbutton)).click();
        log.info("clicked on Edit existing form object is:-" + Editexistingformbutton.toString());
        log.info("open dialog box:-" + Openexistingformdialog.toString());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            WebElement tablerow = driver.findElement(By.xpath("/html/body/app-root/app-main/div/div/div[2]/div/app-home/div/p-dialog/div/div/div[2]/p-table/div/div/table/tbody/tr[1]"));
            log.info("tablerow object is:-" + driver.findElement(By.xpath("/html/body/app-root/app-main/div/div/div[2]/div/app-home/div/p-dialog/div/div/div[2]/p-table/div/div/table/tbody/tr[1]")) .toString());
            //click on the row
            tablerow.click();
            Openexistingformbutton.click();
            log.info("clicked on Open form object is:-" + Openexistingformbutton.toString());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void editexistingcancelbutton() {
        editexistingform();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Editexistingformbutton)).click();
        log.info("clicked on Edit existing form object is:-" + Editexistingformbutton.toString());
        log.info("open dialog box:-" + Openexistingformdialog.toString());
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
