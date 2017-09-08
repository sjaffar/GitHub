package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Sbqq__ Generate Document"                                
               , summary=""
               , page="GenerateDocument"
               , namespacePrefix="SBQQ"
               , object="SBQQ__Quote__c"
               , connection="JobScience"
     )             
public class sbqq__GenerateDocument {

	@ButtonType()
	@FindByLabel(label = "Send with DocuSign")
	public WebElement sendWithDocuSign;
	
}
