import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleTest {
    public static void main(String[] args) {
        // Automatic download and setup of WebDriver
        WebDriverManager.chromedriver().setup();

        // Initialize the browser
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Print the page title
        System.out.println("Page title: " + driver.getTitle());

        try {
            Thread.sleep(30000); // Time in milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}