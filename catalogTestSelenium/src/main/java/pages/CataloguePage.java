package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CataloguePage {

    private final WebDriver driver;

    @FindAll({@FindBy(xpath = "//div[text()='Price Offer for Bund...']/ancestor::div//a[@data-testid='qa-product-name']")})
    private List<WebElement> productsOfferList;

    public CataloguePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public List<WebElement> returnProductOfferList(){
        return productsOfferList;
    }

    public void printNumberAndObject(){
        int iterator=1;
        for (WebElement element:productsOfferList) {
            System.out.println("item #: "
                    +iterator+" name: "+ element.getText());
            iterator++;
        }
    }
}
