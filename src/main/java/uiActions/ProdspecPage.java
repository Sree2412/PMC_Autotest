
package uiActions;
import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.testBase;
import java.util.concurrent.TimeUnit;


/* For every new class always extend from testBase*/
public class ProdspecPage  extends testBase {
    uiActions.HomePage Homepage;


    public final static Logger log = Logger.getLogger(HomePage.class.getName());
    WebDriver driver;

    /* Create WebElements per each page here*/
    @FindBy(css = "body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-matter > div > filter-dropdown > div > input")
    WebElement HCodedropdown;
    @FindBy(css = "#dropdown-list > li:nth-child(1) > div > input")
    WebElement HCodeSearch;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i")
    WebElement Markupsetconfcheck;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i")
    WebElement Textconfcheck;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[3]/div/user-confirmation-checkbox/i")
    WebElement Imageredactionconfcheck;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[4]/div/user-confirmation-checkbox/i")
    WebElement BlackoutorAudioconfcheck;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[5]/div/user-confirmation-checkbox/i")
    WebElement Redactedwithfamilyconfcheck;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i")
    WebElement Unreadableplaceholderconfcheck;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i")
    WebElement Handlingunreadableconfcheck;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i")
    WebElement Privielegeplaceholderconfcheck;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i")
    WebElement Privielegewithfamilyconfcheck;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-7-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i")
    WebElement emptyfileidentifierconfcheck;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-7-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i")
    WebElement emptyfilesconfcheck;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-8-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i")
    WebElement NativeFilesconfcheck;
    @FindBy(xpath = "//*[@id=\"ui-fieldset-8-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i")
    WebElement Tifffailureconfcheck;



    /*Create constructor class for each new pageclass --Copy this constructor method*/
    public ProdspecPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /* Create all page action  methods here*/

    public void selecthcodefromdropdown() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(HCodedropdown)).click();
        log.info("clicked on EnterHcode object is:-" + HCodedropdown.toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(HCodeSearch)).click();
        HCodeSearch.sendKeys("H45678 - QA - H45678");
        log.info("Enter Hcode value object is:-" + HCodeSearch.toString());
        driver.findElement(By.cssSelector("#dropdown-list > li.ng-star-inserted > cdk-virtual-scroll-viewport > div.cdk-virtual-scroll-content-wrapper > a:nth-child(1)")).click();
        log.info("Enter Hcode value object selected:-" + HCodedropdown.toString());

    }

    public void selecthcodefromdropdown_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        selecthcodefromdropdown();

    }

    public void selecthcodefromdropdown_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        selecthcodefromdropdown();

    }

    public void selecthcodefromdropdown_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        selecthcodefromdropdown();

    }

    public void selecthcodefromdropdown_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        selecthcodefromdropdown();

    }


    public void expandcollapsesections() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-0-label")));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-0-label"))).click();
        log.info("clicked on minus button of production set details section:-" + driver.findElement(By.cssSelector("#ui-panel-0-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-1-label")));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-label"))).click();
        log.info("clicked on minus button of general prod req info is:-" + driver.findElement(By.cssSelector("#ui-panel-1-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-2-label")));

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-2-label"))).click();
        log.info("clicked on minus button of Redaction and placeholder req is:-" + driver.findElement(By.cssSelector("#ui-panel-2-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-3-label")));

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-label"))).click();
        log.info("clicked on minus button of Native imaging option info is:-" + driver.findElement(By.cssSelector("#ui-panel-3-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-4-label")));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-label"))).click();
        log.info("clicked on minus button of Branding info is:-" + driver.findElement(By.cssSelector("#ui-panel-4-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-5-label")));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-label"))).click();
        log.info("clicked on minus button of Prod file spec is:-" + driver.findElement(By.cssSelector("#ui-panel-5-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-6-label")));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-label"))).click();
        log.info("clicked on minus button of Prod location and foldering is:-" + driver.findElement(By.cssSelector("#ui-panel-6-label")).toString());
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-7-label")));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-7-label"))).click();
        log.info("clicked on minus button of Special instruction is:-" + driver.findElement(By.cssSelector("#ui-panel-7-label")).toString());
    }

    public void expandcollapsesections_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        expandcollapsesections();

    }

    public void expandcollapsesections_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        expandcollapsesections();

    }

    public void expandcollapsesections_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        expandcollapsesections();

    }

    public void expandcollapsesections_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        expandcollapsesections();

    }

    public boolean verifyhcodedropdown() {
        try {
            waitForElement(driver, 20, driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-matter > div > filter-dropdown > div > input")));
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

    public void Generalprodreqcheckboxchecked() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElement(driver, 10, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")));
        log.info("opened prodspec page:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 2nd checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 3rd checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 4th checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 5th checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 6th checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 7th checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > div > user-confirmation-checkbox > i")).toString());
    }

    public void Generalprodreqcheckboxchecked_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        Generalprodreqcheckboxchecked();
    }

    public void Generalprodreqcheckboxchecked_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        Generalprodreqcheckboxchecked();

    }

    public void Generalprodreqcheckboxchecked_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        Generalprodreqcheckboxchecked();

    }

    public void Generalprodreqcheckboxchecked_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        Generalprodreqcheckboxchecked();

    }

    public boolean verifygeneralprodreqcheckboxchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-1-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle default-option-check");

            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public void generalprodreqcheckboxunchecked() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("opened prodspec page:-" + driver.findElement(By.cssSelector("#ui-panel-0-label")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 2nd checkbox prod info section:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

    }

    public void generalprodreqcheckboxunchecked_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        generalprodreqcheckboxunchecked();

    }

    public void generalprodreqcheckboxunchecked_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        generalprodreqcheckboxunchecked();


    }

    public void generalprodreqcheckboxunchecked_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        generalprodreqcheckboxunchecked();

    }

    public void generalprodreqcheckboxunchecked_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        generalprodreqcheckboxunchecked();

    }


    public boolean verifygeneralprodreqcheckboxunchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-1-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void redactionandplaceholderreqcheckboxchecked() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("opened prodspec page:-" + driver.findElement(By.cssSelector("#ui-panel-0-label")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on 1st  redaction info checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on  checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[3]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on previously produced docs handling checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[3]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[4]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on family association checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[4]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[5]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[5]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-7-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-7-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-7-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-7-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-8-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-8-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-8-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-8-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i")).toString());

    }

    public void redactionandplaceholderreqcheckboxchecked_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        redactionandplaceholderreqcheckboxchecked();

    }

    public void redactionandplaceholderreqcheckboxchecked_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        redactionandplaceholderreqcheckboxchecked();
    }

    public void redactionandplaceholderreqcheckboxchecked_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        redactionandplaceholderreqcheckboxchecked();

    }

    public void redactionandplaceholderreqcheckboxchecked_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        redactionandplaceholderreqcheckboxchecked();

    }

    public boolean verifyredactionplaceholderreqcheckboxchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-2-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle default-option-check");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void redactionplaceholderreqcheckboxunchecked() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("opened prodspec page:-" + driver.findElement(By.cssSelector("#ui-panel-0-label")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on 1st  redaction info checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on  checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[3]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on previously produced docs handling checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[3]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[4]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on family association checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[4]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[5]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[5]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[2]/div/user-confirmation-checkbox/i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i"))).click();
        log.info("clicked on markupset checkbox  info section:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[1]/div/user-confirmation-checkbox/i")).toString());

    }

    public void redactionplaceholderreqcheckboxunchecked_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        redactionplaceholderreqcheckboxunchecked();
    }

    public void redactionplaceholderreqcheckboxunchecked_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        redactionplaceholderreqcheckboxunchecked();

    }

    public void redactionplaceholderreqcheckboxunchecked_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        redactionplaceholderreqcheckboxunchecked();

    }

    public void redactionplaceholderreqcheckboxunchecked_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        redactionplaceholderreqcheckboxunchecked();

    }

    public boolean verifyredactionplaceholderreqcheckboxunchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-2-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void nativeimagingoptionscheckboxchecked() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 2nd checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 3rd checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

    }

    public void nativeimagingoptionscheckboxchecked_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        nativeimagingoptionscheckboxchecked();


    }

    public void nativeimagingoptionscheckboxchecked_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        nativeimagingoptionscheckboxchecked();


    }

    public void nativeimagingoptionscheckboxchecked_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        nativeimagingoptionscheckboxchecked();


    }

    public void nativeimagingoptionscheckboxchecked_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        nativeimagingoptionscheckboxchecked();

    }

    public boolean verifynativeimagingoptionscheckboxchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-3-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle default-option-check");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void nativeimagingoptionscheckboxunchecked() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 2nd checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

    }

    public void nativeimagingoptionscheckboxunchecked_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        nativeimagingoptionscheckboxunchecked();

    }

    public void nativeimagingoptionscheckboxunchecked_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        nativeimagingoptionscheckboxunchecked();

    }

    public void nativeimagingoptionscheckboxunchecked_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        nativeimagingoptionscheckboxunchecked();

    }

    public void nativeimagingoptionscheckboxunchecked_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        nativeimagingoptionscheckboxunchecked();

    }

    public boolean verifynativeimagingoptionscheckboxunchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-3-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void brandinginfocheckboxchecked() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on branding info section:-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 2nd checkbox on branding info section:-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(11) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 3rd checkbox on branding info section:-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(11) > div > user-confirmation-checkbox > i")).toString());


    }

    public void brandinginfocheckboxchecked_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        brandinginfocheckboxchecked();

    }

    public void brandinginfocheckboxchecked_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        brandinginfocheckboxchecked();

    }

    public void brandinginfocheckboxchecked_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        brandinginfocheckboxchecked();

    }

    public void brandinginfocheckboxchecked_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        brandinginfocheckboxchecked();

    }

    public boolean verifybrandinginfocheckboxchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-4-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle default-option-check");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void brandinginfocheckboxunchecked() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 2nd checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > div > user-confirmation-checkbox > i")).toString());

    }

    public void brandinginfocheckboxunchecked_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        brandinginfocheckboxunchecked();

    }

    public void brandinginfocheckboxunchecked_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        brandinginfocheckboxunchecked();
    }

    public void brandinginfocheckboxunchecked_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        brandinginfocheckboxunchecked();
    }

    public void brandinginfocheckboxunchecked_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        brandinginfocheckboxunchecked();
    }

    public boolean verifybrandinginfocheckboxunchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-4-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void prodfilespeccheckboxchecked() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).toString());

    }

    public void prodfilespeccheckboxchecked_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        prodfilespeccheckboxchecked();

    }

    public void prodfilespeccheckboxchecked_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        prodfilespeccheckboxchecked();

    }

    public void prodfilespeccheckboxchecked_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        prodfilespeccheckboxchecked();

    }

    public void prodfilespeccheckboxchecked_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        prodfilespeccheckboxchecked();

    }

    public boolean verifyprodfilespeccheckboxchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-5-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle default-option-check");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void prodfilespeccheckboxunchecked() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).toString());
    }

    public void prodfilespeccheckboxunchecked_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        prodfilespeccheckboxunchecked();

    }

    public void prodfilespeccheckboxunchecked_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        prodfilespeccheckboxunchecked();

    }

    public void prodfilespeccheckboxunchecked_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        prodfilespeccheckboxunchecked();

    }

    public void prodfilespeccheckboxunchecked_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        prodfilespeccheckboxunchecked();

    }

    public boolean verifyprodfilespeccheckboxunchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-5-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void prodlocationcheckboxchecked() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(6) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(6) > div > user-confirmation-checkbox > i")).toString());
    }

    public void prodlocationcheckboxchecked_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        prodlocationcheckboxchecked();

    }

    public void prodlocationcheckboxchecked_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        prodlocationcheckboxchecked();

    }

    public void prodlocationcheckboxchecked_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        prodlocationcheckboxchecked();

    }

    public void prodlocationcheckboxchecked_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        prodlocationcheckboxchecked();

    }

    public boolean verifyprodlocationcheckboxchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-6-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle default-option-check");

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void prodlocationcheckboxunchecked() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).toString());

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i"))).click();
        log.info("clicked on 1st checkbox on native info section:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).toString());

    }

    public void prodlocationcheckboxunchecked_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        prodlocationcheckboxunchecked();

    }

    public void prodlocationcheckboxunchecked_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        prodlocationcheckboxunchecked();

    }

    public void prodlocationcheckboxunchecked_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        prodlocationcheckboxunchecked();

    }

    public void prodlocationcheckboxunchecked_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        prodlocationcheckboxunchecked();

    }

    public boolean verifyprodlocationcheckboxunchecked() {
        try {
            String className0 = driver.findElement(By.cssSelector("#ui-panel-6-titlebar > p-header > div:nth-child(1) > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle");

            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public void nondefaultconfirmationcheck() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Select ProductionDAT = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        ProductionDAT.selectByVisibleText("Eastern Time (UTC -5:00)");
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Select ProductionDate = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        ProductionDate.selectByVisibleText("CUSTOM: [insert custom instructions]");
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Select ProductionTime = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        ProductionTime.selectByVisibleText("CUSTOM: [insert custom instructions]");
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > select")));
        Select ProductionType = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > select")));
        ProductionType.selectByVisibleText("CUSTOM: [insert custom instructions]");
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > select")));
        Select Sortorder = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > select")));
        Sortorder.selectByVisibleText("CUSTOM: [insert custom instructions]");
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > span > editable-dropdown > div > select")));
        Select PreviouslyproducedDocs = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > span > editable-dropdown > div > select")));
        PreviouslyproducedDocs.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > span > editable-dropdown > div > select")));
        Select FamilyAssociation = new Select(driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > span > editable-dropdown > div > select")));
        FamilyAssociation.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/select")));
        Select MarkupsetorRedactionlayer = new Select(driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/select")));
        MarkupsetorRedactionlayer.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/select")));
        Select Text = new Select(driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/select")));
        Text.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[3]/span/editable-dropdown/div/select")));
        Select Imageredactionlabel = new Select(driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[3]/span/editable-dropdown/div/select")));
        Imageredactionlabel.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[4]/span/editable-dropdown/div/select")));
        Select BlackoutredactionorAudio = new Select(driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[4]/span/editable-dropdown/div/select")));
        BlackoutredactionorAudio.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[5]/span/editable-dropdown/div/select")));
        Select RedactedwithFamily = new Select(driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[5]/span/editable-dropdown/div/select")));
        RedactedwithFamily.selectByIndex(3);
        waitForElement(driver, 10000, driver.findElement(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/select")));
        Select Unreadableplaceholder = new Select(driver.findElement(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/select")));
        Unreadableplaceholder.selectByIndex(2);
        waitForElement(driver, 10000, driver.findElement(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/select")));
        Select Unreadablewithfamily = new Select(driver.findElement(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/select")));
        Unreadablewithfamily.selectByIndex(3);
        waitForElement(driver, 10000, driver.findElement(By.xpath("//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/select")));
        Select Privilegeplaceholder = new Select(driver.findElement(By.xpath("//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/select")));
        Privilegeplaceholder.selectByIndex(2);
        waitForElement(driver, 10000, driver.findElement(By.xpath("//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/select")));
        Select Privilegewithfamily = new Select(driver.findElement(By.xpath("//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/select")));
        Privilegewithfamily.selectByIndex(3);
        waitForElement(driver, 10000, driver.findElement(By.xpath("//*[@id=\"ui-fieldset-7-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/select")));
        Select Emptyfileidentifier = new Select(driver.findElement(By.xpath("//*[@id=\"ui-fieldset-7-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/select")));
        Emptyfileidentifier.selectByIndex(2);
        waitForElement(driver, 10000, driver.findElement(By.xpath("//*[@id=\"ui-fieldset-7-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/select")));
        Select Emptyfiles = new Select(driver.findElement(By.xpath("//*[@id=\"ui-fieldset-7-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/select")));
        Emptyfiles.selectByIndex(2);
        waitForElement(driver, 10000, driver.findElement(By.xpath("//*[@id=\"ui-fieldset-8-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/select")));
        Select Nativefiles = new Select(driver.findElement(By.xpath("//*[@id=\"ui-fieldset-8-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/select")));
        Nativefiles.selectByIndex(3);
        waitForElement(driver, 5000, driver.findElement(By.xpath("//*[@id=\"ui-fieldset-8-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/select")));
        Select Tifffailurefiles = new Select(driver.findElement(By.xpath("//*[@id=\"ui-fieldset-8-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/select")));
        Tifffailurefiles.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Select Spreadsheetfiles = new Select(driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Spreadsheetfiles.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Select Presentationfiles = new Select(driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Presentationfiles.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Select Otherfiles = new Select(driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Otherfiles.selectByVisibleText("CUSTOM: [insert custom instructions]");
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Select Productionnumbering = new Select(driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Productionnumbering.selectByVisibleText("CUSTOM: Document-level numbering with page suffix");
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > span > editable-dropdown > div > select")));
        Select Useexistingfields = new Select(driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > span > editable-dropdown > div > select")));
        Useexistingfields.selectByVisibleText("CUSTOM: [insert Field Name to use]");
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(11) > span > editable-dropdown > div > select")));
        Select Brandingfont = new Select(driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(11) > span > editable-dropdown > div > select")));
        Brandingfont.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-fieldset-9-content > div > div:nth-child(3) > div:nth-child(4) > span > editable-dropdown > div > select")));
        Select Bottomright = new Select(driver.findElement(By.cssSelector("#ui-fieldset-9-content > div > div:nth-child(3) > div:nth-child(4) > span > editable-dropdown > div > select")));
        Bottomright.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Select Loadfiledelimiters = new Select(driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Loadfiledelimiters.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Select Loadfileencodin = new Select(driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Loadfileencodin.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Select Imagefiledeliveryformat = new Select(driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Imagefiledeliveryformat.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > select")));
        Select Textfiledeliveryformat = new Select(driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > select")));
        Textfiledeliveryformat.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > select")));
        Select Nativefiledeliveryformat = new Select(driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > select")));
        Nativefiledeliveryformat.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Select Imagefolder = new Select(driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > select")));
        Imagefolder.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Select Textfolder = new Select(driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > select")));
        Textfolder.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Select Nativefolder = new Select(driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > select")));
        Nativefolder.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > select")));
        Select Loadfilefolder = new Select(driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > select")));
        Loadfilefolder.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > select")));
        Select Pathprefix = new Select(driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > select")));
        Pathprefix.selectByIndex(2);
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(6) > span > editable-dropdown > div > select")));
        Select pdffilefolder = new Select(driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(6) > span > editable-dropdown > div > select")));
        pdffilefolder.selectByVisibleText("CUSTOM: [insert custom instructions]");
        waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-7-content > div > div > textarea")));
        WebElement Splinstructiontext = driver.findElement(By.cssSelector("#ui-panel-7-content > div > div > textarea"));
        Splinstructiontext.sendKeys("test");

    }

    public void nondefaultconfirmationcheck_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        nondefaultconfirmationcheck();

    }

    public void nondefaultconfirmationcheck_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        nondefaultconfirmationcheck();

    }

    public void nondefaultconfirmationcheck_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        nondefaultconfirmationcheck();

    }

    public void nondefaultconfirmationcheck_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        nondefaultconfirmationcheck();

    }

    public boolean verifynondefaultvalueconfirmationchecked() {
        try {
            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")));
            String className0 = driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className0.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")));
            String className1 = driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className1.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")));
            String className2 = driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className2.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")));
            String className3 = driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className3.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")));
            String className4 = driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className4.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > div > user-confirmation-checkbox > i")));
            String className5 = driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className5.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > div > user-confirmation-checkbox > i")));
            String className6 = driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className6.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, Markupsetconfcheck);
            String className7 = Markupsetconfcheck.getAttribute("class");
            className7.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, Textconfcheck);
            String className8 = Textconfcheck.getAttribute("class");
            className8.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, Imageredactionconfcheck);
            String className9 = Imageredactionconfcheck.getAttribute("class");
            className9.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, BlackoutorAudioconfcheck);
            String className10 = BlackoutorAudioconfcheck.getAttribute("class");
            className10.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, Redactedwithfamilyconfcheck);
            String className11 = Redactedwithfamilyconfcheck.getAttribute("class");
            className11.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, Unreadableplaceholderconfcheck);
            String className12 = Unreadableplaceholderconfcheck.getAttribute("class");
            className12.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, Handlingunreadableconfcheck);
            String className13 = Handlingunreadableconfcheck.getAttribute("class");
            className13.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, Privielegeplaceholderconfcheck);
            String className14 = Privielegeplaceholderconfcheck.getAttribute("class");
            className14.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, Privielegewithfamilyconfcheck);
            String className15 = Privielegewithfamilyconfcheck.getAttribute("class");
            className15.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, emptyfileidentifierconfcheck);
            String className16 = emptyfileidentifierconfcheck.getAttribute("class");
            className16.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, emptyfilesconfcheck);
            String className17 = emptyfilesconfcheck.getAttribute("class");
            className17.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, NativeFilesconfcheck);
            String className18 = NativeFilesconfcheck.getAttribute("class");
            className18.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, Tifffailureconfcheck);
            String className19 = Tifffailureconfcheck.getAttribute("class");
            className19.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")));
            String className20 = driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className20.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")));
            String className21 = driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className21.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > div > user-confirmation-checkbox > i")));
            String className22 = driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className22.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(11) > div > user-confirmation-checkbox > i")));
            String className23 = driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(11) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className23.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")));
            String className26 = driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className26.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")));
            String className27 = driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className27.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")));
            String className28 = driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className28.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")));
            String className29 = driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className29.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")));
            String className30 = driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className30.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")));
            String className31 = driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className31.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")));
            String className32 = driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className32.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")));
            String className33 = driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(3) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className33.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")));
            String className34 = driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className34.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")));
            String className35 = driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className35.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")));
            String className36 = driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > div > user-confirmation-checkbox > i")).getAttribute("class");
            className36.contains("pi pi-check-circle default-option-check");

            waitForElement(driver, 5000, driver.findElement(By.cssSelector("#ui-panel-7-titlebar > p-header > div > user-confirmation-checkbox > i")));
            String className37 = driver.findElement(By.cssSelector("#ui-panel-7-titlebar > p-header > div > user-confirmation-checkbox > i")).getAttribute("class");
            className37.contains("pi pi-check-circle default-option-check");


            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void clearvalueclickingXandconfirmingcheckbox() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on Production DAT/TIFF/Text Time:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on Production Date Format:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on Production Time Format:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on Production Type:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Sort Order:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Previously Produced Docs-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(6) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Family Association:-" + driver.findElement(By.cssSelector("#ui-panel-1-content > div > div > div.ui-g-9 > div:nth-child(7) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/div/span/i"))).click();
        log.info("clicked on *Markup Set:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/div/span/i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/div/span/i"))).click();
        log.info("clicked on *Text:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/div/span/i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[3]/span/editable-dropdown/div/div/span/i"))).click();
        log.info("clicked on Image Redaction Label:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[3]/span/editable-dropdown/div/div/span/i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[4]/span/editable-dropdown/div/div/span/i"))).click();
        log.info("clicked on Blackout Redactions Text/Audio:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[4]/span/editable-dropdown/div/div/span/i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[5]/span/editable-dropdown/div/div/span/i"))).click();
        log.info("clicked on Redacted with Family:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-4-content\"]/div/div[2]/div[5]/span/editable-dropdown/div/div/span/i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/div/span/i"))).click();
        log.info("clicked on *Unreadable Placeholder/Text-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/div/span/i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/div/span/i"))).click();
        log.info("clicked on Unreadable with Family-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-5-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/div/span/i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/div/span/i"))).click();
        log.info("clicked on 1Privilege Placeholder/Text-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/div/span/i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/div/span/i"))).click();
        log.info("clicked on Privilege with Family Member-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-6-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/div/span/i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-7-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/div/span/i"))).click();
        log.info("clicked on Empty File Identifier:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-7-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/div/span/i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-7-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/div/span/i"))).click();
        log.info("clicked on *Empty Files:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-7-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/div/span/i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-8-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/div/span/i"))).click();
        log.info("clicked on *Native Files:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-8-content\"]/div/div[2]/div[1]/span/editable-dropdown/div/div/span/i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-fieldset-8-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/div/span/i"))).click();
        log.info("clicked on *Tiff failure/Exception Files:-" + driver.findElement(By.xpath("//*[@id=\"ui-fieldset-8-content\"]/div/div[2]/div[2]/span/editable-dropdown/div/div/span/i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Spreadsheet Files:-" + driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Presentation Files:-" + driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Other Files:-" + driver.findElement(By.cssSelector("#ui-panel-3-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on Production Numbering Method:-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Use Existing Fields:-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(10) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(11) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Branding Font:-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(11) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Load File Delimeters:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Load File Encoding:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Image File Delivery Format:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Text File Delivery Format:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Native File Delivery Format:-" + driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Image Folder:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Text Folder:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Natives Folder:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(3) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Load Files Folder:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(5) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *Path Prefix:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > div > span > i")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(6) > span > editable-dropdown > div > div > span > i"))).click();
        log.info("clicked on *PDF Files Folder:-" + driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(6) > span > editable-dropdown > div > div > span > i")).toString());


    }

    public void clearvalueclickingXandconfirmingcheckbox_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        clearvalueclickingXandconfirmingcheckbox();

    }

    public void clearvalueclickingXandconfirmingcheckbox_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        clearvalueclickingXandconfirmingcheckbox();

    }

    public void clearvalueclickingXandconfirmingcheckbox_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        clearvalueclickingXandconfirmingcheckbox();

    }

    public void clearvalueclickingXandconfirmingcheckbox_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        clearvalueclickingXandconfirmingcheckbox();

    }

    public boolean verifyclearvalueclickingXandconfirmingcheckbox() {
        verifynondefaultvalueconfirmationchecked();
        return true;

    }

    public void clearsectionconfirmationcheck() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-1-titlebar > p-header > div.general-production-buttons > button > span"))).click();
        log.info("clicked on General Production Requirements clear section:-" + driver.findElement(By.cssSelector("#ui-panel-1-titlebar > p-header > div.general-production-buttons > button > span")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-2-titlebar > p-header > div.redaction-placeholder-buttons > button > span"))).click();
        log.info("clicked on Redaction and Placeholder Requirements clear section:-" + driver.findElement(By.cssSelector("#ui-panel-2-titlebar > p-header > div.redaction-placeholder-buttons > button > span")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-3-titlebar > p-header > div.native-imaging-buttons > button > span"))).click();
        log.info("clicked on Native Imaging Options clear section:-" + driver.findElement(By.cssSelector("#ui-panel-3-titlebar > p-header > div.native-imaging-buttons > button > span")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-titlebar > p-header > div.branding-information-buttons > button > span"))).click();
        log.info("clicked on Branding Information clear section:-" + driver.findElement(By.cssSelector("#ui-panel-4-titlebar > p-header > div.branding-information-buttons > button > span")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-5-titlebar > p-header > div.production-file-spec-buttons > button > span"))).click();
        log.info("clicked on Production File Specifications clear section:-" + driver.findElement(By.cssSelector("#ui-panel-5-titlebar > p-header > div.production-file-spec-buttons > button > span")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-6-titlebar > p-header > div.production-location-foldering-buttons > button > span"))).click();
        log.info("clicked on Production Location and Foldering clear section:-" + driver.findElement(By.cssSelector("#ui-panel-6-titlebar > p-header > div.production-location-foldering-buttons > button > span")).toString());


    }

    public void clearsectionconfirmationcheck_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        clearsectionconfirmationcheck();

    }

    public void clearsectionconfirmationcheck_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        clearsectionconfirmationcheck();

    }

    public void clearsectionconfirmationcheck_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        clearsectionconfirmationcheck();

    }

    public void clearsectionconfirmationcheck_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        clearsectionconfirmationcheck();

    }

    public boolean verifyclearsectionconfirmationcheck() {
        verifynondefaultvalueconfirmationchecked();
        return true;

    }

    public void clearallconfirmationcheck() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-buttons > div > button"))).click();
        log.info("clicked on General Production Requirements clear section:-" + driver.findElement(By.cssSelector("body > app-root > app-main > div > div > div.layout-main > div > app-prod-spec > div.prod-spec-header-top > div.prod-spec-header-buttons > div > button")).toString());

    }

    public void clearallconfirmationcheck_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        clearallconfirmationcheck();

    }

    public void clearallconfirmationcheck_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        clearallconfirmationcheck();

    }

    public void clearallconfirmationcheck_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        clearallconfirmationcheck();

    }

    public void clearallconfirmationcheck_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        clearallconfirmationcheck();

    }

    public boolean verifyclearallconfirmationcheck() {
        verifynondefaultvalueconfirmationchecked();
        return true;

    }

    public void productionbatespreview() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(2) > span > input"))).sendKeys("123");
        log.info("Goto Branding info and enter value for prefix :-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(2) > span > input")).toString());
        WebElement startingNumber = driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(6) > span > input"));
        startingNumber.click();
        startingNumber.sendKeys(Keys.UP);
        startingNumber.sendKeys(Keys.UP);
        startingNumber.sendKeys(Keys.RETURN);

        WebElement Productionbatespadding = driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(8) > span > input"));
        Productionbatespadding.click();
        Productionbatespadding.sendKeys(Keys.UP);
        Productionbatespadding.sendKeys(Keys.UP);
        startingNumber.sendKeys(Keys.RETURN);

    }

    public void productionbatespreview_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        productionbatespreview();

    }

    public void productionbatespreview_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        productionbatespreview();

    }

    public void productionbatespreview_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        productionbatespreview();

    }

    public void productionbatespreview_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        productionbatespreview();

    }

    public boolean verifyproductionbatespreview() {

        try {
            waitForElement(driver, 50, driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(9) > span > p")));
            boolean b = driver.getPageSource().contains("12302");

            return b;
        } catch (Exception e) {
            return false;
        }
    }

    public void suffixdisplayonprodbatespreview() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(2) > span > input"))).sendKeys("123");
        log.info("Goto Branding info and enter value for prefix :-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(2) > span > input")).toString());
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(3) > span > input"))).sendKeys("abc");
        log.info("Goto Branding info and enter value for suffix :-" + driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(3) > span > input")).toString());
        WebElement PageSuffix = driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(5) > span > input"));
        PageSuffix.click();
        PageSuffix.sendKeys(Keys.UP);
        PageSuffix.sendKeys(Keys.UP);
        PageSuffix.sendKeys(Keys.UP);
        PageSuffix.sendKeys(Keys.RETURN);

        WebElement startingNumber = driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(6) > span > input"));
        startingNumber.click();
        startingNumber.sendKeys(Keys.UP);
        startingNumber.sendKeys(Keys.UP);
        startingNumber.sendKeys(Keys.UP);
        startingNumber.sendKeys(Keys.RETURN);

        WebElement Productionbatespadding = driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(8) > span > input"));
        Productionbatespadding.click();
        Productionbatespadding.sendKeys(Keys.UP);
        Productionbatespadding.sendKeys(Keys.UP);
        Productionbatespadding.sendKeys(Keys.UP);
        Productionbatespadding.sendKeys(Keys.RETURN);


    }

    public void suffixdisplayonprodbatespreview_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        suffixdisplayonprodbatespreview();
    }

    public void suffixdisplayonprodbatespreview_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        suffixdisplayonprodbatespreview();
    }


    public void suffixdisplayonprodbatespreview_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        suffixdisplayonprodbatespreview();
    }

    public void suffixdisplayonprodbatespreview_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        suffixdisplayonprodbatespreview();
    }

    public boolean verifysuffixonproductionbatespreview() {

        try {
            waitForElement(driver, 50, driver.findElement(By.cssSelector("#ui-panel-4-content > div > div > div.ui-g-9 > div:nth-child(9) > span > p")));
            boolean b = driver.getPageSource().contains("123003abc001");

            return b;
        } catch (Exception e) {
            return false;
        }

    }

    public void loadfileNoneoption() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement DataNone = driver.findElement(By.cssSelector("#ui-fieldset-10-content > div > div:nth-child(1) > div:nth-child(4) > p-checkbox > div > div.ui-chkbox-box.ui-widget.ui-corner-all.ui-state-default"));
        WebElement ImagesNone = driver.findElement(By.cssSelector("#ui-fieldset-10-content > div > div:nth-child(2) > div:nth-child(5) > p-checkbox > div > div.ui-chkbox-box.ui-widget.ui-corner-all.ui-state-default"));
        WebElement TextNone = driver.findElement(By.cssSelector("#ui-fieldset-10-content > div > div:nth-child(3) > div:nth-child(2) > p-checkbox > div > div.ui-chkbox-box.ui-widget.ui-corner-all.ui-state-default"));

        waitForElement(driver, 10, DataNone);
        boolean isEnabled1 = DataNone.isSelected();
        waitForElement(driver, 10, ImagesNone);
        boolean isEnabled2 = ImagesNone.isSelected();
        waitForElement(driver, 10, TextNone);
        boolean isEnabled3 = TextNone.isSelected();
        // performing click operation if checkbox is not selected
        if (isEnabled1 == false && isEnabled2 == false) {
            DataNone.click();
            log.info("click on Data None option :-" + DataNone.toString());

            ImagesNone.click();
            log.info("click on Data None option :-" + ImagesNone.toString());

            //TextNone.click();
            log.info("click on Data None option :-" + TextNone.toString());

        } else {
            System.out.println("Checkboxes are already checked");
        }

    }

    public void loadfileNoneoption_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        loadfileNoneoption();

    }

    public void loadfileNoneoption_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        loadfileNoneoption();

    }

    public void loadfileNoneoption_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        loadfileNoneoption();

    }

    public void loadfileNoneoption_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        loadfileNoneoption();

    }

    public boolean verifyloadfileNoneoption() {
        WebElement Datastandard = driver.findElement(By.cssSelector("#ui-fieldset-10-content > div > div:nth-child(1) > div:nth-child(2) > p-checkbox > div > div.ui-chkbox-box.ui-widget.ui-corner-all.ui-state-default"));
        WebElement Datacustom = driver.findElement(By.cssSelector("#ui-fieldset-10-content > div > div:nth-child(1) > div:nth-child(3) > p-checkbox > div > div.ui-chkbox-box.ui-widget.ui-corner-all.ui-state-default"));
        WebElement Imagestandard = driver.findElement(By.cssSelector("#ui-fieldset-10-content > div > div:nth-child(2) > div:nth-child(2) > p-checkbox > div > div.ui-chkbox-box.ui-widget.ui-corner-all.ui-state-default"));
        WebElement ImageLFP = driver.findElement(By.cssSelector("#ui-fieldset-10-content > div > div:nth-child(2) > div:nth-child(3) > p-checkbox > div > div.ui-chkbox-box.ui-widget.ui-corner-all.ui-state-default"));
        WebElement ImageDII = driver.findElement(By.cssSelector("#ui-fieldset-10-content > div > div:nth-child(2) > div:nth-child(4) > p-checkbox > div > div.ui-chkbox-box.ui-widget.ui-corner-all.ui-state-default"));
        WebElement TextLST = driver.findElement(By.cssSelector("#ui-fieldset-10-content > div > div:nth-child(3) > div:nth-child(3) > p-checkbox > div > div.ui-chkbox-box.ui-widget.ui-corner-all.ui-state-default"));

        boolean checked1 = Datastandard.isSelected();
        boolean checked2 = Datacustom.isSelected();
        boolean checked3 = Imagestandard.isSelected();
        boolean checked4 = ImageLFP.isSelected();
        boolean checked5 = ImageDII.isSelected();
        boolean checked6 = TextLST.isSelected();

        if (checked1 == false && checked2 == false && checked3 == false && checked4 == false && checked5 == false && checked6 == false) {
            return true;


        } else {
            return false;
        }
    }

    public void datanoneoptionpopup() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement DataNone = driver.findElement(By.cssSelector("#ui-fieldset-10-content > div > div:nth-child(1) > div:nth-child(4) > p-checkbox > div > div.ui-chkbox-box.ui-widget.ui-corner-all.ui-state-default"));

        waitForElement(driver, 10, DataNone);
        boolean isEnabled1 = DataNone.isSelected();

        // performing click operation if checkbox is not selected
        if (isEnabled1 == false) {
            DataNone.click();

        } else {
            System.out.println("Checkbox is already checked");
        }


    }

    public void datanoneoptionpopup_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        datanoneoptionpopup();

    }

    public void datanoneoptionpopup_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        datanoneoptionpopup();

    }

    public void datanoneoptionpopup_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        datanoneoptionpopup();

    }

    public void datanoneoptionpopup_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        datanoneoptionpopup();

    }

    public boolean verifydatanoneoptionpopup() {
        try {

            waitForElement(driver, 50, driver.findElement(By.cssSelector("#toast-container")));
            boolean b = driver.getPageSource().contains("This production will not have an associated data file");
            return b;
        } catch (Exception e) {
            return false;
        }

    }


    public void datanonefieldsdisable() {
        datanoneoptionpopup();
    }

    public void datanonefieldsdisable_relus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_relus();
        datanonefieldsdisable();

    }

    public void datanonefieldsdisable_reluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_reluk();
        datanonefieldsdisable();

    }

    public void datanonefieldsdisable_slus() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        datanonefieldsdisable();
    }

    public void datanonefieldsdisable_sluk() {
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_sluk();
        datanonefieldsdisable();
    }

    public boolean verifydatanonefieldsdisable() {

        try {
            waitForElement(driver, 50, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > div > input")));
            boolean Loadfiledelimiter = driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(1) > span > editable-dropdown > div > div > input")).isEnabled();

            waitForElement(driver, 50, driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > div > input")));
            boolean Loadfilencoding = driver.findElement(By.cssSelector("#ui-panel-5-content > div > div > div.ui-g-9 > div:nth-child(2) > span > editable-dropdown > div > div > input")).isEnabled();
            waitForElement(driver, 50, driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > div > input")));
            boolean Loadfilefolder = driver.findElement(By.cssSelector("#ui-panel-6-content > div > div > div > div.ui-g-9 > div:nth-child(4) > span > editable-dropdown > div > div > input")).isEnabled();
            Assert.assertEquals(Loadfiledelimiter, false);
            Assert.assertEquals(Loadfilencoding, false);
            Assert.assertEquals(Loadfilefolder, false);


            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
















