package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        //        click on the stsrt button
        driver.findElement(By.xpath("//button[@id='startButton']")).click();
//         as the element that contains text becomes visible after some
//        time, so first we need to implemetn the Explicit wait and then get the text

       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));

//        once the element is visivle then get the text

        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String WelcomeText = text.getText();
        System.out.println(WelcomeText);


    }
}
