package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

public class AmazonPages {

        static WebDriver driver;
        static ElementHelper elementHelper;
   //WebDriver wait;
        static By accept= By.id("sp-cc-accept");
        static By search = By.id("twotabsearchtextbox");
        static By searchButton = By.id("nav-search-submit-button");
        static By amazonFilter=By.xpath("//span[@class='a-size-base a-color-base'][contains(text(),'Amazon Tarafından Gönderilir')]");
        static By appleFilter=By.cssSelector("body > div:nth-child(1) > div:nth-child(28) > div:nth-child(11) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > ul:nth-child(2) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > span:nth-child(2)");
        static By firstProduct=By.cssSelector("img[alt='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu']");
        static By addCart=By.xpath("//input[@id='add-to-cart-button']");
        static By back = By.id("attach-close_sideSheet-link");
        static By cart = By.cssSelector("#nav-cart-count");
        static By check = By.cssSelector(".a-truncate-cut");





        public AmazonPages(WebDriver driver){
            this.driver=driver;

            this.elementHelper=new ElementHelper(driver);

        }



    public static void homePages() {
    }

    public static void acceptCookie() {
            elementHelper.click(accept);

    }

    public static void clickSearch() {
            elementHelper.click(search);

    }

    public static void writeProduct() {
            elementHelper.findElement(search).sendKeys("airpods");
    }

    public static void theSearchButton() {
            elementHelper.click(searchButton);
    }

    public static void filterAmazon() {
            elementHelper.click(amazonFilter);

    }

    public static void filterApple() {
            elementHelper.click(appleFilter);

    }

    public static void firstProduct() {
            elementHelper.click(firstProduct);
    }

    public static void addCart() {
            elementHelper.click(addCart);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.click(back);
            elementHelper.click(cart);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    public static void checkCart() {

            elementHelper.checkVisible(check);

    }
}
