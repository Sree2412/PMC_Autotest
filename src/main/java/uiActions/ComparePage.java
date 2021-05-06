package uiActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.testBase;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


/* For every new class always extend from testBase*/
public class ComparePage  extends testBase {


    public final static Logger log = Logger.getLogger(HomePage.class.getName());
    WebDriver driver;

    /* Create WebElements per each page here*/

    @FindBy(css = "#ui-fieldset-1-content > div > div > p-button:nth-child(2) > button > span")
    WebElement Compareformsbutton;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(2) > select")
    WebElement LeftFormdropdown;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(3) > select")
    WebElement LeftVersiondropdown;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(4) > select")
    WebElement RightFormDropdown;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div:nth-child(5) > select")
    WebElement RightVersionDropdown;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c120-5.ng-star-inserted > p-footer > button > span")
    WebElement CloseButton;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div:nth-child(1) > div.ui-g-12 > p-button > button > span")
    WebElement CompareButton;



    /*Create constructor class for each new pageclass --Copy this constructor method*/
    public ComparePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /* Create all page action  methods here*/
    public void comapareProdspecforms()  {
        waitForElement(driver, 5000, Compareformsbutton);
        Compareformsbutton.click();
        waitForElement(driver, 25000, LeftFormdropdown);
        Select dropdownField1 = new Select(LeftFormdropdown);
        dropdownField1.selectByValue("Relativity - U.S.");
        waitForElement(driver, 25000, LeftVersiondropdown);
        Select dropdownField2 = new Select(LeftVersiondropdown);
        dropdownField2.selectByValue("0");
        Select dropdownField3 = new Select(RightFormDropdown);
        dropdownField3.selectByVisibleText("Relativity - U.S.");
        Select dropdownField4 = new Select(RightVersionDropdown);
        dropdownField4.selectByValue("0");
        CompareButton.click();

    }

    public void CloseButton() {
        waitForElement(driver, 5000, Compareformsbutton);
        Compareformsbutton.click();
        Compareformsbutton.click();
        waitForElement(driver, 5000, LeftFormdropdown);
        CloseButton.click();
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
            waitForElement(driver, 5000, Compareformsbutton);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
