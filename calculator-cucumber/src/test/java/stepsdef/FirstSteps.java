package stepsdef;


import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.fest.assertions.api.Assertions.assertThat;

public class FirstSteps {

    private WebDriver driver;
//    private HelloCalculatorPage helloCalculatorPage = null;
//
//    public HelloCalculatorPage getHelloCalculatorPage() {
//        if (helloCalculatorPage==null) {
//            this.helloCalculatorPage = PageFactory.initElements(driver, HelloCalculatorPage.class);
//        }
//        return this.helloCalculatorPage;
//    }

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @After
    public void close() throws InterruptedException {
        driver.quit();
    }


    @Given("^I open a browser and a go to the \"(.*?)\"$")
    public void i_open_a_browser_and_a_go_to_the(String website) throws Throwable {
        driver.get(website);
    }

    @When("^I see the web page with title \"(.*?)\"$")
    public void i_see_the_webpage_with_title(String expectedTitle) throws Throwable {
        assertThat(driver.getTitle()).contains(expectedTitle);
    }


    @Then("^I can read \"(.*?)\" with an empty box named \"(.*?)\"$")
    public void i_can_read_with_an_empty_box_named(String label, String inputName) throws Throwable {
        assertThat(driver.findElement(By.className(inputName)).getText().toLowerCase()).contains(label);
        assertThat(driver.findElement(By.name(inputName)).getAttribute("value")).isEmpty();
    }

    @Then("^I can read \"(.*?)\" followed by a number \"(.*?)\"$")
    public void i_can_read_followed_by_a_number(String label, String result) throws Throwable {
        assertThat(driver.findElement(By.className("result_label")).getText().toLowerCase()).contains(label);
        assertThat(driver.findElement(By.className("result_value")).getText().toLowerCase()).isEqualTo(result);
    }

}
