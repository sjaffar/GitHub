package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="report"                                
     , summary=""
     , relativeUrl=""
     , connection="JobScience"
     )             
public class report {

@TextType()
	@FindBy(id = "quickFindInput")
	public WebElement quickFind;

	@PageRow()
	public static class SelectRecordType {
	
	@LinkType()
	@FindBy(xpath = "td/div/div/div/div/div[2]/div/div/ul/div/li[6]/ul/li/div/a")
	public WebElement Tasks;
	
	@TextType()
	@FindBy(xpath = "td/div/div/div/div/div[2]/div/div/ul/div/li[6]/ul/li/div/a/span")
	public WebElement TaskName;
}
	
	@PageTable(row = SelectRecordType.class)
	@FindBy(xpath = "//*[@id='thePage:dummyForm']/table/tbody/tr")
	public List<SelectRecordType> SelectRecordType;
	@ButtonType()
	@FindBy(id = "thePage:rtForm:createButton")
	public WebElement create;
			
	@PageRow()
	public static class ReportPreview {

		/*@TextType()
		@FindBy(css = "div.x-grid3-row.x-grid3-row-first div.x-grid3-cell-inner.x-grid3-col-ASSIGNED")
		public WebElement ;  */
		
		
		@TextType()
		@FindBy(xpath = "//div[6]/table/tbody/tr/td[7]")
		public WebElement drop;
	}
	/*@FacetFindBys(value = {
			@FacetFindBy(findBy = @FindBy(xpath = ".//*[contains(@class,'x-grid3-row')]"), facet = UiFacet.DATA_ROWS),
			@FacetFindBy(findBy = @FindBy(xpath = "//*[@id=\"ext-gen304\"]"), facet = UiFacet.HEADER_ROW) })
	@FindBy(xpath = "//*[@id=\"ext-gen304\"]")
	@PageTable(firstRowContainsHeaders = false, row = ReportPreview.class)
	public List<ReportPreview>  */
			
	/*@PageTable(row = ActivityCustomInfo.class)
	@FindBy(xpath = "//*[@id='ext-gen105']/div/li[4]/ul")
	public List<ActivityCustomInfo>  */
	
	@PageTable(row = ReportPreview.class)
	@FindBy(xpath = "//div[@class='x-grid3-body']/div")
	public List<ReportPreview> ReportPreview;
	
	@PageTable(row = ActivityCustomInfo.class)
	@FindBy(xpath = "//ul[@class='x-tree-root-ct x-tree-lines']/div/li[4]/ul")
	public List<ActivityCustomInfo> ActivityCustomInfo;
        
		@PageRow()
		public static class ActivityCustomInfo{
		
	
	@TextType()
	@FindBy(xpath = "li[4]/div/a/span")
	public WebElement Name;

	@LinkType()
	@FindBy(linkText = "Call Type")
	public WebElement CT;

	@LinkType()
	@FindBy(linkText = "Outbound Call Success")
	public WebElement OCS;
	}
	
	
}
