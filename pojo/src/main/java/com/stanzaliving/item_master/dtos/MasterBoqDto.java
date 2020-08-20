package com.stanzaliving.item_master.dtos;

import com.stanzaliving.item_master.enums.AcquisitionType;

import com.stanzaliving.item_master.enums.ConsumptionPattern;
import com.stanzaliving.item_master.enums.CostHead;
import com.stanzaliving.item_master.enums.DimensionUnits;
import com.stanzaliving.item_master.enums.ItemMaterial;


import com.stanzaliving.item_master.enums.ItemType;
import com.stanzaliving.item_master.enums.OrderingPattern;
import com.stanzaliving.item_master.enums.ProductionTimeUnit;
import com.stanzaliving.item_master.enums.StorageType;
import com.stanzaliving.transformations.enums.AreaOfUse;
import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.SubBrandName;
import com.stanzaliving.transformations.enums.UnitType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MasterBoqDto {
    private Date lastUpdatedAt;
    private String categoryUuid;
    private Long itemId;
    private String itemUuid;
    private String itemCode;
    private String categoryName;
    private ItemType itemType;
    private String particular;
    private String descSpec;
    private AcquisitionType acquisitionType;
    private UnitType orderUnit;
    private String length;
    private String breadth;
    private String height;
    private String thumbnailUrl;
    private String imageUrl;
    private String docUrl;
    private Set<AreaOfUse> areaOfUses;
    private Map<AreaOfUse,String> areaOfUsesMap;
    private String brandNames;
    private String subBrandNames;
    private BigDecimal rate;
    private Boolean isRentalAvailable;
    private Double rentalRate;
    private String orderUnitText;
    private String acquisitionTypeText;
    private String rateFormatted;
    private String rentalRateFormatted;
    private String cgst;
    private String igst;
    private String sgst;
    private String hsnCode;
    private StorageType storageType;
    private OrderingPattern orderingPattern;
    private ConsumptionPattern consumptionPattern;
    private ItemMaterial itemMaterial;
    private Float productionTime;
    private ProductionTimeUnit productionTimeUnit;
    private String itemTypeStr;
    private CostHead costHead;
    private String consumptionPatternStr;
    private String itemMaterialStr;

    //For Native Queries. SqlResultSetMapped to MasterBoq in ItemMasterDetails
    public MasterBoqDto(Date lastUpdatedAt, String categoryUuid, Long itemId, String itemUuid, String itemCode,
                        String categoryName, String itemUseType,
                        String particular, String descSpec,
                        String acquisitionType, String orderUnit, String length, String breadth, String height,
                        String thumbnailUrl,String imageUrl,String specDocumentUrl) {
        this.lastUpdatedAt=lastUpdatedAt;
        this.categoryUuid=categoryUuid;
        this.itemId = itemId;
        this.itemUuid = itemUuid;
        this.itemCode = itemCode;
        this.categoryName = categoryName;
        this.itemType = Enum.valueOf(ItemType.class,itemUseType);
        this.particular = particular;
        this.descSpec = descSpec;
        this.acquisitionType = Objects.nonNull(acquisitionType) ? Enum.valueOf(AcquisitionType.class, acquisitionType) : null;
        this.orderUnit = Objects.nonNull(orderUnit) ? Enum.valueOf(UnitType.class,orderUnit) : null;
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.thumbnailUrl = thumbnailUrl;
        this.imageUrl=imageUrl;
        this.docUrl=specDocumentUrl;
        this.itemTypeStr = Enum.valueOf(ItemType.class,itemUseType).getTypeText();

    }

    //For Native Queries. SqlResultSetMapped to MasterBoqForDesign in ItemMasterDetails
    public MasterBoqDto(Date lastUpdatedAt, String categoryUuid, Long itemId, String itemUuid, String itemCode,
                        String categoryName, String itemUseType,
                        String particular, String descSpec,
                        String acquisitionType, String orderUnit, String length, String breadth, String height,
                        String thumbnailUrl, String imageUrl, String specDocumentUrl, String brandNames, String subBrandNames, String areaOfUseList,
                        String cgst, String igst, String sgst, String hsnCode, String storageType, String orderingPattern,
                        String consumptionPattern, String itemMaterial, String productionTimeUnit, Float productionTime, String costHead) {
        this.lastUpdatedAt=lastUpdatedAt;
        this.categoryUuid=categoryUuid;
        this.itemId = itemId;
        this.itemUuid = itemUuid;
        this.itemCode = itemCode;
        this.categoryName = categoryName;
        this.itemType = Enum.valueOf(ItemType.class, itemUseType);
        this.particular = particular;
        this.descSpec = descSpec;
        if (Objects.nonNull(acquisitionType)) {
            this.acquisitionType = Enum.valueOf(AcquisitionType.class, acquisitionType);
            this.acquisitionTypeText=this.acquisitionType.getAcTypeText();
        }
        this.orderUnit = Objects.nonNull(orderUnit) ? Enum.valueOf(UnitType.class,orderUnit) : null;
        this.orderUnitText = (Objects.nonNull(this.orderUnit))?this.orderUnit.getUnitName():null;
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.thumbnailUrl = thumbnailUrl;
        this.imageUrl=imageUrl;
        this.docUrl=specDocumentUrl;
        if(StringUtils.isNotEmpty(brandNames))
            this.brandNames= Arrays.stream(brandNames.split(",")).map(f-> BrandName.valueOf(f.trim()).getBrand()).collect(Collectors.joining(", "));
        if(StringUtils.isNotEmpty(subBrandNames))
            this.subBrandNames=Arrays.stream(subBrandNames.split(",")).map(f-> SubBrandName.valueOf(f.trim()).getSubBrand()).collect(Collectors.joining(", "));;
        if(StringUtils.isNotEmpty(areaOfUseList))
            this.areaOfUsesMap= Arrays.asList(areaOfUseList.split(",")).stream().map(f->AreaOfUse.valueOf(f.trim())).collect(Collectors.toMap(f->f,f->f.getName()));
        this.cgst = cgst;
        this.igst = igst;
        this.sgst = sgst;
        this.hsnCode = hsnCode;
        this.itemTypeStr = Enum.valueOf(ItemType.class, itemUseType).getTypeText();
        this.storageType = Objects.nonNull(storageType) ? Enum.valueOf(StorageType.class, storageType) : null;
        this.orderingPattern = Objects.nonNull(orderingPattern) ? Enum.valueOf(OrderingPattern.class, orderingPattern) : null;
        if (Objects.nonNull(consumptionPattern)) {
            this.consumptionPattern = Enum.valueOf(ConsumptionPattern.class, consumptionPattern);
            this.consumptionPatternStr = this.consumptionPattern.getConsumptionPatternText();
        }
        if (Objects.nonNull(itemMaterial)) {
            this.itemMaterial = Enum.valueOf(ItemMaterial.class, itemMaterial);
            this.itemMaterialStr = this.itemMaterial.getItemMaterialText();
        }
        this.productionTimeUnit = Objects.nonNull(productionTimeUnit) ? Enum.valueOf(ProductionTimeUnit.class, productionTimeUnit) : null;
        this.productionTime = productionTime;
        this.costHead = Objects.nonNull(costHead) ? Enum.valueOf(CostHead.class, costHead) : null;
    }

}

