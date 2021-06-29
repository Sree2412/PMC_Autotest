package SLUKForms;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0142_Fieldschoices extends testBase {

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void fieldchoices() {
            log.info("=======started fieldchoices Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            Assert.assertEquals(true, prodspecPageext.verifyfieldchoices_sluk());
            log.info("=======Finished fieldchoices Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }





