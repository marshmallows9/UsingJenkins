package SearchAutomate;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class googleSearch {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/manas/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        WebElement SearchBox = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
        SearchBox.sendKeys("Melania Trump");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
    }


}
