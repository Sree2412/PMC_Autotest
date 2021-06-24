package SLUSForms;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0139_Defaultselections extends testBase {

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void defaultvaluesverification() {
            log.info("=======started defaultvaluesverification Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            Assert.assertEquals(true, prodspecPageext.verifydefaultselection_slus());
            log.info("=======Finished defaultvaluesverification Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }




