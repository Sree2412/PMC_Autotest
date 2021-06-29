package RELUKForms;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0152_Clearerrorvalidation extends testBase {

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void clearerroronfields () {
            log.info("=======started clearerroronfields Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            prodspecPageext.clearerrorvalidation_reluk();
            Assert.assertEquals(true, prodspecPageext.verifyclearerrorvalidation());
            log.info("=======Finished clearerroronfields Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }




