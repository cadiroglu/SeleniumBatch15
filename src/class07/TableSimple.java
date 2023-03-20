package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class TableSimple {
    public static void main(String[] args) {

        FirefoxDriver driver=new FirefoxDriver();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        String table_data = table.getText();
        System.out.println(table_data);
        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

        for(WebElement row:Rows) {

            String row_text = row.getText();
            if (row_text.contains("Google")) {
                System.out.println(row_text);
            }
        }
    }
}