package RELUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0148_Validationerrorverification extends testBase {

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void validationerrorverification() {
            log.info("=======started validationerrorverification Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            prodspecPageext.validationerrorredhighlight_reluk();
            Assert.assertEquals(true, prodspecPageext.verifyvalidationerrors_toasterpopup());
            Assert.assertEquals(true, prodspecPageext.verifyredhighlight());
            //Assert.assertEquals(true, prodspecPageext.verifyvalidationerrors());
            log.info("=======Finished validationerrorverification Test===========");
        }

        @AfterClass
        public void endTest() {

           closeBrowser();
        }
    }



