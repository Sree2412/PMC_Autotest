package testBase;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;


public class testBase {

    public static final Logger log = Logger.getLogger(testBase.class.getName());

    public WebDriver driver;
    //public excelReader.ExcelExtractor excel;
    public Properties OR = new Properties();
    public static ExtentReports extent;
    public static ExtentTest test;
    public ITestResult result;

    public WebDriver getDriver() {
        return driver;
    }
    /*For Extent Reporting*/
    static {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss");
        extent = new ExtentReports(System.getProperty("user.dir") + "/src/main/java/Report/test" + formater.format(calendar.getTime()) + ".html", false);
    }

    /*To read  Configuration file*/
    public void loadData() throws IOException {
        File file = new File(System.getProperty("user.dir") + "/src/main/java/config/config.properties");
        FileInputStream f = new FileInputStream(file);
        OR.load(f);

    }



    /*Initializing objects*/
    public void init() throws IOException, InterruptedException {
        loadData();
        extent = new ExtentReports(System.getProperty("user.dir") + "/src/main/java/Report/testreport.html", false);
        String log4jConfPath = "log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        System.out.println(OR.getProperty("browser"));
        selectBrowser(OR.getProperty("browser"));
        getUrl(OR.getProperty("url"));
    }


    /*To select and open browsers of choice using different OS*/
    public  void selectBrowser(String browser) throws IOException {
        System.out.println(System.getProperty("os.name"));
        if (System.getProperty("os.name").contains("Window")) {
            if (browser.equals("chrome")) {

                System.out.println(System.getProperty("user.dir"));
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver/chromedriver.exe");
                //driver = new ChromeDriver();//gui mode on
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                options.addArguments("--start-maximized");
                options.addArguments("--disable-gpu");
                options.addArguments("--window-size=1280,800");
                options.addArguments("--allow-insecure-localhost");
                driver = new ChromeDriver(options);

            }
        } else if (browser.equals("firefox")) {
            System.out.println(System.getProperty("user.dir"));
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver/geckodriver.exe");
            driver = new FirefoxDriver();
        }
    }


    /*navigating to url+ maximizing windows+Adding implicit wait time*/
    public void getUrl(String url)  {
        //driver.manage().window().maximize();
        driver.get(url);
        log.info("navigating to :-" + url);


        /*Screen scr = new Screen();

        Pattern ptnlink1 = new Pattern(System.getProperty("user.dir") + "\\Sikuli\\PMC\\1622065504963.png");
        try {
            scr.type(ptnlink1,"samada");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Pattern ptnlink2 = new Pattern(System.getProperty("user.dir") + "\\Sikuli\\PMC\\1622065515325.png");
        try {
            scr.type(ptnlink2,"Supernova2021!!");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Pattern ptnlink3 = new Pattern(System.getProperty("user.dir") + "\\Sikuli\\PMC\\1622065523887.png");
        try {
            scr.click(ptnlink3);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

        Pattern ptnlink4 = new Pattern(System.getProperty("user.dir") + "\\Sikuli\\PMC\\1622065504963.png");
        try {
            scr.type(ptnlink4,"samada");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Pattern ptnlink5 = new Pattern(System.getProperty("user.dir") + "\\Sikuli\\PMC\\1622065515325.png");
        try {
            scr.type(ptnlink5,"Supernova2021!!");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Pattern ptnlink6 = new Pattern(System.getProperty("user.dir") + "\\Sikuli\\PMC\\1622065523887.png");
        try {
            scr.click(ptnlink6);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }*/

    }



    //Read Excel sheet data
    /*public String[][] getData(String excelName, String sheetName) {
        String path = System.getProperty("user.dir") + "/src/main/java/data/" + excelName;
        excel = new excelReader.Excel_Reader(path);
        String[][] data = excel.getDataFromSheet(sheetName, excelName);
        return data;
    }*/
    /*adding explicit wait method by visibility of elements*/
    public void waitForElement(WebDriver driver, int timeOutInSeconds, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    /* Explicit Wait method for Webelement to be clickable*/
    public void  waitForElement(WebDriver driver, WebElement element, long timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
//		return element;
    }

    /*Highlighting web element*/
    public static void highlightMe(WebDriver driver, WebElement element) throws InterruptedException {
        // Creating JavaScriptExecuter Interface
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Execute javascript
        js.executeScript("arguments[0].style.border='4px solid yellow'", element);
        Thread.sleep(3000);
        js.executeScript("arguments[0].style.border=''", element);
    }
    /*handling multiple windows by clicking on links eg:clicking on facebook link*/
    public Iterator<String> getAllWindows() {
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> itr = windows.iterator();
        return itr;
    }
    /*Capturing screenshots for all runs*/
    public void getScreenShot(WebDriver driver, ITestResult result, String folderName) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

        String methodName = result.getName();

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/main/java/";
            File destFile = new File((String) reportDirectory + "/" + folderName + "/" + methodName + "_" + formater.format(calendar.getTime()) + ".png");

            FileUtils.copyFile(scrFile, destFile);

            Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*Capturing screenshots for successful runs and feed to extent reports and testng reports*/
    public void getScreenShotOnSucess(WebDriver driver, ITestResult result) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss");

        String methodName = result.getName();

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/main/java/";
            File destFile = new File((String) reportDirectory + "/failure_screenshots/" + methodName + "_" + formater.format(calendar.getTime()) + ".png");

            FileUtils.copyFile(scrFile, destFile);

            Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*Capturing screenshots when files are null or blank*/
    public String captureScreen(String fileName) {
        if (fileName == "") {
            fileName = "blank";
        }
        File destFile = null;
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss");

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/main/java/screenshot/";
            destFile = new File((String) reportDirectory + fileName + "_" + formater.format(calendar.getTime()) + ".png");
            FileUtils.copyFile(scrFile, destFile);
            // This will help us to link the screen shot in testNG report
            Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destFile.toString();
    }

    /*For logging all executions*/
    public void log(String data) {
        log.info(data);
        Reporter.log(data);
        test.log(LogStatus.INFO, data);
    }
    /*Implementing extent report*/
    public void getresult(ITestResult result) {
        if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(LogStatus.PASS, result.getName() + " test is pass");
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(LogStatus.SKIP, result.getName() + " test is skipped and skip reason is:-" + result.getThrowable());
        } else if (result.getStatus() == ITestResult.FAILURE) {
            test.log(LogStatus.ERROR, result.getName() + " test is failed" + result.getThrowable());
            String screen = captureScreen("");
            test.log(LogStatus.FAIL, test.addScreenCapture(screen));
        } else if (result.getStatus() == ITestResult.STARTED) {
            test.log(LogStatus.INFO, result.getName() + " test is started");
        }
    }
    /*To capture results to extent reports this method should be run after all executions*/
    @AfterMethod()
    public void afterMethod(ITestResult result) {
        getresult(result);

    }
    /*To capture results to extent reports this method should be run before all executions*/
    @BeforeMethod()
    public void beforeMethod(Method result) {
        test = extent.startTest(result.getName());
        test.log(LogStatus.INFO, result.getName() + " test Started");
    }
    /*This method will be run after each execution and closes browser*/
    @AfterClass(alwaysRun = true)
    public void
    endTest() {
        closeBrowser();
    }
    /* To quit browser and flush the results to extent reports*/
    public void closeBrowser() {
        driver.quit();
        log.info("browser closed");
        extent.endTest(test);
        extent.flush();
    }


}




