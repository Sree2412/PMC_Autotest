package HomePage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.HomePage;

import java.io.IOException;


public class TC000_CreatenewForm extends testBase{
    uiActions.HomePage Homepage;
    @BeforeClass
    public void setUp() throws IOException {
        init();
    }

    @Test
    public void createNewForm() {
        log.info("=======started NewFormcreation Test===========");
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation();
        Assert.assertEquals(true, homepage.getProjectInformationheader());
        log.info("=======Finished NewFormcreation Test===========");
    }

    @AfterClass
    public void endTest() {
        closeBrowser();
    }

}
