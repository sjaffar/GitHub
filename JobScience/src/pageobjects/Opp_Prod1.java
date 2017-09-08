package pageobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.*;

@Page( title="Opp_ Prod1"                                
     , summary=""
     , relativeUrl=""
     , connection="JobScience"
     )             
public class Opp_Prod1 {
			
		WebDriver driver;
		WebDriverWait wait;
		
		 @TestLogger
		 public Logger testLogger;
		 
		public Opp_Prod1(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 70);
	}
	
	public void selectProduct(String prodcutLabel) {
	
		Actions action = new Actions(driver);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> allProducts = driver.findElements(By.cssSelector("sb-page-container/deep/sb-product-lookup/deep/sb-drawer/deep/sb-lookup-layout/deep/sb-table-row"));
		
		for(WebElement ele : allProducts) {
		
			WebElement label1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", ele);
			WebElement label2 = label1.findElement(By.cssSelector("sb-swipe-container/deep/sb-group#row/deep/sb-table-cell.firstInnerTd/deep/sb-field/deep/sb-html/deep/span"));
			if(label2.getText().equals(prodcutLabel)) {
				WebElement check1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", ele);
				WebElement check2 = check1.findElement(By.cssSelector("sb-swipe-container/deep/paper-checkbox"));
				js.executeScript("arguments[0].scrollIntoView()", check2);
				check2.click();
				// action.moveToElement(check2).click(check2).build().perform();
			}
		}
	}		

	public List<String> extractAddons()
	{
		Actions action = new Actions(driver);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> AdonsTablerows = driver.findElements(By.cssSelector("sb-page-container/deep/sb-product-lookup/deep/sb-drawer/deep/sb-lookup-layout/deep/sb-table-row"));
		 
		List<String> AdonList = new ArrayList<String>();
		 
		for(WebElement row : AdonsTablerows) {
		
		WebElement label1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", row);
		List<WebElement> AdonsTablecol = driver.findElements(By.cssSelector("sb-swipe-container/deep/sb-group#row/deep/sb-table-cell.firstInnerTd/deep/sb-field/deep/sb-html/deep/span"));
		
		for(int col=0; col<AdonsTablecol.size(); col++)
		{
		
		String celtext = AdonsTablecol.get(col).getText();
		AdonList.add(celtext);
		}
				
	}
		return AdonList;
}

	public List<String> selectProduct2() {
	
		Actions action = new Actions(driver);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> allProducts = driver.findElements(By.cssSelector("sb-page-container/deep/sb-product-lookup/deep/sb-drawer/deep/sb-lookup-layout/deep/sb-table-row"));
		List<String> nameList = new ArrayList<String>();
		for(WebElement ele : allProducts) {
		
			WebElement label1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", ele);
			WebElement label2 = label1.findElement(By.cssSelector("sb-swipe-container/deep/sb-group#row/deep/sb-table-cell.firstInnerTd/deep/sb-field/deep/sb-html/deep/span"));
			
			String val = label2.getText();
			nameList.add(val);
			
			}
		return nameList;
		}
		
		
		public List<String> components() {
	
		Actions action = new Actions(driver);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> allProducts = driver.findElements(By.cssSelector("sb-page-container/deep/sb-product-config/deep/sb-product-bundles-layout/deep/sb-product-option-table/deep/sb-table-row"));
		List<String> componentList = new ArrayList<String>();
		for(WebElement ele : allProducts) {
		
			WebElement label1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", ele);
			WebElement label2 = label1.findElement(By.cssSelector("sb-swipe-container/deep/sb-group#row/deep/sb-option-cell.secondInnerTd/deep/sb-field/deep/sb-html/deep/span"));
			
			String val = label2.getText();
			componentList.add(val);
			
			}
		return componentList;
		}
		
		public List<String> Addons() {
	
		Actions action = new Actions(driver);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> allProducts = driver.findElements(By.cssSelector("sb-page-container/deep/sb-product-config/deep/sb-product-bundles-layout/deep/sb-product-feature-list/deep/sb-product-feature/deep/sb-product-option-table/deep/sb-table-row"));
		List<String> AdonList = new ArrayList<String>();
		for(WebElement ele : allProducts) {
		
			WebElement label1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", ele);
			WebElement label2 = label1.findElement(By.cssSelector("sb-swipe-container/deep/sb-group/deep/sb-option-cell.secondInnerTd/deep/sb-field/deep/sb-html/deep/span"));
			
			String val = label2.getText();
			AdonList.add(val);
			
			}
		return AdonList;
		}
		
		
		public List<String> UnAddons() {
	
		Actions action = new Actions(driver);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> allProducts = driver.findElements(By.cssSelector("sb-page-container/deep/sb-product-config/deep/sb-product-bundles-layout/deep/sb-product-option-table/deep/sb-table-row"));
		List<String> UnAdonList = new ArrayList<String>();
		for(WebElement ele : allProducts) {
		
			WebElement label1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", ele);
			WebElement label2 = label1.findElement(By.cssSelector("sb-swipe-container/deep/sb-group#row/deep/sb-option-cell.secondInnerTd/deep/sb-field/deep/sb-html/deep/span"));
			
			String val = label2.getText();
			UnAdonList.add(val);
			
			}
		return UnAdonList;
		}
		
		public boolean verifyText(String input) {
	
		boolean isRecordPresent = false;
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> allProducts = driver.findElements(By.cssSelector("sb-page-container/deep/sb-product-lookup/deep/sb-drawer/deep/sb-lookup-layout/deep/sb-table-row"));
		
		for(WebElement ele : allProducts) {
		
			WebElement label1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", ele);
			WebElement label2 = label1.findElement(By.cssSelector("sb-swipe-container/deep/sb-group#row/deep/sb-table-cell.firstInnerTd/deep/sb-field/deep/sb-html/deep/span"));
			
			String val = label2.getText();
			testLogger.info(val + "=========");
			testLogger.info(input + "+++++++++");
			//nameList.add(val);
			if(val.equals(input)){
			 // testLogger.info(val + "=========");
			 isRecordPresent=true;
			 break;
			}
		}
		return isRecordPresent;
	}
	
}
