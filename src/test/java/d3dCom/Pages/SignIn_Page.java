package d3dCom.Pages;

import d3dCom.BasePage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static d3dCom.BasePage.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SignIn_Page extends BasePage {
    public void click_Login(){
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath(".//*[@id='menu-item-4532']/a")).click();
    }
public void EnterUserName(String UserName){
        driver.findElement(By.name("log")).sendKeys(UserName);
    }
    public void EnterPassword(String Password){
        driver.findElement(By.name("pwd")).sendKeys(Password);
    }
  public void IClickLogin() throws InterruptedException {
      driver.findElement(By.name("submit")).click();
      Thread.sleep(4900);
  }
  public void SeeMyAccountButton(){
      boolean c = driver.findElement(By.linkText("My Account")).isDisplayed();
      assertTrue(c);
  }
  public void SeeLogoutButton(){
      driver.findElement(By.xpath(".//*[@id='menu-item-4531']/a")).getText();
  }
  public void SeePageTitle(String PageTitle){
      String b = driver.findElement(By.xpath(".//*[@id='post-4521']/h1")).getText();
      assertEquals(PageTitle,b);
  }
  public void SeeErrorMessage(String ErrorMessage){
      String a = driver.findElement(By.xpath(".//*[@id='post-4521']/div/div[1]/p")).getText();
      assertEquals(ErrorMessage,a);
  }
  public void EnterURL(String URL){
      ChromeDriverManager.getInstance().setup();
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(URL);
  }

}
