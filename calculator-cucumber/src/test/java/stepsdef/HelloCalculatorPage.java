package stepsdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelloCalculatorPage {

	@FindBy(className = "first_number")
    private WebElement firsNumberLabel;

    @FindBy(name="first_number")
    private WebElement firstNumber;

    @FindBy(name="second_number")
    private WebElement secondNumber;

    public WebElement getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(WebElement firstNumber) {
        this.firstNumber = firstNumber;
    }

    public WebElement getFirsNumberLabel() {
        return firsNumberLabel;
    }

    public void setFirsNumberLabel(WebElement firsNumberLabel) {
        this.firsNumberLabel = firsNumberLabel;
    }

    public WebElement getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(WebElement secondNumber) {
        this.secondNumber = secondNumber;
    }
}
