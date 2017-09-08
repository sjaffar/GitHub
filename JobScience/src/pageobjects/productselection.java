package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="productselection"                                
     , summary=""
     , relativeUrl=""
     , connection="JobScience"
     )             
public class productselection {

	@TextType()
	@FindBy(css = "#sbPageContainer/deep/SB-PRODUCT-LOOKUP.--desktop/deep/SB-PAGE-HEADER.--desktop/deep/#plSelect.keyboard-focus/deep/SB-I18N")
	public WebElement Select;
	@TextType()
	@FindBy(css = "#sbPageContainer/deep/SB-PRODUCT-CONFIG.--desktop/deep/#bundles.--desktop/deep/#search.--desktop/deep/#drawer/deep/#features/deep/SB-TABS.--desktop/deep/#paperTabs.horizontal/deep/PAPER-TAB.noOverflow/deep/DIV.tab-content")
	public WebElement Add_ons;
	@TextType()
	@FindBy(css = "#sbPageContainer/deep/SB-PRODUCT-CONFIG.--desktop/deep/#bundles.--desktop/deep/#search.--desktop/deep/#drawer/deep/#features/deep/SB-TABS.--desktop/deep/#paperTabs.horizontal/deep/PAPER-TAB.noOverflow/deep/DIV.tab-content")
	public WebElement Add_ons1;
			
}
