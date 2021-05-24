package SLUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;


public class TC0060_Confirmationcheckboxcheck_nativeimagingoptions extends testBase {
    ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }

    @Test
    public void nativeimagingoptionscheckboxeschecked() {
        log.info("=======started nativeimagingoptionscheckboxeschecked Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.nativeimagingoptionscheckboxchecked_sluk();
        Assert.assertEquals(true, prodspecpage.verifynativeimagingoptionscheckboxchecked());
        log.info("=======Finished nativeimagingoptionscheckboxeschecked Test===========");
    }
    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}