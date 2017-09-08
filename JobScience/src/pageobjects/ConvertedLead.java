package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="ConvertedLead"                                
     , summary=""
     , relativeUrl=""
     , connection="JessicaMarshall"
     )             
public class ConvertedLead {

	@TextType()
	@FindByLabel(label = "Contact: ", labelType = LabelType.RelativeTo, labelXpath = "//tr[3]//td")
	public WebElement Contact;
	@BooleanType()
	@FindBy(id = "reminder_select_check")
	public WebElement Reminder;
	@LinkType()
	@FindBy(xpath = "//tbody/tr[3]/td/a")
	public WebElement Contact1;
	@LinkType()
	@FindBy(xpath = "//tbody/tr[4]/td/a")
	public WebElement AccountName;
	@LinkType()
	@FindBy(xpath = "//tr[contains(@class, \"last\")]/td/a")
	public WebElement OppName;
	
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

	
			
}
