package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {
        //tell your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //max the window
        driver.manage().window().maximize();
        //go to facebook.com
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
            Alert alert= driver.switchTo().alert();
            Thread.sleep(2000);
            alert.accept();
       //hey click on the prompt alert button
            driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();

       alert.sendKeys("abcdefg");
        alert.accept();


    }
}
