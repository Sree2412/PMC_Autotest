


package Testcases;

        import org.testng.Assert;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;
        import testBase.testBase;
        import uiActions.ProdspecPage;

        import java.io.IOException;



public class TC0017_Confirmationcheckboxuncheck_prodinfo  extends testBase {
    uiActions.ProdspecPage prodspecPage;

    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }






    @Test
    public void productioninfocheckconfirmationcheckboxesunchecked() {
        log.info("=======started productioninfocheckconfirmationcheckboxesunchecked Test===========");
        ProdspecPage prodspecpage = new ProdspecPage(driver);
        prodspecpage.produtioninfocheckboxunchecked();
        Assert.assertEquals(true, prodspecpage.verifyproductioninfomaincheckboxunchecked());
        log.info("=======Finished productioninfocheckconfirmationcheckboxesunchecked Test===========");
    }
    @AfterClass
    public void endTest() {

        closeBrowser();
    }
}