package stepsdef;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.fest.assertions.api.Assertions.assertThat;

public class FirstSteps {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @After
    public void close() throws InterruptedException {
        Thread.sleep(500);
        driver.quit();
    }


    @Given("^I open a browser and a go to the \"(.*?)\"$")
    public void i_open_a_browser_and_a_go_to_the(String website) throws Throwable {
        driver.get(website);
    }

    @When("^I see the webpage$")
    public void i_see_the_webpage() throws Throwable {
        assertThat(driver.getTitle()).contains("hello");
    }

    @Then("^I can read \"(.*?)\"$")
    public void i_can_read(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        HelloCalculatorPage page = PageFactory.
                initElements(driver, HelloCalculatorPage.class);
        assertThat(page.getFirstNumber().getAttribute("value")).isEqualTo("1");
    }

}
