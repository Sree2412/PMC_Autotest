package SLUKForms;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;

    public class TC0078_Clearsectionconfirmationcheck extends testBase {
        ProdspecPage prodspecPage;

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void clearsectionconfirmcheck() {
            log.info("=======started clearsectionconfirmcheck Test===========");
            ProdspecPage prodspecpage = new ProdspecPage(driver);
            prodspecpage.clearsectionconfirmationcheck_slus();
            Assert.assertEquals(true, prodspecpage.verifyclearsectionconfirmationcheck());
            log.info("=======Finished clearsectionconfirmcheck Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }

