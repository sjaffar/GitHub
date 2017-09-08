package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="Quote"                                
     , summary=""
     , relativeUrl=""
     , connection="JobScience"
     )             
public class Quote1 {

	@TextType()
	@FindBy(css = "#sbPageContainer/deep/SB-LINE-EDITOR.--desktop/deep/#lineEditorPageHeader.--desktop/deep/SB-CUSTOM-ACTION.--desktop/deep/#mainButton.notLast")
	public WebElement AddSubscription;
	@PageRow()
	
	
	public static class ProductSelection {
	
	}
	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//*[@id=\"bodyTable\"]")
	@PageTable(firstRowContainsHeaders = true, row = ProductSelection.class)
	public List<ProductSelection> ProductSelection;
	
	@TextType()
	@FindBy(css = "#sbPageContainer/deep/SB-PRODUCT-LOOKUP.--desktop/deep/SB-PAGE-HEADER.--desktop/deep/#plSelect.keyboard-focus/deep/SB-I18N")
	public WebElement Select;
	/*@TextType()
	@FindBy(linkText = "Go to list »")
	public WebElement PricebookEntries;
	
	/* Table format identification
	@PageRow()
	public static class CovertedLead {

		@LinkType()
		@FindBy(xpath = "td/a")
		public WebElement LinkLead;
		
				@TextType()
		@FindBy(xpath = "td")
		public WebElement LabelLead;
	
	}
	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//table[contains(@class, \"detailList\")]")
	@PageTable(firstRowContainsHeaders = true, row = CovertedLead.class)
	public List<CovertedLead> CovertedLead; */
	@TextType()
	@FindBy(xpath = "//*[@id=\"lookup01s6E0000000CeqPricebook2\"]")
	public WebElement Pricebook2Id;

	@TextType()
	@FindBy(css = "#sbPageContainer/deep/SB-PRODUCT-CONFIG.--desktop/deep/SB-PAGE-HEADER.--desktop/deep/#pcSave.keyboard-focus/deep/SB-I18N")
	public WebElement Save;

	@TextType()
	@FindBy(css = "#sbPageContainer/deep/SB-LINE-EDITOR.--desktop/deep/#lineEditorPageHeader.--desktop/deep/SB-CUSTOM-ACTION.--desktop/deep/paper-button")
	public WebElement save2;

	@TextType()
	@FindBy(css = "#sbPageContainer.--desktop/deep/SB-LINE-EDITOR.--desktop/deep/#groupLayout.--desktop/deep/#Group_2.group/deep/SB-CUSTOM-ACTION.--desktop/deep/#mainButton.groupButton")
	public WebElement AddProducts;
			
}
