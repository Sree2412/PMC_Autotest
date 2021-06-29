package SLUKForms;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0150_Validationerrorverification extends testBase {

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void validationerrorverification_redhighlight() {
            log.info("=======started validationerrorverification Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            prodspecPageext.validationerrorredhighlight_sluk();
            Assert.assertEquals(true, prodspecPageext.verifyvalidationerrors_toasterpopup());
            Assert.assertEquals(true, prodspecPageext.verifyredhighlight());
            log.info("=======Finished validationerrorverification Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }

