package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

    // connect to WebDriver

        System.setProperty("webdriver.chrome.driver","driver/chromedriver");

    //initiate the instance of webdriver

       WebDriver driver= new ChromeDriver();

    // open google.com
        driver.get("https://www.google.com/");

    //slow down
        Thread.sleep( 2000);

    // go back
        driver.navigate().back();

    //slow down
        Thread.sleep(2000);

    //now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");

    //slow down
        Thread.sleep(2000);

    // go back
        driver.navigate().back();

    //slow down
        Thread.sleep(2000);

    //go to Face
        driver.navigate().forward();

    // refresh the page
    driver.navigate().refresh();
    }

}
