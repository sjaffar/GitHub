package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;
import com.provar.core.testapi.annotations.SteelBrickBy.Facet;

@SalesforcePage( title="Sbqq__sb"                                
               , summary=""
               , page="sb"
               , namespacePrefix="SBQQ"
               , object=""
               , connection="JobScience"
     )             
public class sbqq__sb {

	@TextType()
	@FindBy(css = "#sbPageContainer/deep/SB-PRODUCT-LOOKUP.--desktop/deep/SB-PAGE-HEADER.--desktop/deep/#plSelect.keyboard-focus/deep/SB-I18N")
	public WebElement Select;
	@TextType()
	@SteelBrickBy(fieldSetTableItem = "SBQQ__StartDate__c")
	public WebElement startDate;
	@TextType()
	@SteelBrickBy(fieldSetTableItem = "SBQQ__StartDate__c")
	public WebElement startDate1;
	@BooleanType()
	@SteelBrickBy(customAction = "Add Products")
	public WebElement addProducts;
	@ChoiceListType()
	@SteelBrickBy(fieldSetTableItem = "DiscountReason__c")
	public WebElement discountReason;
	@ChoiceListType()
	@SteelBrickBy(fieldSetTableItem = "DiscountReason__c")
	public WebElement discountReason1;
	@ChoiceListType()
	@SteelBrickBy(fieldSetTableItem = "DiscountReason__c")
	public WebElement discountReason2;
	@BooleanType()
	@SteelBrickBy(customAction = "Add Group")
	public WebElement addGroup;
	@BooleanType()
	@SteelBrickBy(customAction = "Cancel")
	public WebElement cancel;
	@PageRow()
	public static class ProductSelectionLines {

		@TextType()
		@SteelBrickBy(fieldSetTableItem = "Product2.Name")
		public WebElement productName;
		
		@BooleanType()
		@SteelBrickBy(fieldSetTableItem = "checkbox")
		public WebElement productNamechk;

		@TextType()
		@SteelBrickBy(fieldSetTableItem = "Product2.Description")
		public WebElement productDescription;

		@BooleanType()
		@SteelBrickBy(fieldSetTableItem = "checkbox")
		public WebElement productName1;

		@BooleanType()
		@SteelBrickBy(fieldSetTableItem = "checkbox")
		public WebElement productName2;
	}
	@SteelBrickBy(pageTableRow = "sb-lookup-layout#lookupLayout")
	@PageTable(firstRowContainsHeaders = false, row = ProductSelectionLines.class)
	public List<ProductSelectionLines> productSelectionLines;
	@PageBlock()
	public static class Components {

		@SteelBrickBy(pageTableRow = "sb-product-feature-list[name=t0]")
		@PageTable(firstRowContainsHeaders = false, row = ComponentsLines.class)
		public List<ComponentsLines> componentsLines;
	}
	@SteelBrickBy(tabName = "Components")
	public Components components;
	@PageRow()
	public static class ComponentsLines {

		@TextType()
		@SteelBrickBy(fieldSetTableItem = "record.SBQQ__ProductName__c")
		public WebElement productName;
	}
	@PageBlock()
	public static class AddOns {

		@FindBy(css = "#sbPageContainer.--desktop/deep/SB-PRODUCT-CONFIG.--desktop/deep/#bundles.--desktop/deep/#features.--desktop/deep/SB-TABS.--desktop/deep/#paperTabs.horizontal/deep/PAPER-TAB.noOverflow/deep/DIV.tab-content")
		public AddOns1 addOns;
	}
	@SteelBrickBy(tabName = "Add-Ons")
	public AddOns addOns;
	@PageBlock()
	public static class AddOns1 {

		@ButtonType()
		@SteelBrickBy(fieldSetTableItem = "Add-Ons")
		public WebElement addOns;
	}
	@PageBlock()
	public static class Promotions {

		@SteelBrickBy(pageTableRow = "sb-product-feature-list[name=t1]")
		@PageTable(firstRowContainsHeaders = false, row = PromotionsLines.class)
		public List<PromotionsLines> promotionsLines;
	}
	@SteelBrickBy(tabName = "Promotions")
	public Promotions promotions;
	@PageRow()
	public static class PromotionsLines {

		@TextType()
		@SteelBrickBy(fieldSetTableItem = "record.SBQQ__ProductName__c")
		public WebElement productName;
	}
	@ButtonType()
	@SteelBrickBy(customAction = "pcSave")
	public WebElement save;
	@BooleanType()
	@SteelBrickBy(customAction = "Save")
	public WebElement save1;
	@ButtonType()
	@SteelBrickBy(customAction = "pcSave")
	public WebElement save2;	
}
