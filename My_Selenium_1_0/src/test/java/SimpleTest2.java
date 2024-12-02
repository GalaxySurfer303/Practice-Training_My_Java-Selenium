import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest2 {
    public static void main(String[] args) {
        // Specify the path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/Users/peterklejment/Documents/Dev_Stuff/chromedriver/chromedriver");

        // Initialize the browser
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Print the page title
        System.out.println("Page title: " + driver.getTitle());

        // Wait 30 seconds after the test ends
        try {
            Thread.sleep(30000); // Time in milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}