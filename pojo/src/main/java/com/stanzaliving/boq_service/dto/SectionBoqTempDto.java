package com.stanzaliving.boq_service.dto;

import com.stanzaliving.item_master.enums.ItemType;
import com.stanzaliving.transformations.enums.AreaOfUse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.tuple.Pair;

import java.math.BigDecimal;
import java.util.Map;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SectionBoqTempDto {

    private String itemCode;

    private String itemUuid;

    private String itemName;

    private BigDecimal totalItemQuantity;

    private BigDecimal totalItemCost;

    private ItemType itemType;

    private BigDecimal masterRate;

    private AreaOfUse areaOfUse;

    private String subCategory;

    //private Map<Pair<String, String>, BigDecimal> itemCodeAndSectionNameAndItemQuantityMap;

    //private Map<Pair<String, String>, BigDecimal> itemCodeAndSectionNameAndQcQuantityMap;

    private Map<String, Pair<String, BigDecimal>> itemCodeAndSectionNameAndItemQuantityMap;

    private Map<String, Pair<String, BigDecimal>> itemCodeAndSectionNameAndQcQuantityMap;

    //private Map<String, SectionalBoqCapexDto> sectionBoqCapexMap;
}
