package HomePage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ComparePage;

import java.io.IOException;


public class


TC0007_CompareFormClose extends testBase {
    uiActions.ComparePage comparepage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }

    @Test
    public void compareformclosebutton() {
        log.info("=======started compareformclosebutton Test===========");
        ComparePage comparepage = new ComparePage(driver);
        comparepage.CloseButton();
        Assert.assertEquals(true, comparepage.verifyCloseButton());
        log.info("=======Finished compareformclosebutton Test===========");
    }

    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}






