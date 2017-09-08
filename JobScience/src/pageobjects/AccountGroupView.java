package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="AccountGroupView"                                
     , summary=""
     , relativeUrl=""
     , connection="IonHoy"
     )             
public class AccountGroupView {

	@PageFrame()
	public static class Frame {

		@ButtonType()
		@FindBy(name = "new_group_opportunity")
		public WebElement newGroupOpportunity;
	}

	@FindBy(css = "#RLPanelFrame")
	public Frame frame;
	
	@LinkType()
	@FindBy(xpath = "//span[@class='listTitle'][contains(text(),'Opportunities')]")
	public WebElement FeedOpp;

	@TextType()
	@FindBy(id = "phSearchInput")
	public WebElement SearchText;

	@PageRow()
	public static class AccountSearch {

		@LinkType()
		@FindBy(xpath = "th/a")
		public WebElement accountName;
		@LinkType()
		@FindBy(xpath = ".//td[6]")
		public WebElement addressCountry;
		
	
	}

	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//*[@id=\"Account_body\"]//table")
	@PageTable(firstRowContainsHeaders = true, row = AccountSearch.class)
	public List<AccountSearch> AccountSearch;
	
			
}
