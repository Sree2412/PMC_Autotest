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
public class ComparePage  extends testBase {


    public final static Logger log = Logger.getLogger(HomePage.class.getName());
    WebDriver driver;

    /* Create WebElements per each page here*/

    @FindBy(css = "#ui-fieldset-1-content > div > div > p-button:nth-child(2) > button > span")
    WebElement Compareformsbutton;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c86-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(2) > select")
    WebElement LeftFormdropdown;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(3) > select")
    WebElement LeftVersiondropdown;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(4) > select")
    WebElement RightFormDropdown;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(5) > select")
    WebElement RightVersionDropdown;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c86-5.ng-star-inserted > p-footer > button")
    WebElement CloseButton;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div.ui-g-12 > p-button > button > span")
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
       /* driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(2) > select")).click();
        //log.info("Click on Hcode :-" + LeftFormdropdown.toString());
        // find the listbox
        WebElement options = driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(2) > select > optgroup"));

        // find the 1st option
        WebElement option1 = options.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(2) > select > optgroup > option:nth-child(1)"));

        //click on the option1
        option1.click();
        log.info("Enter Hcode value object selected:-" + LeftFormdropdown.toString());*/
       // waitForElement(driver, 5000, LeftFormdropdown);
        Select dropdownField1 = new Select(LeftFormdropdown);
        dropdownField1.selectByValue("Relativity - U.S.");
        log.info("clicked on Leftform dropdown button is:-" + LeftFormdropdown.toString());
        waitForElement(driver, 5000, LeftVersiondropdown);
        Select dropdownField2 = new Select(LeftVersiondropdown);
        dropdownField2.selectByValue("0");
        log.info("clicked on Leftversion dropdown button is:-" + LeftVersiondropdown.toString());
        Select dropdownField3 = new Select(RightFormDropdown);
        dropdownField3.selectByVisibleText("Relativity - U.S.");
        log.info("clicked on Rightform dropdown button is:-" + RightFormDropdown.toString());
        Select dropdownField4 = new Select(RightVersionDropdown);
        dropdownField4.selectByValue("0");
        log.info("clicked on Rightversion dropdown button is:-" + RightVersionDropdown.toString());
        CompareButton.click();

    }
    public void CloseButton() {
        waitForElement(driver, 5000, Compareformsbutton);
        Compareformsbutton.click();
        log.info("clicked on Compare button is:-" + Compareformsbutton.toString());
        //waitForElement(driver, 8000, CloseButton);
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CloseButton.click();
        log.info("clicked on Close button is:-" + CloseButton.toString());

    }
    public boolean verifyCompareForms() {
        try {
            waitForElement(driver, 5000,driver.findElement(By.cssSelector(".ng-star-inserted")));
            boolean b =driver.getPageSource().contains("No Differences Found, Forms Are The Same.");

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
