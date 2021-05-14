
package uiActions;

        import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.testBase;


/* For every new class always extend from testBase*/
public class CopyexistingPage  extends testBase {


    public final static Logger log = Logger.getLogger(HomePage.class.getName());
    WebDriver driver;

    /* Create WebElements per each page here*/

    @FindBy(css = "#ui-fieldset-2-content > div > p-autocomplete > span > input")
    WebElement EnterHCode;

    @FindBy(css = "#ui-fieldset-2-content > div > div > p-button:nth-child(2) > button > span")
    WebElement Copyexistingformbutton;


    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c86-5.ng-star-inserted > p-footer > button:nth-child(1)")
    WebElement Copybutton;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c86-5.ng-star-inserted > p-footer > button:nth-child(2)")
    WebElement CancelButton;

    @FindBy(css = "#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input")
    WebElement ProductionNamevalidation;



    /*Create constructor class for each new pageclass --Copy this constructor method*/
    public CopyexistingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /* Create all page action  methods here*/
    public void copyexistingProdspecforms()  {
        waitForElement(driver, 5000, EnterHCode);
        EnterHCode.click();
        log.info("clicked on EnterHcode object is:-" + EnterHCode.toString());
        EnterHCode.sendKeys("H");
        log.info("Enter Hcode value object is:-" + EnterHCode.toString());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EnterHCode.sendKeys(Keys.DOWN);
        log.info("Enter Hcode value object click down:-" + EnterHCode.toString());
        EnterHCode.sendKeys(Keys.ENTER);
        log.info("Enter Hcode value object enter:-" + EnterHCode.toString());
        Copyexistingformbutton.click();
        log.info("clicked on Copy existing form object is:-" + Copyexistingformbutton.toString());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement dialog = driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div"));
        WebElement table = dialog.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content"));
        WebElement ptreetable =table.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-treetable"));
        WebElement tablehoover = ptreetable.findElement((By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-treetable > div")));
        WebElement tablewrapper = tablehoover.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-treetable > div > div"));
        WebElement tableclass =tablewrapper.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-treetable > div > div > table"));
        WebElement tbody =tableclass.findElement((By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-treetable > div > div > table > tbody")));

        // find the row
        WebElement tablerow = tbody.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > p-treetable > div > div > table > tbody > tr:nth-child(1)"));

        //click on the row
        tablerow.click();
        //log.info("click on 1st row of the table :-" + tablerow.toString());
        Copybutton.click();
        log.info("clicked on copy form is:-" + Copybutton.toString());


    }

    public void copyexistingcancelbutton() {
        waitForElement(driver, 5000, EnterHCode);
        EnterHCode.click();
        log.info("clicked on EnterHcode object is:-" + EnterHCode.toString());
        EnterHCode.sendKeys("H");
        log.info("Enter Hcode value object is:-" + EnterHCode.toString());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EnterHCode.sendKeys(Keys.DOWN);
        log.info("Enter Hcode value object click down:-" + EnterHCode.toString());
        EnterHCode.sendKeys(Keys.ENTER);
        log.info("Enter Hcode value object enter:-" + EnterHCode.toString());
        Copyexistingformbutton.click();
        log.info("clicked on Edit existing form object is:-" + Copyexistingformbutton.toString());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElement(driver, 5000, CancelButton);
        CancelButton.click();
        log.info("clicked on Cancel object is:-" + CancelButton.toString());
    }


    public boolean verifycopyexistingformsopens() {
        try {
            waitForElement(driver, 5000,ProductionNamevalidation);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifycopyexistingCloseButton() {
        try {
            waitForElement(driver, 5000, Copyexistingformbutton);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
