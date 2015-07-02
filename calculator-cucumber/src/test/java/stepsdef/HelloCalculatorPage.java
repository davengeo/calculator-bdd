package stepsdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelloCalculatorPage {

    @FindBy(name="first_number")
    private WebElement firstNumber;

    public WebElement getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(WebElement firstNumber) {
        this.firstNumber = firstNumber;
    }
}
