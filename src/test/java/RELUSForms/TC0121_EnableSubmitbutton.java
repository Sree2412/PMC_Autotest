package RELUSForms;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0121_EnableSubmitbutton extends testBase {


        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void enableSubmit() {
            log.info("=======started enableSubmit Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            prodspecPageext.enableSubmitbutton_relus();
            Assert.assertEquals(true, prodspecPageext.verifySubmitbuttonenabled());
            log.info("=======Finished enableSubmit Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }




