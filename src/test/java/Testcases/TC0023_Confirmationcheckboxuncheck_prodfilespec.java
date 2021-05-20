


package Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;


public class TC0023_Confirmationcheckboxuncheck_prodfilespec extends testBase {
    ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }

    @Test
    public void prodfilespeccheckboxesunchecked() {
        log.info("=======started prodfilespeccheckboxesunchecked Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.prodfilespeccheckboxunchecked();
        Assert.assertEquals(true, prodspecpage.verifyprodfilespeccheckboxunchecked());
        log.info("=======Finished prodfilespeccheckboxesunchecked Test===========");
    }
    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}