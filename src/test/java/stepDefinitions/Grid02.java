package stepDefinitions;

import manage.GridDriverManage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Grid02 {
    GridDriverManage manage = new GridDriverManage();
    WebDriver driver;

    @Test
    public void chromeTest() throws MalformedURLException {
        driver = manage.setupChromeDriver();
        driver.get("https://www.babayigit.net");
        System.out.println("Chrome Title: " + driver.getTitle());
    }

    @Test
    public void firefoxTest() throws MalformedURLException {
        driver = manage.setupFirefoxDriver();
        driver.get("https://www.amazon.com/");
        System.out.println("Firefox Title: " + driver.getTitle());
    }

    @Test
    public void edgeDriverTest() throws MalformedURLException {
        driver = manage.setupEdgeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println("Edge Title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
