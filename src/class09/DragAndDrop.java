package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement draggable= driver.findElement(By.id("draggable"));

        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions action=new Actions(driver);
        action.dragAndDrop(draggable,droppable).perform();

    }
}
