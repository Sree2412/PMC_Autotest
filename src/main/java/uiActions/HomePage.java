package uiActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import testBase.testBase;


/* For every new class always extend from testBase*/
public class HomePage  extends testBase {


    public final static Logger log = Logger.getLogger(HomePage.class.getName());
    WebDriver driver;

    /* Create WebElements per each page here*/
    @FindBy(css = "#ui-fieldset-0-content > div > p-dropdown > div > div.ui-dropdown-trigger.ui-state-default.ui-corner-right.ng-tns-c64-1 > span")
    WebElement ChooseCampusDropdown;

    @FindBy(css = "#ui-fieldset-0-content > div > p-dropdown > div > div.ng-trigger.ng-trigger-overlayAnimation.ng-tns-c64-1.ui-dropdown-panel.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ng-star-inserted > div > ul > p-dropdownitem:nth-child(2) > li")
    WebElement ChooseQACampus;


    @FindBy(css = "#ui-fieldset-1-content > div > div > p-button:nth-child(1) > button > span")
    WebElement NewFormbutton;

    @FindBy(css = "#ui-fieldset-1-content > div > div > p-button:nth-child(2) > button > span")
    WebElement Compareformsbutton;

    @FindBy(css = "#ui-fieldset-2-content > div > p-autocomplete > span > input")
    WebElement EnterHCodemattername;

    @FindBy(css = "#p-highlighted-option")
    WebElement DropdownHCodemattername;

    @FindBy(css = "#ui-fieldset-2-content > div > div > p-button:nth-child(1) > button > span")
    WebElement EditExistingForm;

    @FindBy(css = "#ui-fieldset-2-content > div > div > p-button:nth-child(2) > button > span")
    WebElement CopyExistingForm;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-titlebar.ui-widget-header.ui-helper-clearfix.ui-corner-top.ng-tns-c120-6.ng-star-inserted")
    WebElement SelectFormTemplate;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div > select")
    WebElement SelectFormTemplatedropdown;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div > select")
    WebElement SelectRelativityUSForm;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c120-5.ng-star-inserted > p-footer > button:nth-child(1) > span")
    WebElement OpenFormButton;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c120-5.ng-star-inserted > p-footer > button:nth-child(2) > span")
    WebElement CancelFormButton;

    @FindBy(css = "#ui-panel-0_header")
    WebElement ProjectInformationHeader;

    @FindBy(css = "#ui-fieldset-1-content > div > div > p-button:nth-child(2) > button > span")
    WebElement CompareButton;

    @FindBy(css = "#ui-fieldset-2-content > div > div > p-button:nth-child(1) > button > span")
    WebElement EditExistingFormbutton;

    @FindBy(css = "#ui-fieldset-2-content > div > div > p-button:nth-child(2) > button > span")
    WebElement CopyExistingFormbutton;






    /*Create constructor class for each new pageclass --Copy this constructor method*/
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /* Create all page action  methods here*/
    public void NewFormcreation_relus() {
        waitForElement(driver, 5000, ChooseCampusDropdown);
        ChooseCampusDropdown.click();
        log.info("clicked on Choose Campus Dropdown object is:-" + ChooseCampusDropdown.toString());
        ChooseQACampus.click();
        log.info("clicked on Choose QA Campus object is:-" + ChooseQACampus.toString());
        NewFormbutton.click();
        log.info("click New Form button object is:-" + NewFormbutton.toString());
        //waitForElement(driver, 25000, SelectFormTemplatedropdown);
        Select selectformdropdown = new Select(SelectFormTemplatedropdown);
        log.info("click Select Form Template dropdown object is:-" + SelectFormTemplatedropdown.toString());
        selectformdropdown.selectByIndex(0);
        log.info("click Select Relativity US Form object is:-" + SelectRelativityUSForm.toString());
        OpenFormButton.click();
        log.info("Click Open Form Button is:-" + OpenFormButton.toString());

    }
    public void NewFormcreation_slus() {
        waitForElement(driver, 5000, ChooseCampusDropdown);
        ChooseCampusDropdown.click();
        log.info("clicked on Choose Campus Dropdown object is:-" + ChooseCampusDropdown.toString());
        ChooseQACampus.click();
        log.info("clicked on Choose QA Campus object is:-" + ChooseQACampus.toString());
        NewFormbutton.click();
        log.info("click New Form button object is:-" + NewFormbutton.toString());
        //waitForElement(driver, 25000, SelectFormTemplatedropdown);
        Select selectformdropdown = new Select(SelectFormTemplatedropdown);
        log.info("click Select Form Template dropdown object is:-" + SelectFormTemplatedropdown.toString());
        selectformdropdown.selectByIndex(2);
        log.info("click Select Relativity US Form object is:-" + SelectRelativityUSForm.toString());
        OpenFormButton.click();
        log.info("Click Open Form Button is:-" + OpenFormButton.toString());

    }

    public void NewFormcreation_sluk() {
        waitForElement(driver, 5000, ChooseCampusDropdown);
        ChooseCampusDropdown.click();
        log.info("clicked on Choose Campus Dropdown object is:-" + ChooseCampusDropdown.toString());
        ChooseQACampus.click();
        log.info("clicked on Choose QA Campus object is:-" + ChooseQACampus.toString());
        NewFormbutton.click();
        log.info("click New Form button object is:-" + NewFormbutton.toString());
        //waitForElement(driver, 25000, SelectFormTemplatedropdown);
        Select selectformdropdown = new Select(SelectFormTemplatedropdown);
        log.info("click Select Form Template dropdown object is:-" + SelectFormTemplatedropdown.toString());
        selectformdropdown.selectByIndex(4);
        log.info("click Select Relativity US Form object is:-" + SelectRelativityUSForm.toString());
        OpenFormButton.click();
        log.info("Click Open Form Button is:-" + OpenFormButton.toString());

    }
    public void NewFormcreation_reluk() {
        waitForElement(driver, 5000, ChooseCampusDropdown);
        ChooseCampusDropdown.click();
        log.info("clicked on Choose Campus Dropdown object is:-" + ChooseCampusDropdown.toString());
        ChooseQACampus.click();
        log.info("clicked on Choose QA Campus object is:-" + ChooseQACampus.toString());
        NewFormbutton.click();
        log.info("click New Form button object is:-" + NewFormbutton.toString());
        //waitForElement(driver, 25000, SelectFormTemplatedropdown);
        Select selectformdropdown = new Select(SelectFormTemplatedropdown);
        log.info("click Select Form Template dropdown object is:-" + SelectFormTemplatedropdown.toString());
        selectformdropdown.selectByIndex(3);
        log.info("click Select Relativity US Form object is:-" + SelectRelativityUSForm.toString());
        OpenFormButton.click();
        log.info("Click Open Form Button is:-" + OpenFormButton.toString());

    }

    public void cancelselectform() {
        waitForElement(driver, 5000, ChooseCampusDropdown);
        ChooseCampusDropdown.click();
        log.info("clicked on Choose Campus Dropdown object is:-" + ChooseCampusDropdown.toString());
        ChooseQACampus.click();
        log.info("clicked on Choose QA Campus object is:-" + ChooseQACampus.toString());
        NewFormbutton.click();
        log.info("click New Form button object is:-" + NewFormbutton.toString());
        CancelFormButton.click();
        log.info("click cancel button object is:-" + CancelFormButton.toString());

    }

    public boolean verifycancelselectform() {
        try {
            waitForElement(driver, 5000,  NewFormbutton);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean getProjectInformationheader() {
        try {
            waitForElement(driver, 5000, ProjectInformationHeader);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}






