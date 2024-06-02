package br.minsait.leonardonps.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    
    protected static WebDriver driver;
    protected static String URL_BASE = "http://automationpractice.pl/index.php";
    protected static String CAMINHO_DRIVER = "src/test/java/br/minsait/leonardonps/resource/chromedriver.exe";

    @Before
    public void iniciar() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @After
    public void finalizar() {
        driver.quit();
    }
}
