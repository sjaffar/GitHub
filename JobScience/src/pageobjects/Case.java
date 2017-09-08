package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Case"                                
     , summary=""
     , relativeUrl=""
     , connection="JobScience"
     )             
public class Case {

	@TextType()
	@FindBy(xpath = "//input[@name=\"p2\"]")
	public WebElement ToEmail;
	@TextType()
	@FindBy(id = "p6")
	public WebElement subject;
	@ButtonType()
	@FindBy(css = "#topButtonRow input[type='button'][name='send']")
	public WebElement send;
	@TextType()
	@FindBy(xpath = "//*[@id=\"p2_lkwgt\"]")
	public WebElement to;
	@LinkType()
	@FindBy(linkText = "\n                \n                    \n                    \n                \n                Details\n                \n            ")
	public WebElement details;
	@TextType()
	@FindBy(id = "phSearchInput")
	public WebElement searchSalesforce;		
}
