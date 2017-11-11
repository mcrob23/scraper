import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

  public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","./chromedriver");

// objects and variables instantiation
    WebDriver driver = new ChromeDriver();
    String appUrl = "https://accounts.google.com";

// launch the firefox browser and open the application url
    driver.get(appUrl);

// maximize the browser window
    driver.manage().window().maximize();

  }
}
