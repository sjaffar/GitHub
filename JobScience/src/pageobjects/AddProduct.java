package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="AddProduct"                                
     , summary=""
     , relativeUrl=""
     , connection="JobScience"
     )             
public class AddProduct {

	@ChoiceListType(values = { @ChoiceListValue(value = "Recruitment Subs 2015"),
			@ChoiceListValue(value = "TES Display"), @ChoiceListValue(value = "THE Advertising AUS"),
			@ChoiceListValue(value = "THE Advertising UK"),
			@ChoiceListValue(value = "THE Branding & Data UK Price Book"),
			@ChoiceListValue(value = "THE WUR Branding & Data US Price Book") })
	@FindBy(xpath = "//*[@id=\"p1\"]")
	public WebElement priceBook;
	@ButtonType()
	@FindBy(xpath = "//input[@name=\"save\"]")
	public WebElement save;
	/*@LinkType()
	@FindBy(xpath = "//div/li[6]/div//a")
	public WebElement activities;*/
	@PageRow()
	public static class ProductAdd {
	@TextType()
	@FindBy(xpath = "td/input")
	public WebElement Quantity;
	
	@TextType()
	@FindBy(xpath = "th")
	public WebElement product;
	}
	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//table[contains(@class, \"genericTable\")]")
	@PageTable(firstRowContainsHeaders = true, row = ProductAdd.class)
	public List<ProductAdd> ProductAdd;
			@LinkType()
	@FindBy(linkText = "Contracts[1]")
	public WebElement contracts1;
}
