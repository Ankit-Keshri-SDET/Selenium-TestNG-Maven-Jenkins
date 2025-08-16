package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChooseFlightTest {

    @Test
    public void chooseFlight() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://blazedemo.com/");
        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(), "BlazeDemo", "Title Mismatch ..");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//tr/form[@name='VA12']//following-sibling::td//input")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Your flight from TLV to SFO has been reserved.");
        Thread.sleep(1000);

        driver.quit();

    }
}
