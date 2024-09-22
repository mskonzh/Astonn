import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BlockTitleTest {
    WebDriver driver;
    private Object actualHeader;


    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
    }

    @Test
    public void testPageTitle() {
        String expectedTitle = "Онлайн пополнение без комиссии";
        WebElement payWrapper = driver.findElement(By.cssSelector(".pay__wrapper"));
        WebElement header = payWrapper.findElement(By.tagName("h2"));
        String actualHeader = header.getText().replace("\n", " ");
        Assert.assertEquals(actualHeader,expectedTitle, "Заголовок страницы не совпадает!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
