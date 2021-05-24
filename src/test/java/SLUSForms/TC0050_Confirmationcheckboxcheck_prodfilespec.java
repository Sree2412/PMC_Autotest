


package SLUSForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;


public class TC0050_Confirmationcheckboxcheck_prodfilespec extends testBase {
    ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }

    @Test
    public void prodfilespeccheckboxeschecked() {
        log.info("=======started prodfilespeccheckboxeschecked Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.prodfilespeccheckboxchecked_slus();
        Assert.assertEquals(true, prodspecpage.verifyprodfilespeccheckboxchecked());
        log.info("=======Finished prodfilespeccheckboxeschecked Test===========");
    }
    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}