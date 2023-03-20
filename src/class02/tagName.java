package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {

    //tell your project where the WebDriver is located.
    // for Mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");


    // create a WebDriver instance
        WebDriver driver=new ChromeDriver();

    // maximize
        driver.manage().window().maximize();

    // go to amazon,com
        driver.get("https://www.amazon.com/");

    // print all the links in the amazon.com
        driver.findElements(By.tagName("a"));

    }
}
