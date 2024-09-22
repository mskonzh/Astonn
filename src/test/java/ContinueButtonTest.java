import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class ContinueButtonTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
    }

    @Test
    public void testContinueButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            WebElement cookieCloseButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("cookie-agree")));
            cookieCloseButton.click();
        } catch (Exception e) {
        }

        WebElement phoneNumberInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-phone")));
        phoneNumberInput.sendKeys("297777777");

        WebElement amountInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-sum")));
        amountInput.sendKeys("1");


        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit' and contains(@class, 'button__default')]")));
        continueButton.click();

        WebElement iframeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe.bepaid-iframe")));
        driver.switchTo().frame(iframeElement);

        WebElement modalWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div")));

        Assert.assertTrue(modalWindow.isDisplayed(), "Модальное окно не открылось");

        driver.switchTo().defaultContent();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
