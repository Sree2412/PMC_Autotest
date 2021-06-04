package RELUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0112_CannotsaveformwithoutHcode extends testBase {
        ProdspecPage prodspecPage;

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void cannotsaveformwithoutHcodename() {
            log.info("=======started cannotsaveformwithoutHcodename Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            prodspecPageext.cannotsaveformwohcode_reluk();
            Assert.assertEquals(true, prodspecPageext.verifycannotsaveformwithoutHcode());
            log.info("=======Finished cannotsaveformwithoutHcodename Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }



