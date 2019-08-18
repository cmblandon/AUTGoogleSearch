package co.com.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {
    @FindBy(name = "q")
    private WebElement googleSearch;

    @FindBy(name = "btnK")
    private WebElement googleSearchButton;

    @FindBy(id = "fprsl")
    private WebElement resultSearch;

    @FindBy(xpath = "//*[@class='g']/div")
    private WebElement counterRes;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void googleSearch() {
        waitForElementToBeClickable(By.name("q"));
        this.googleSearch.click();
    }

    public void inputWord(String word) {
        this.googleSearch.sendKeys(word);
    }

    public void clickOnButton() {
        this.googleSearchButton.click();
    }

    public void resultSearch() {
        if (this.resultSearch.isDisplayed()) {
            String textResult = getTextWord();
            Assert.assertTrue(textResult.contains("pruebas"));
            this.resultSearch.click();
        } else {
            System.out.println("No match any element " + resultSearch);
        }
    }

    public void listResultSearch() {
        List<WebElement> counterWords = driver.findElements(By.xpath("//*[@class='g']/div"));
        //System.out.println(counterWords.size());
        for (int i = 0; i < counterWords.size(); i++) {
            //System.out.println(counterWords.get(i).getText());
            if (counterWords.size() < 3) {
                Assert.assertTrue(true);
                break;
            }

        }
    }

    public String getTextWord() {
        return resultSearch.getText();
    }
}
