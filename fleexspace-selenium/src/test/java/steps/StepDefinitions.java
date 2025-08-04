package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class StepDefinitions {
    WebDriver driver;

    @Given("I open Google")
    public void i_open_google() {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.fleexspace.cn");
    }

    @When("I search for {string}")
    public void i_search_for(String query) {
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys(query);
        input.submit();
    }

    @Then("the title should contain {string}")
    public void the_title_should_contain(String expected) {
        assertTrue(driver.getTitle().contains(expected));
        driver.quit();
    }
}
