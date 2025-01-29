package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public abstract class TestBase {

    protected WebDriver driver;
    ConfigReader configReader;

    @BeforeTest

    public void setUp()
    {
        driver = new ChromeDriver();
        configReader = new ConfigReader();
        driver.get(configReader.getProperty("baseURL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterClass

    public void tearDown()
    {
        driver.quit();

    }
}
