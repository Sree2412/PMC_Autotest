package SLUKForms;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;

    public class TC0074_ClearvalueclickingXandconfirmingcheckbox extends testBase {
        ProdspecPage prodspecPage;

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void clickXclearvalueandconfirmingcheckbox() {
            log.info("=======started clickXclearvalueandconfirmingcheckbox Test===========");
            ProdspecPage prodspecpage = new ProdspecPage(driver);
            prodspecpage.clearvalueclickingXandconfirmingcheckbox_sluk();
            Assert.assertEquals(true, prodspecpage.verifyclearvalueclickingXandconfirmingcheckbox());
            log.info("=======Finished clickXclearvalueandconfirmingcheckbox Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }
















