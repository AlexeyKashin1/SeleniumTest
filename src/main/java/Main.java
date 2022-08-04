import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Драйвер\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Кашин Алексей");
        element.sendKeys(Keys.ENTER);
        WebElement picturesLink = driver.findElement(By.linkText("Картинки"));
        picturesLink.click();
        WebElement card =driver.findElement(By.cssSelector("[data-ri='2'] a"));
        card.click();
    }
}
