
package uiActions;

        import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import testBase.testBase;

        import java.util.concurrent.TimeUnit;


/* For every new class always extend from testBase*/
public class CopyexistingPage  extends testBase {


    public final static Logger log = Logger.getLogger(HomePage.class.getName());
    WebDriver driver;

    /* Create WebElements per each page here*/

    @FindBy(css = "#ui-fieldset-2-content > div > filter-dropdown > div > input")
    WebElement EnterHCode;

    @FindBy(css = "#dropdown-list > li:nth-child(1) > div > input")
    WebElement HcodeSearch;

    @FindBy(css = "#ui-fieldset-2-content > div > div > p-button:nth-child(2) > button > span")
    WebElement Copyexistingformbutton;


    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c86-5.ng-star-inserted > p-footer > button:nth-child(1)")
    WebElement Copybutton;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c86-4.ng-star-inserted > p-footer > button:nth-child(2)")
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
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(EnterHCode)).click();
        log.info("clicked on EnterHcode object is:-" + EnterHCode.toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(HcodeSearch)).click();
        HcodeSearch.sendKeys("H45678");
        log.info("Enter Hcode value object is:-" + HcodeSearch.toString());
        driver.findElement(By.cssSelector("#dropdown-list > li.ng-star-inserted > cdk-virtual-scroll-viewport > div.cdk-virtual-scroll-content-wrapper > a.menu-item.ng-star-inserted.selected")).click();
        log.info("Enter Hcode value object is:-" + EnterHCode.toString());
        try {
            driver.wait(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Copyexistingformbutton)).click();
        log.info("clicked on Edit existing form object is:-" + Copyexistingformbutton.toString());
        log.info("open dialog box:-" + Copyexistingformbutton.toString());


    }

    public void copyexistingcancelbutton() {
        waitForElement(driver, 5000, EnterHCode);
        EnterHCode.click();
        log.info("clicked on EnterHcode object is:-" + EnterHCode.toString());
        EnterHCode.sendKeys("H");
        log.info("Enter Hcode value object is:-" + EnterHCode.toString());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        EnterHCode.sendKeys(Keys.DOWN);
        log.info("Enter Hcode value object click down:-" + EnterHCode.toString());
        EnterHCode.sendKeys(Keys.ENTER);
        log.info("Enter Hcode value object enter:-" + EnterHCode.toString());
        Copyexistingformbutton.click();
        log.info("clicked on Edit existing form object is:-" + Copyexistingformbutton.toString());
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
