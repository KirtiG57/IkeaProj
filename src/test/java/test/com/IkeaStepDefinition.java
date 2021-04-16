/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author verma
 */
public class IkeaStepDefinition {

    private static WebDriver driver;  // adding web driver
    private String baseUrl = "https://www.ikea.com/us/en/";
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("^user is already on Login home Page$")
    public void user_is_already_on_Login_home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @Then("^user clicks on Sign in$")
    public void user_clicks_on_Sign_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//li[4]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"loyalty-modal-content\"]/div/div/div[3]/ul/li[1]/a")).click();
    }

    @Then("^user enters username$")
    public void user_enters_username() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("akmselenium@gmail.com");

    }

    @Then("^user enters password$")
    public void user_enters_password() throws Throwable {
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("ITExps123");
    }

    @Then("^user clicks continue$")
    public void user_clicks_continue() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/form/button[1]")).click();
    }

    @Then("^user closes brower for Login$")
    public void user_closes_brower_for_Login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }

    @Given("^user is already on Product home Page$")
    public void user_is_already_on_Product_home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @Then("^user click on product$")
    public void user_click_on_product() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.linkText("Products")).click();
    }

    @Then("^click on lightening$")
    public void click_on_lightening() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.linkText("Lighting")).click();
    }

    @Then("^user click on Led Light Bulbs$")
    public void user_click_on_Led_Light_Bulbs() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.linkText("LED Light bulbs")).click();
    }

    @Then("^user click on Add to bag$")
    public void user_click_on_Add_to_bag() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//img[@alt='RYET LED bulb E26 470 lumen, globe clear']")).click();
        driver.findElement(By.className("range-revamp-btn__label")).click();
    }

    @Then("^user click on Continue to bag$")
    public void user_click_on_Continue_to_bag() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.linkText("Continue to bag")).click();
    }

    @Then("^user click to Checkout$")
    public void user_click_to_Checkout() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("div.shoppingbag__sidebar > div.checkout__wrapper > button.cart-ingka-jumbo-btn.cart-ingka-jumbo-btn--emphasised.checkoutButton__default > span.cart-ingka-jumbo-btn__inner > span.cart-ingka-jumbo-btn__icon > svg.cart-ingka-svg-icon")).click();
        driver.findElement(By.xpath("//main[@id='one-checkout']/div[2]/div/div/div/div[2]/div/button/span")).click();
    }

    @Then("^user closes brower for Product$")
    public void user_closes_brower_for_Product() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }

    @Given("^user is already on Room home Page$")
    public void user_is_already_on_Room_home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @Then("^user click on Room$")
    public void user_click_on_Room() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.linkText("Rooms")).click();
    }

    @Then("^user click on images$")
    public void user_click_on_images() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//img[@alt='Living room']")).click();
        driver.findElement(By.xpath("//img[@alt='Armchairs & chaises']")).click();
        driver.findElement(By.xpath("//img[@alt='Lounge chairs']")).click();
        driver.findElement(By.xpath("//button[3]/span")).click();
    }

    @Then("^user select color$")
    public void user_select_color() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("gray")).click();
        driver.findElement(By.xpath("//div[4]/div/div/button/span")).click();
        driver.findElement(By.xpath("//button[4]")).click();
    }

    @Then("^Then select price range$")
    public void then_select_price_range() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//div[@id='SEC_filter-PRICE']/label[2]/div/span")).click();
        driver.findElement(By.xpath("//div[4]/div/div/button/span")).click();
        js.executeScript("window.scrollBy(0,2000)");
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[3]/div/div/div[4]/div/div[2]/div[2]/div/a/div/span[2]/img")).click();
        js.executeScript("window.scrollBy(0,2000)");
        driver.findElement(By.className("range-revamp-btn__inner")).click();
         js.executeScript("window.scrollBy(0,1500)");
    }

    @Then("^user click on Continue to bag for Room$")
    public void user_click_on_Continue_to_bag_for_Room() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.linkText("Continue to bag")).click();
        js.executeScript("window.scrollBy(0,200)");
    }

    @Then("^user click to Checkout for Room$")
    public void user_click_to_Checkout_for_Room() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("div.shoppingbag__sidebar > div.checkout__wrapper > button.cart-ingka-jumbo-btn.cart-ingka-jumbo-btn--emphasised.checkoutButton__default > span.cart-ingka-jumbo-btn__inner > span.cart-ingka-jumbo-btn__icon > svg.cart-ingka-svg-icon")).click();
        driver.findElement(By.xpath("//main[@id='one-checkout']/div[2]/div/div/div/div[2]/div/button/span")).click();
    }

    @Then("^user closes brower for Room$")
    public void user_closes_brower_for_Room() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }

}
