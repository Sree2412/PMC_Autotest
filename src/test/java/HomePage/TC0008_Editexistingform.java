package HomePage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;

import java.io.IOException;




public class TC0008_Editexistingform extends testBase {
    uiActions.EditexistingPage editexistingpage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }

    @Test()
    /*public void openexistingform() {
        log.info("=======started openexistingform Test===========");
        EditexistingPage editexistingpage = new EditexistingPage(driver);
        editexistingpage.editexistingProdspecforms();
        Assert.assertEquals(true, editexistingpage.verifyexistingformsopens());
        log.info("=======Finished openexistingform Test===========");
    }*/

    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}






