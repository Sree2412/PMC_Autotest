package uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import testBase.testBase;

import java.util.concurrent.TimeUnit;


/* For every new class always extend from testBase*/
public class ComparePage  extends testBase {


    public final static Logger log = Logger.getLogger(HomePage.class.getName());
    WebDriver driver;

    /* Create WebElements per each page here*/

    @FindBy(css = "#ui-fieldset-1-content > div > div > p-button:nth-child(2) > button > span")
    WebElement Compareformsbutton;

    @FindBy(xpath = "/html/body/app-root/app-main/div/div/div[2]/div/app-home/div/p-dialog/div/div/div[3]/p-footer/button/span")
    WebElement CloseButton;

    @FindBy(xpath="/html/body/app-root/app-main/div/div/div[2]/div/app-home/div/p-dialog/div/div/div[3]/p-footer/p-button/button/span")
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
        WebElement leftform1 =  driver.findElement(By.xpath("/html/body/app-root/app-main/div/div/div[2]/div/app-home/div/p-dialog/div/div/div[2]/div[1]/div[1]/select"));
        Select selectboxdropdown1 = new Select(leftform1);
        log.info("click Select Form Template dropdown object is:-" + selectboxdropdown1.toString());
        selectboxdropdown1.selectByIndex(1);
        log.info("click Select Relativity US Form object is:-" + selectboxdropdown1.toString());
        WebElement leftform2 =  driver.findElement(By.xpath("/html/body/app-root/app-main/div/div/div[2]/div/app-home/div/p-dialog/div/div/div[2]/div[1]/div[2]/select"));
        Select selectboxdropdown2 = new Select(leftform2);
        log.info("click Select Form Template dropdown object is:-" + selectboxdropdown2.toString());
        selectboxdropdown2.selectByIndex(2);
        log.info("click Select Relativity US Form object is:-" + selectboxdropdown1.toString());
        WebElement rightform1 =  driver.findElement(By.xpath("/html/body/app-root/app-main/div/div/div[2]/div/app-home/div/p-dialog/div/div/div[2]/div[1]/div[3]/select"));
        Select selectboxdropdown3 = new Select(rightform1);
        log.info("click Select Form Template dropdown object is:-" + selectboxdropdown3.toString());
        selectboxdropdown3.selectByIndex(1);
        log.info("click Select Relativity US Form object is:-" + selectboxdropdown1.toString());
        WebElement rightform2 =  driver.findElement(By.xpath("/html/body/app-root/app-main/div/div/div[2]/div/app-home/div/p-dialog/div/div/div[2]/div[1]/div[4]/select"));
        Select selectboxdropdown4 = new Select(rightform2);
        log.info("click Select Form Template dropdown object is:-" + selectboxdropdown4.toString());
        selectboxdropdown4.selectByIndex(2);
        log.info("click Select Relativity US Form object is:-" + selectboxdropdown1.toString());

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
            boolean b =driver.getPageSource().contains("No Differences Found, Forms Are The Same");

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
