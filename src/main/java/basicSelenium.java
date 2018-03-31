import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.security.Key;

public class basicSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/monilj/Downloads/Devlopment/xyx/granite_dls_ui_latest_code/Sle_start/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https:google.com";
        driver.get(baseUrl);
        driver.findElement(By.name("q")).sendKeys("selnium");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.close();


    }
}
