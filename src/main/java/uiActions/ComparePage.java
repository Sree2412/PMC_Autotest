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
public class ComparePage  extends testBase {


    public final static Logger log = Logger.getLogger(HomePage.class.getName());
    WebDriver driver;

    /* Create WebElements per each page here*/

    @FindBy(css = "#ui-fieldset-1-content > div > div > p-button:nth-child(2) > button > span")
    WebElement Compareformsbutton;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c86-5.ng-star-inserted > p-footer > button")
    WebElement CloseButton;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div.ui-g-12 > p-button > button")
    WebElement CompareButton;



    /*Create constructor class for each new pageclass --Copy this constructor method*/
    public ComparePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /* Create all page action  methods here*/
    public void compareProdspecforms()  {
        waitForElement(driver, 5000, Compareformsbutton);
        Compareformsbutton.click();
        log.info("clicked on Compare button is:-" + Compareformsbutton.toString());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       // waitForElement(driver, 8000, driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div")));
        WebElement dialog = driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div"));
        WebElement subdialog = dialog.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content"));
        WebElement table = subdialog.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > div:nth-child(1)"));
        WebElement leftform1 =  table.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(2)"));
        WebElement selectclass1 = leftform1.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(2) > select"));
        WebElement leftform2 =  table.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(3)"));
        WebElement selectclass2 = leftform2.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(3) > select"));
        WebElement rightform1 = table.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(4)"));
        WebElement selectclass3 = rightform1.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(4) > select"));
        WebElement rightform2 = table.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(5)"));
        WebElement selectclass4 =rightform2.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(5) > select"));

        selectclass1.click();
        selectclass1.sendKeys(Keys.DOWN);
        log.info("select option:-" +  selectclass1.toString());
        selectclass1.sendKeys(Keys.DOWN);
        log.info("select option:-" +  selectclass1.toString());
        selectclass1.sendKeys(Keys.DOWN);
        log.info("select option:-" +  selectclass1.toString());
        selectclass1.sendKeys(Keys.ENTER);
        log.info("Enter option:-" +  selectclass1.toString());

        selectclass2.click();
        selectclass2.sendKeys(Keys.DOWN);
        log.info("select version:-" +  selectclass2.toString());
        selectclass2.sendKeys(Keys.ENTER);
        log.info("Enter version:-" +  selectclass2.toString());

        selectclass3.click();
        selectclass3.sendKeys(Keys.DOWN);
        log.info("Enter option:-" +  selectclass3.toString());
        selectclass3.sendKeys(Keys.ENTER);
        log.info("select option:-" +  selectclass3.toString());

        selectclass4.click();
        selectclass4.sendKeys(Keys.DOWN);
        log.info("select version:-" +  selectclass4.toString());
        selectclass4.sendKeys(Keys.ENTER);
        log.info("Enter version:-" +  selectclass4.toString());
        waitForElement(driver, 8000, CompareButton);
        CompareButton.click();

    }
    public void CloseButton() {
        waitForElement(driver, 5000, Compareformsbutton);
        Compareformsbutton.click();
        log.info("clicked on Compare button is:-" + Compareformsbutton.toString());
        //waitForElement(driver, 8000, CloseButton);
        waitForElement(driver, 5000, CloseButton);
        CloseButton.click();
        log.info("clicked on Close button is:-" + CloseButton.toString());

    }
    public boolean verifyCompareForms() {
        try {
            waitForElement(driver, 8000,driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > div:nth-child(2) > p-table > div > div > table > thead > tr > th:nth-child(1)")));
            boolean b =driver.getPageSource().contains("Question Name");

            return b;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyCloseButton() {
        try {
            waitForElement(driver, 8000, Compareformsbutton);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
