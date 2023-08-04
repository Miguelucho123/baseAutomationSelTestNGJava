package tests;

import common.BaseTest;
import org.testng.annotations.Test;
import pages.CataloguePage;

public class CatalogueTest extends BaseTest {
    @Test
    public void testPrint(){
        CataloguePage cataloguePage = new CataloguePage(driver);
        cataloguePage.printNumberAndObject();
    }
}
