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
        String actualText = driver.findElement(By.xpath(menuActualText)).getText();
        Assert.assertEquals(actualText, menuExpectedText);
        driver.close();
        driver.quit();

    }

    @Test
    public void testprimeVideoArrow() throws InterruptedException {
        primeVideoArrow();
        //Thread.sleep(5000);
        String actualText = driver.findElement(By.cssSelector(primeVideoActualText)).getText();
        Assert.assertEquals(actualText, primeVideoExpectedText);
        driver.close();
        driver.quit();

    }

    @Test
    public void amazonMusicTest() throws InterruptedException {
        amazonMusic();
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath(amazonMusicActualText)).getText();
        Assert.assertEquals(actualText, amazonMusicExpectedText);
        driver.close();
        driver.quit();
    }

    @Test
    public void echoAlexaTest() throws InterruptedException {
        echoAlexa();
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath(echoAlexaActualText)).getText();
        Assert.assertEquals(actualText, echoAlexaExpectedText);
        driver.close();
        driver.quit();
    }

    @Test
    public void fireTabletTest() throws InterruptedException {
        fireTablet();
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath(fireTabletActualText)).getText();
        Assert.assertEquals(actualText, fireTabletExpectedText);
        driver.close();
        driver.quit();
    }

    @Test
    public void fireTvTest() throws InterruptedException {
        fireTablet();
        //Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath(fireTvActualText)).getText();
        Assert.assertEquals(actualText,fireTvExpectedText);
        driver.close();
        driver.quit();
    }
}