package RELUSForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0109_CannotsaveformwithoutProdname extends testBase {
        ProdspecPage prodspecPage;

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void cannotsaveformwithoutprodname() {
            log.info("=======started cannotsaveformwithoutprodname Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            prodspecPageext.cannontsaveform_relus();
            Assert.assertEquals(true, prodspecPageext.verifycannotsaveformwithoutprodname());
            log.info("=======Finished cannotsaveformwithoutprodname Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }


