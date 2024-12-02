package pl.galaxysurfer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumscript {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/Users/peterklejment/IdeaProjects/Selenium_1.0/src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }

}
