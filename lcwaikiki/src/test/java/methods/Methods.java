package methods;
import driver.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
public class Methods {
    WebDriver webDriver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsDriver;
public Methods(){
    webDriver= BaseTest.driver;
    wait =new FluentWait<>(webDriver);
    jsDriver =(JavascriptExecutor) webDriver;
    wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(300)).ignoring(NoSuchElementException.class);
}
public WebElement findElement(By element){
    return wait.until(ExpectedConditions.presenceOfElementLocated(element));
}
public void waitBySeconds(long seconds){
    try{
        Thread.sleep(seconds*1000);
    }
    catch (Exception e){
    e.printStackTrace();
    }
}

public String getAttribute(By by, String attributeName){
        return findElement(by).getAttribute(attributeName);
    }
    public String getText(By by){
        return findElement(by).getText();
    }
public void scrolWithJavaScript(By by){
jsDriver.executeScript("arguments[0].scrollIntoView();",findElement(by));
}
}


