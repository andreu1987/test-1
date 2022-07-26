package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class main extends Basepage {
    String site_URL= "https://testingcup.pgs-soft.com/";
    public main(WebDriver driver) {
        super(driver);
    }
    public void goTo(){
        driver.get(site_URL);
    }
    public void chooseTask(strihg tasKNumber) {
        click(By.xpath(""));
    }
}
