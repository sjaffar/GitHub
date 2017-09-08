package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Accounts"                                
     , summary=""
     , relativeUrl=""
     , connection="JobScience"
     )             
public class Accounts {

	@ChoiceListType(values = { @ChoiceListValue(value = "Early Years"), @ChoiceListValue(value = "Primary"),
			@ChoiceListValue(value = "Middle"), @ChoiceListValue(value = "Secondary"),
			@ChoiceListValue(value = "Secondary with sixth form"), @ChoiceListValue(value = "All-through"),
			@ChoiceListValue(value = "All-through with sixth form"), @ChoiceListValue(value = "Further Education"),
			@ChoiceListValue(value = "Higher Education"), @ChoiceListValue(value = "Further & Higher Education") })
	@FindByLabel(label = "Simple Phase")
	public WebElement Business_Phase__c;
	@ChoiceListType(values = { @ChoiceListValue(value = "State"), @ChoiceListValue(value = "Independent") })
	@FindByLabel(label = "Funding Group")
	public WebElement Funding_Group__c;
	@LinkType()
	@FindBy(linkText = "Search All")
	public WebElement searchAll;
			
}
