package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="PriceBook"                                
     , summary=""
     , relativeUrl=""
     , connection="JobScience"
     )             
public class PriceBook1 {

	@PageRow()
	public static class PricebookTable {
	@LinkType()
	@FindBy(xpath = "th/a")
	public WebElement productName;
	
	@LinkType()
	@FindBy(xpath = "td[3]")
	public WebElement listPrice;
	}

	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//table[contains(@class, \"list\")]")
	@PageTable(firstRowContainsHeaders = true, row = PricebookTable.class)
	public List<PricebookTable> pricebookTable;
			
}
