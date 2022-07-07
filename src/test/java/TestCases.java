import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCases {

    protected ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    @BeforeClass
    public void Dispose() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @BeforeMethod
    void setDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    void test1() throws InterruptedException {
        System.out.println("i m inside test 1 | " + Thread.currentThread().getId());
        driver.set(new ChromeDriver());
        driver.get().get("https://www.google.com");
        Thread.sleep(3000);
        driver.get().close();
    }

    @Test
    void test2() throws InterruptedException {
        System.out.println("i m inside test 2 | " + Thread.currentThread().getId());
        driver.set(new ChromeDriver());
        driver.get().get("http://seleniumhq.org");
        Thread.sleep(3000);
        driver.get().close();
    }
}
