
package uiActions;
        import org.apache.log4j.Logger;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.Select;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import testBase.testBase;


/* For every new class always extend from testBase*/
public class ProdspecPage  extends testBase {


    public final static Logger log = Logger.getLogger(HomePage.class.getName());
    WebDriver driver;

    /* Create WebElements per each page here*/
    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-matter > div > p-dropdown")
    WebElement HCodedropdown;


    @FindBy(css = "#ui-fieldset-1-content > div > div > p-button:nth-child(1) > button > span")
    WebElement NewFormbutton;

    @FindBy(css = "#ui-fieldset-0-content > div > p-dropdown > div > div.ui-dropdown-trigger.ui-state-default.ui-corner-right.ng-tns-c64-1 > span")
    WebElement ChooseCampusDropdown;

    @FindBy(css = "#ui-fieldset-0-content > div > p-dropdown > div > div.ng-trigger.ng-trigger-overlayAnimation.ng-tns-c64-1.ui-dropdown-panel.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ng-star-inserted > div > ul > p-dropdownitem:nth-child(2) > li")
    WebElement ChooseQACampus;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div > select")
    WebElement SelectFormTemplatedropdown;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c120-5.ng-star-inserted > p-footer > button:nth-child(1) > span")
    WebElement OpenFormButton;

    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-home > div > p-dialog > div > div > div.ng-tns-c120-5.ui-dialog-content.ui-widget-content > div > select")
    WebElement SelectRelativityUSForm;


    /*Create constructor class for each new pageclass --Copy this constructor method*/
    public ProdspecPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /* Create all page action  methods here*/
    public void selecthcodefromdropdown() {
        waitForElement(driver, 5000, ChooseCampusDropdown);
        ChooseCampusDropdown.click();
        log.info("clicked on Choose Campus Dropdown object is:-" + ChooseCampusDropdown.toString());
        ChooseQACampus.click();
        log.info("clicked on Choose QA Campus object is:-" + ChooseQACampus.toString());
        NewFormbutton.click();
        log.info("click New Form button object is:-" + NewFormbutton.toString());
        Select selectformdropdown = new Select(SelectFormTemplatedropdown);
        log.info("click Select Form Template dropdown object is:-" + SelectFormTemplatedropdown.toString());
        selectformdropdown.selectByIndex(0);
        log.info("click Select Relativity US Form object is:-" + SelectRelativityUSForm.toString());
        OpenFormButton.click();
        log.info("Click Open Form Button is:-" + OpenFormButton.toString());
        waitForElement(driver, 5000, HCodedropdown);
        log.info("Hcode value object found:-" + HCodedropdown.toString());
        HCodedropdown.click();
        log.info("Click on Hcode :-" + HCodedropdown.toString());
        // find the listbox
        WebElement listbox = driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-matter > div > p-dropdown > div > div.ng-trigger.ng-trigger-overlayAnimation.ng-tns-c64-8.ui-dropdown-panel.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ng-star-inserted > div > ul"));

        // find the 1st option
        WebElement option1 = listbox.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-matter > div > p-dropdown > div > div.ng-trigger.ng-trigger-overlayAnimation.ng-tns-c64-8.ui-dropdown-panel.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ng-star-inserted > div > ul > p-dropdownitem:nth-child(1) > li"));

        //click on the option1
        option1.click();
        log.info("Enter Hcode value object selected:-" + HCodedropdown.toString());

    }

    public void expandcollapsesections() {
        selecthcodefromdropdown();
       // waitForElement(driver, 10000, driver.findElement(By.cssSelector("#ui-panel-0-label")));
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-0-label"))).click();
       // driver.findElement(By.cssSelector("#ui-panel-0-label")).click();
        log.info("clicked on minus button of project info section:-" + driver.findElement(By.cssSelector("#ui-panel-0-label")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-label"))).click();
        // waitForElement(driver, 10000, driver.findElement(By.cssSelector("#ui-panel-1-label")));
        driver.findElement(By.cssSelector("#ui-panel-1-label")).click();
        log.info("clicked on minus button of production info is:-" + driver.findElement(By.cssSelector("#ui-panel-1-label")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-2-label"))).click();
        //waitForElement(driver, 10000, driver.findElement(By.cssSelector("#ui-panel-2-label")));
        //driver.findElement(By.cssSelector("#ui-panel-2-label")).click();
        log.info("clicked on minus button of Native imaging option is:-" + driver.findElement(By.cssSelector("#ui-panel-2-label")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-label"))).click();
        //waitForElement(driver, 10000, driver.findElement(By.cssSelector("#ui-panel-3-label")));
        //driver.findElement(By.cssSelector("#ui-panel-3-label")).click();
        log.info("clicked on minus button of Branding info is:-" + driver.findElement(By.cssSelector("#ui-panel-3-label")).toString());
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-label"))).click();
       // waitForElement(driver, 10000, driver.findElement(By.cssSelector("#ui-panel-4-label")));
        //driver.findElement(By.cssSelector("#ui-panel-4-label")).click();
        log.info("clicked on minus button of production file spec is:-" + driver.findElement(By.cssSelector("#ui-panel-4-label")).toString());
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-label"))).click();
       // waitForElement(driver, 15000, driver.findElement(By.cssSelector("#ui-panel-5-label")));
        // driver.findElement(By.cssSelector("#ui-panel-5-label")).click();
        log.info("clicked on minus button of production location foldering is:-" + driver.findElement(By.cssSelector("#ui-panel-5-label")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-label"))).click();
        //waitForElement(driver, 15000, driver.findElement(By.cssSelector("#ui-panel-6-label")));
        //driver.findElement(By.cssSelector("#ui-panel-6-label")).click();
        log.info("clicked on minus button of Special instruction is:-" + driver.findElement(By.cssSelector("#ui-panel-6-label")).toString());
    }


    public boolean verifyhcodedropdown() {
        try {
            waitForElement(driver, 5000, driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-matter > div > p-dropdown > div > div.ui-dropdown-label-container.ng-tns-c64-8 > span")));
            boolean b = driver.getPageSource().contains("H45678 - QA - H45678");

            return b;
        } catch (Exception e) {
            return false;
        }
    }



    public boolean verifyexpandcollapsebuttons() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-0-label")).getAttribute("class");
            className0.contains("ng-tns-c51-9 pi pi-plus");
            String className1 = driver.findElement(By.cssSelector("#ui-panel-1-label")).getAttribute("class");
            className1.contains("ng-tns-c51-9 pi pi-plus");
            String className2 = driver.findElement(By.cssSelector("#ui-panel-2-label")).getAttribute("class");
            className2.contains("ng-tns-c51-9 pi pi-plus");
            String className3 = driver.findElement(By.cssSelector("#ui-panel-3-label")).getAttribute("class");
            className3.contains("ng-tns-c51-9 pi pi-plus");
            String className4 = driver.findElement(By.cssSelector("#ui-panel-4-label")).getAttribute("class");
            className4.contains("ng-tns-c51-9 pi pi-plus");
            String className5 = driver.findElement(By.cssSelector("#ui-panel-5-label")).getAttribute("class");
            className5.contains("ng-tns-c51-9 pi pi-plus");
            String className6 = driver.findElement(By.cssSelector("#ui-panel-6-label")).getAttribute("class");
            className6.contains("ng-tns-c51-9 pi pi-plus");
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}






