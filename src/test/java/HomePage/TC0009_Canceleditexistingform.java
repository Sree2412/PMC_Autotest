package HomePage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ComparePage;
import uiActions.EditexistingPage;

import java.io.IOException;



public class TC0009_Canceleditexistingform  extends testBase {
    uiActions.EditexistingPage editexistingpage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }

    @Test
    public void cancelexistingformbutton() {
        log.info("=======started cancelexistingformbutton Test===========");
        EditexistingPage editexistingpage = new EditexistingPage(driver);
        editexistingpage.editexistingcancelbutton();
        Assert.assertEquals(true, editexistingpage.verifyeditexistingCloseButton());
        log.info("=======Finished openexistingformbutton Test===========");
    }

    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}






