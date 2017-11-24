package d3dCom.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import d3dCom.BasePage;
import d3dCom.Pages.SignIn_Page;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Signin_sd {
    public SignIn_Page SPage = PageFactory.initElements(BasePage.driver, SignIn_Page.class);
    public WebDriver driver;

    @Given("^I entered URL \"([^\"]*)\"$")
    public void iEnteredURL(String URL) throws Throwable {

        //Open a Browser

       // ChromeDriverManager.getInstance().setup();
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//I need to go to URL "https://www.d3dsecurity.co.uk"
      //  driver.get(URL);
        SPage.EnterURL(URL);
    }

    @When("^I click on Login button on the Home Screen$")

    public void iClickOnLoginButtonOnTheHomeScreen() throws Throwable {
        SPage.click_Login();

        //I need to click on Login button on Home Screen
      //  driver.findElement(By.xpath(".//*[@id='menu-item-4532']/a")).click();


    }

    @Given("^I entered Username/Email as \"([^\"]*)\"$")
    public void iEnteredUsernameEmailAs(String UserName) throws Throwable {
        //I need to enter Username/Email
       // driver.findElement(By.name("log"));
        //I need to enter my Username
       // driver.findElement(By.name("log")).sendKeys(UserName);
        SPage.EnterUserName(UserName);

    }

    @And("^I entered Password as \"([^\"]*)\"$")
    public void iEnteredPasswordAs(String Password) throws Throwable {
//I need to enter my password
       // driver.findElement(By.name("pwd"));
        //I need to enter my password
     //   driver.findElement(By.name("pwd")).sendKeys("winter");
SPage.EnterPassword(Password);
    }

    @When("^I click on Login button$")
    public void iClickOnLoginButton() throws Throwable {
//I need to  click on Login Button
      //  driver.findElement(By.name("submit")).click();
      //  Thread.sleep(4900);
SPage.IClickLogin();
    }

    @Then("^I should see MyAccount button on the Home Page$")
    public void iShouldSeeMyAccountButtonOnTheHomePage() throws Throwable {
//I should see MyAccount Button on Homepage
      //  boolean c = driver.findElement(By.linkText("My Account")).isDisplayed();

    SPage.SeeMyAccountButton();
        //assertTrue(c);
    }

    @And("^I should see Logout button on the Home Page$")
    public void iShouldSeeLogoutButtonOnTheHomePage() throws Throwable {
//I should see Logout Button on Homepage
//driver.findElement(By.xpath(".//*[@id='menu-item-4531']/a")).getText();
//driver.close();
     SPage.SeeLogoutButton();
    }

    @Then("^I should see Page Title \"([^\"]*)\"$")
    public void iShouldSeePageTitle(String PageTitle) throws Throwable {
//I should see Page Title as Login
 // String b = driver.findElement(By.xpath(".//*[@id='post-4521']/h1")).getText();

//  assertEquals(PageTitle,b);
 SPage.SeePageTitle(PageTitle);
    }

    @And("^I should see error message \"([^\"]*)\"$")
    public void iShouldSeeErrorMessage(String ErrorMessage) throws Throwable {
// I should see Error Message "Wrong Credentials"
//String a = driver.findElement(By.xpath(".//*[@id='post-4521']/div/div[1]/p")).getText();
     //assertEquals(ErrorMessage,a);
  //driver.close();
        SPage.SeeErrorMessage(ErrorMessage);
    }
}
