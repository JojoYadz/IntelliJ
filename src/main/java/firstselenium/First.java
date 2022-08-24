package firstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class First {
    WebDriver driver;
    ElementMapper em;
    public void adminLogin(){
      driver = new ChromeDriver();
      driver.get(em.homePage);
      driver.findElement(By.name(em.phoneNumber)).sendKeys("07048060185");
      driver.findElement(By.name(em.password)).sendKeys("Myday12031996@");
      driver.findElement(By.id(em.signinBtn)).click();
      String userName = driver.findElement(By.cssSelector("h3.mb-0.pointer")).getText();
      Assert.assertEquals(userName,"Agent Login");
      String accNumber = driver.findElement(By.cssSelector("p.mb-1")).getText();
      Assert.assertEquals(accNumber, "Account Number");
      driver.quit();
    }

    public static void main(String [] args){
        First first = new First();
        first.adminLogin();
    }
}