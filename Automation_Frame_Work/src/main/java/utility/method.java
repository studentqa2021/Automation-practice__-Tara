package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class method {
	public static void addcolour(WebDriver driver ,WebElement element){
		JavascriptExecutor obj=(JavascriptExecutor)driver;
		obj.executeScript("arguments[0].setAttribute('style',arguments[1]);",element,"color:red;border:2px solid blue;");
	}
}
