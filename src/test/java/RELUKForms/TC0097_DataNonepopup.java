package RELUKForms;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;

    public class TC0097_DataNonepopup extends testBase {
        ProdspecPage prodspecPage;

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void datanonepopup() {
            log.info("=======started datanonepopup Test===========");
            ProdspecPage prodspecpage = new ProdspecPage(driver);
            prodspecpage.datanoneoptionpopup_reluk();
            Assert.assertEquals(true, prodspecpage.verifydatanoneoptionpopup());
            log.info("=======Finished datanonepopup Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }

