package Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ComparePage;

import java.io.IOException;

public class TC0006_CompareForms extends testBase {
    uiActions.ComparePage comparepage;


        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void compareForm() {
            log.info("=======started compareForm Test===========");
            ComparePage comparepage = new ComparePage(driver);
            comparepage.compareProdspecforms();
            Assert.assertEquals(true, comparepage.verifyCompareForms());
            log.info("=======Finished compareForm Test===========");
        }



        @AfterClass
        public void endTest() {

            closeBrowser();
        }

    }

