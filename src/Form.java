import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Form {
	
	WebDriver driver = new ChromeDriver();
	String MyWebSite = "https://codenboxautomationlab.com/practice/";
	@BeforeTest
	public void Mysetup() {
		
	driver.get(MyWebSite);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	Random rand= new Random() ;
	
	}
		
//public void RadioButton() {
//	
//WebElement DivRadio = driver.findElement(By.id("radio-btn-example"));
//
//List<WebElement>AllRaduoButtons=(List<WebElement>) DivRadio.findElement(By.name("radioButton"));
//
//Random Rand= new Random() ;
// 
//int RandomInput=Rand.nextInt();
//
//
//
//}
//
//
//
	@Test(enabled = false)
public void DynamicDropDownExample() {
	Random rand= new Random() ;
	
	String[] countries = {"united","jo"};
	
	int randomcountry = rand.nextInt(countries.length);
	driver.findElement(By.id("autocomplete")).sendKeys(countries[randomcountry]);;
	
	driver.findElement(By.id("autocomplete")).sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER));
	
	
	
	
	
}
@Test(enabled = false)
public void SelectInput() {
	
	
	WebElement myselectinput = driver.findElement(By.id("dropdown-class-example"));
Random rand= new Random();

WebElement  totaloptaion = myselectinput.findElement( By.tagName("option"));

Select myselector = new Select(myselectinput);
int randomIndex = rand.nextInt();

myselector.selectByIndex(randomIndex);
	
	

	
}

@Test(enabled = false)
public void checkBox() {
	
	
WebElement CheckBoxDiv = 	driver.findElement(By.id("checkbox-example"));
	
List<WebElement> AllOptions = CheckBoxDiv.findElements(By.tagName("input"));


for(int i=0;i<AllOptions.size();i++) {
	
	
	AllOptions.get(i).click();
	
}


}




@Test(enabled = false)
public void SwitchWindow() {
	
	driver.findElement(By.id("openwindow")).click();	
	Set<String> handles = driver.getWindowHandles();
	
	List<String> alltabs = new ArrayList<>(handles);
	driver.switchTo().window(alltabs.get(1));
	driver.findElement(By.xpath("//*[@id=\"menu-item-9947\"]/a/span[1]")).click();
	
	driver.switchTo().window(alltabs.get(0));
	
	
}
@Test(enabled = false)
public void SwitchTab() {
	
	driver.findElement(By.id("opentab")).click();		
	
	
	
	
	
}


@Test(enabled = false)
public void WebTableExample(){
	
WebElement TheTable= driver.findElement(By.id("product"));


List<WebElement> AllRowsInsideTheTable =  TheTable.findElements(By.tagName("tr"));

for(int i = 1 ; i<AllRowsInsideTheTable.size();i++) {
	
	
	AllRowsInsideTheTable.get(i).getText();
	
	System.out.println(AllRowsInsideTheTable.get(i).getText());
	
}

}


@Test(enabled = false)
public void Displayed() {
	
	 driver.findElement(By.id("hide-textbox")).click();
	 
	 WebElement  TheBox = driver.findElement(By.id("displayed-text"));
	 boolean ExpectedValue = false ;
	 
	Assert.assertEquals(TheBox.isDisplayed(), ExpectedValue);
	
	 driver.findElement(By.id("show-textbox")).click();
	 boolean ExpectedValue2 = true ;
	 Assert.assertEquals(TheBox.isDisplayed(), ExpectedValue2);

}


@Test(enabled = false)
public void  mouseHover () throws InterruptedException {
	
	JavascriptExecutor js = (JavascriptExecutor)driver ;
	js.executeScript("window.scrollTo(0,2000)");
	
    Thread.sleep(3000);

	 WebElement hoverBox =   driver.findElement(By.id("mousehover"));
	
	 Actions myaction = new Actions(driver);
	 
	 myaction.moveToElement(hoverBox).build().perform();
	
	driver.findElement(By.linkText("Top")).click();
	
}

@Test(enabled = false)
public void celender() {
	
	
	driver.findElement(By.linkText("Booking Calendar")).click();
	Set<String> handles = driver.getWindowHandles();
	List<String>  allTabs= new ArrayList<>(handles);
	driver.switchTo().window(allTabs.get(1));
	
	
	
	
	
}






@AfterTest 
public void AfterMyTest() {
	
	
	
	
	
	
	
	
	
	
	
}










}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
