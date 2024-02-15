package Task17;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class snapdeals {
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();

    
        driver.get("https://demoblaze.com/index.html#");

        
        driver.manage().window().maximize();

     
        WebElement laptopsLink = driver.findElement(By.xpath("//a[contains(text(),'Laptops')]"));
        laptopsLink.click();

        
        WebElement firstLaptop = driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]"));
        firstLaptop.click();

       
        WebElement addToCartButton = driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]"));
        addToCartButton.click();


        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        
    }
}
