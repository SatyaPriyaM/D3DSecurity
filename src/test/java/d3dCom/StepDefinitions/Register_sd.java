package d3dCom.StepDefinitions;

import cucumber.api.PendingException;
import d3dCom.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class Register_sd extends BasePage {

    // @Given("^I go to Url \"([^\"]*)\"$")
    //public void iGoToUrl(String URL) throws Throwable {
    // Open a Browser
    //OpenBrowser();
    //driver.manage().window().maximize();
    //I need to go to URL "https://www.d3dsecurity.co.uk"
    //  driver.get(URL);


    @Given("^I go to Url \"([^\"]*)\"$")
    public void iGoToUrl(String URL) throws Throwable {
        driver.get(URL);
    }

    @When("^I click Register button$")
    public void iClickRegisterButton() throws Throwable {
        //I need to click on Register button on Home Screen
        driver.findElement(By.linkText("Register")).click();

    }


    @Given("^I entered Email as \"([^\"]*)\"$")
    public void iEnteredEmailAs(String Email) throws Throwable {
        // I need to enter Email
        driver.findElement(By.name("email"));
        // I need to enter Email
        driver.findElement(By.name("email")).sendKeys(Email);

    }

    @And("^I entered New password as \"([^\"]*)\"$")
    public void iEnteredNewPasswordAs(String New_password) throws Throwable {
// I need to set up a New Password
        driver.findElement(By.name("pass1"));
        // I need to enter New Password
        driver.findElement(By.name("pass1")).sendKeys(New_password);

    }

    @And("^I entered Confirm password as \"([^\"]*)\"$")
    public void iEnteredConfirmPasswordAs(String Confirm_password) throws Throwable {
// I need to confirm my Password
        driver.findElement(By.name("pass2"));
        // I need to enter and Confirm My New Password
        driver.findElement(By.name("pass2")).sendKeys(Confirm_password);

    }

    @When("^I click on Register button$")
    public void iClickOnRegisterButton() throws Throwable {
        // I click on Register Button
        driver.findElement(By.name("submit")).click();
        Thread.sleep(4900);

    }

    @Then("^I should see Home page with My Account tab$")
    public void iShouldSeeHomePageWithMyAccountTab() throws Throwable {
//I should see MyAccount Button on Homepage
        boolean a = driver.findElement(By.linkText("My Account")).isDisplayed();
        assertTrue(a);
        String s1 = driver.findElement(By.linkText("My Account")).getText();
        String s2 = "My Account";
        assertEquals(s2, s1);

    }

    @And("^I should see Logout tab next to My Account tab$")
    public void iShouldSeeLogoutTabNextToMyAccountTab() throws Throwable {
// I should see Logout Button next to MyAccount
        boolean b = driver.findElement(By.xpath(".//*[@id='menu-item-4531']/a")).isDisplayed();
        assertTrue(b);
        String s3 = driver.findElement(By.xpath(".//*[@id='menu-item-4531']/a")).getText();
        String s4 = "Log Out";
        assertEquals(s4,s3);

    }


    @When("^I click on Register button on home page$")
    public void iClickOnRegisterButtonOnHomePage() throws Throwable {

        driver.findElement(By.linkText("Register")).click();


    }
}

