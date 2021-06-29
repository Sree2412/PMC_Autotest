package RELUSForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0153_Clearerrorvalidation extends testBase {

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void clearerroronfields () {
            log.info("=======started clearerroronfields Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            prodspecPageext.clearerrorvalidation_relus();
            Assert.assertEquals(true, prodspecPageext.verifyclearerrorvalidation());
            log.info("=======Finished clearerroronfields Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }


