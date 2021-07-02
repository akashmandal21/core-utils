package com.stanzaliving.core.generic.itemmaster.dto;

import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.common.dto.AbstractSearchIndexDto;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.generic.enums.GSTSlabs;
import com.stanzaliving.core.generic.itemmaster.enums.ItemAction;
import com.stanzaliving.item_master.enums.FarCategory;
import com.stanzaliving.transformations.enums.UnitType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ItemUpdateDto extends AbstractDto {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Department department;
    private ItemAction itemAction;

    private UIKeyValue itemCategory;
    private UIKeyValue itemSubCategory;
    private UIKeyValue itemCostHead; // costHeadlabel would be label, costHead will be value

    private String itemName;
    private String itemDescription;
    private String itemCode;
    private GSTSlabs gstSlab;
    private List<UIKeyValue> usageTypeOrArea;
    private UnitType unitOfMeasurement;
    private String glCode;
    private String recipeTag;
    private String recipeTagName;
	
    private FarCategory farCategory;
    
    private String itemNameSearch;
    private String itemNameSuggest;

    private String itemCodeSearch;
    private String itemDescriptionSearch;

    private String substituteItem;
    private UnitType recipeUom;
    private Double conversionFactor;

    private UnitType standardUom;
    private Double standardQuantity;
    private String itemImage;
    private String genericItemName;

    private Boolean taggable;

}
