package tdbankTestcases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TdTestCaseTest extends TdTestCase {

        @Test
        public void testCommercialButtonCheck() throws InterruptedException {
            commercialButtonCheck();
            Thread.sleep(8000);
            String actualText = driver.findElement(By.xpath(commercialActualText)).getText();
            Assert.assertEquals(actualText, commercialExpectedText);
        }

        @Test
        public void testSmallBusinessCheck() throws InterruptedException {
            SmallBusinessButtonCheck();
            Thread.sleep(8000);
            String actualText = driver.findElement(By.xpath(smallBusinessActualText)).getText();
            Assert.assertEquals(actualText, smallBusinessExpectedText);
        }

        @Test
        public void testPersonalButtonCheck() throws InterruptedException {
            personalButtonCheck();
            Thread.sleep(8000);
            String actualText = driver.findElement(By.xpath(personalActualText)).getText();
            Assert.assertEquals(actualText, personalExpectedText);
        }

        @Test
        public void testLoginButtonCheck() throws InterruptedException {
            loginButtonCheck();
            Thread.sleep(8000);
            String actualText = driver.findElement(By.xpath(loginActualText)).getText();
            Assert.assertEquals(actualText, loginExpectedText);
        }

        @Test
        public void testHelpButtonCheck() throws InterruptedException {
            helpButtonCheck();
            Thread.sleep(8000);
            String actualText = driver.findElement(By.xpath(helpActualText)).getText();
            Assert.assertEquals(actualText, helpExpectedText);
        }

        @Test
        public void testLearningButtonCheck() throws InterruptedException {
            learningButtonCheck();
            Thread.sleep(8000);
            String actualText = driver.findElement(By.xpath(learningActualText)).getText();
            Assert.assertEquals(actualText, learningExpectedText);
        }

        @Test
        public void testFindUsButtonCheck() throws InterruptedException {
            findUsButtonCheck();
            Thread.sleep(8000);
            String actualText = driver.findElement(By.xpath(findUsActualText)).getText();
            Assert.assertEquals(actualText, findUsExpectedText);
        }

        @Test
        public void testGetOfferButtonCheck() throws InterruptedException {
            getOfferButtonCheck();
            Thread.sleep(8000);
            String actualText = driver.findElement(By.xpath(getOfferActualText)).getText();
            Assert.assertEquals(actualText, getOfferExpectedText);
        }

        @Test
        public void testInvestingWealthButtonCheck() throws InterruptedException {
            investingWealthButtonCheck();
            Thread.sleep(8000);
            String actualText = driver.findElement(By.xpath(investingWealthActualText)).getText();
            Assert.assertEquals(actualText, investingWealthExpectedText);
        }

        @Test
        public void testCreditCardButtonCheck() throws InterruptedException {
            creditCardButtonCheck();
            Thread.sleep(8000);
            String actualText = driver.findElement(By.xpath(creditCardButtonActualText)).getText();
            Assert.assertEquals(actualText, creditCardButtonExpectedText);
        }

        @Test
        public void testCheckingAccountButtonCheck() throws InterruptedException {
            checkingAccountButtonCheck();
            Thread.sleep(8000);
            String actualText = driver.findElement(By.xpath(checkingAccountActualText)).getText();
            Assert.assertEquals(actualText, checkingAccountExpectedText);
        }

        @Test
        public void testSavingAccountButtonCheck() throws InterruptedException {
            savingAccountButtonCheck();
            Thread.sleep(8000);
            String actualText = driver.findElement(By.xpath(savingAccountActualText)).getText();
            Assert.assertEquals(actualText, savingAccountExpectedText);
        }

        @Test
        public void testMortgageLoanButtonCheck() throws InterruptedException {
            mortgageLoanButtonCheck();
            Thread.sleep(8000);
            String actualText = driver.findElement(By.xpath(mortgageLoanActualText)).getText();
            Assert.assertEquals(actualText, mortgageLoanExpectedText);
        }

        @Test
        public void testPersonalLoanButtonCheck() throws InterruptedException {
            personalLoanButtonCheck();
            Thread.sleep(8000);
            String actualText = driver.findElement(By.xpath(personalLoanActualText)).getText();
            Assert.assertEquals(actualText, personalLoanExpectedText);
        }




}

