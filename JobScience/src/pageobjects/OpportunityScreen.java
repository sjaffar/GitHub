package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="OpportunityScreen"                                
     , summary=""
     , relativeUrl=""
     , connection="JobScience"
     )             
public class OpportunityScreen {

	@ChoiceListType(values = { @ChoiceListValue(value = "Ambassador Visit"), @ChoiceListValue(value = "Standard"),
			@ChoiceListValue(value = "Standard Event") })
	@FindByLabel(label = "Record Type of new record")
	public WebElement recordTypeOfNewRecord;
	@ButtonType()
	@FindByLabel(label = "Continue")
	public WebElement continue_;
	@LinkType()
	@FindBy(xpath = "//tr[4]/td[2]/div/span/span/span/a")
	public WebElement Time;
	/*@TextType()
	@FindBy(xpath = "//div[@class=\"pbBody\"][contains(@id,\"RelatedHistoryList_body\")]/table/tbody//td[3]")
	public WebElement TASK_DUE_DATE1;*/
	
	@PageTable(row = TASK.class)
	@FindBy(xpath = "//div[@class=\"pbBody\"][contains(@id,\"RelatedHistoryList_body\")]/table/tbody/tr")
	public List<TASK> ActivityHistoryTable;
        
		@PageRow()
		public static class TASK{
		
		@TextType()
		@FindBy(xpath = "td[3]")
		public WebElement TASK_DUE_DATE;
	}

		@BooleanType()
		@FindBy(id = "reminder_select_check")
		public WebElement reminder;
			
}
