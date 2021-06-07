package SLUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0126_ProdspecNameatleast5char extends testBase {


        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void ProdspecNameatleast5char() {
            log.info("=======started ProdspecNameatleast5char Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            prodspecPageext.prodnamelessthan5chars_sluk();
            Assert.assertEquals(true, prodspecPageext.verifyprodnamelessthan5chars());
            log.info("=======Finished ProdspecNameatleast5char Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }

