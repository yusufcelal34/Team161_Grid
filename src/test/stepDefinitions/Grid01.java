package test.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid01 {

    static WebDriver driver;

    @Test
    void ChromeGridTest() throws MalformedURLException {

        // driver = new ChromeDriver();

        driver = new RemoteWebDriver(new URL("http://192.168.1.5:4444"),new ChromeOptions());
        // Local driver olan WebDriver'i Remote Driver'a çevirdik
        // Bunu yaparken RemoteWebDriver class'ından hangi node'un çalışacağını belirttik.
        // Ayrıca bu node içinde hangi driver'ın options'larını kullanacağını belirledik

        driver.get("https://www.babayigit.net");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test
    void FireFoxGridTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.27:4444"),new FirefoxOptions());
        // Local driver olan WebDriver'i Remote Driver'a çevirdik
        // Bunu yaparken RemoteWebDriver class'ından hangi node'un çalışacağını belirttik.
        // Ayrıca bu node içinde hangi driver'ın options'larını kullanacağını belirledik

        driver.get("https://www.babayigit.net");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test
    void MSEgdeGridTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.274444"),new EdgeOptions());
        // Local driver olan WebDriver'i Remote Driver'a çevirdik
        // Bunu yaparken RemoteWebDriver class'ından hangi node'un çalışacağını belirttik.
        // Ayrıca bu node içinde hangi driver'ın options'larını kullanacağını belirledik

        driver.get("https://www.babayigit.net");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();
    }

    //Bu testlerimizi GRID ortamında çalıştırdık.
    // Bu testleri çalıştırırken capabilities göndermedn mevcut options'ları kullarak yaptık.
}