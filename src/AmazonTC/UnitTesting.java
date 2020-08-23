package AmazonTC;

import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class UnitTesting extends MyAmazonTest_Cases {

//    public void testopenBrowserChrome(){
//        openBrowserChrome(amazonurl);
//        String actualText=driver.findElement(By.xpath()).getText();
//        Assert.assertEquals(actualText,);
//
//
//    }
    @Test
    public void testburgerButton() throws InterruptedException {
        burgerButton();
        String actualText=driver.findElement(By.xpath(menuActualText)).getText();
        Assert.assertEquals(actualText,menuExpectedText);

    }
    @Test
    public void testprimeVideoArrow() throws InterruptedException {
        primeVideoArrow();
        String actualText=driver.findElement(By.cssSelector(primeVideoActualText)).getText();
        Assert.assertEquals(actualText, primeVideoExpectedText);

    }
}
