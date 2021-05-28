package RELUSForms;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;

    public class TC0081_Clearallconfirmationchecks extends testBase {
        ProdspecPage prodspecPage;

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void clearallconfirmchecks() {
            log.info("=======started clearallconfirmchecks Test===========");
            ProdspecPage prodspecpage = new ProdspecPage(driver);
            prodspecpage.clearallconfirmationcheck_relus();
            Assert.assertEquals(true, prodspecpage.verifyclearallconfirmationcheck());
            log.info("=======Finished clearallconfirmchecks Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }







