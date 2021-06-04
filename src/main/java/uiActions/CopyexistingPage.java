
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


    @FindBy(xpath = "/html/body/app-root/app-main/div/div/div[2]/div/app-home/div/p-dialog/div/div/div[3]/p-footer/button[1]/span")
    WebElement Copybutton;

    @FindBy(xpath = "/html/body/app-root/app-main/div/div/div[2]/div/app-home/div/p-dialog/div/div/div[3]/p-footer/button[2]/span")
    WebElement CancelButton;

    @FindBy(css = "#ui-panel-0-content > div > div > div.ui-g-9 > span:nth-child(2) > input")
    WebElement ProductionNamevalidation;



    /*Create constructor class for each new pageclass --Copy this constructor method*/
    public CopyexistingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /* Create all page action  methods here*/
    public void copyexistingforms()  {
        EditexistingPage hcodeselect = new EditexistingPage(driver);
        hcodeselect.editexistingform();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Copyexistingformbutton)).click();
        log.info("clicked on Edit existing form object is:-" + Copyexistingformbutton.toString());
        log.info("open dialog box:-" + Copyexistingformbutton.toString());


    }
    public void copyexistingProdspecforms()  {
        copyexistingforms();
               try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement tablerow = driver.findElement(By.xpath("/html/body/app-root/app-main/div/div/div[2]/div/app-home/div/p-dialog/div/div/div[2]/p-treetable/div/div/table/tbody/tr[1]"));
        log.info("tablerow object is:-" + driver.findElement(By.xpath("/html/body/app-root/app-main/div/div/div[2]/div/app-home/div/p-dialog/div/div/div[2]/p-treetable/div/div/table/tbody/tr[1]")) .toString());
        //click on the row
        tablerow.click();
        Copybutton.click();
        log.info("clicked on Open form object is:-" + Copybutton.toString());

    }

    public void copyexistingcancelbutton() {
        copyexistingforms();
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
