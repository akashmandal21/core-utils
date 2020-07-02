package com.stanzaliving.item_master.dtos;

import com.stanzaliving.item_master.enums.AcquisitionType;
import com.stanzaliving.item_master.enums.ItemType;
import com.stanzaliving.transformations.enums.AreaOfUse;
import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.SubBrandName;
import com.stanzaliving.transformations.enums.UnitType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

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
    private Double rate;
    private Boolean isRentalAvailable;
    private Double rentalRate;
    private String orderUnitText;
    private String acquisitionTypeText;
    private String rateFormatted;
    private String rentalRateFormatted;
    private String cgst;
    private String igst;
    private String sgst;

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
        this.acquisitionType = Enum.valueOf(AcquisitionType.class, acquisitionType);
        this.orderUnit = Enum.valueOf(UnitType.class,orderUnit);
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.thumbnailUrl = thumbnailUrl;
        this.imageUrl=imageUrl;
        this.docUrl=specDocumentUrl;
    }

    //For Native Queries. SqlResultSetMapped to MasterBoqForDesign in ItemMasterDetails
    public MasterBoqDto(Date lastUpdatedAt, String categoryUuid, Long itemId, String itemUuid, String itemCode,
                        String categoryName, String itemUseType,
                        String particular, String descSpec,
                        String acquisitionType, String orderUnit, String length, String breadth, String height,
                        String thumbnailUrl,String imageUrl,String specDocumentUrl,String brandNames, String subBrandNames, String areaOfUseList,
                        String cgst, String igst, String sgst) {
        this.lastUpdatedAt=lastUpdatedAt;
        this.categoryUuid=categoryUuid;
        this.itemId = itemId;
        this.itemUuid = itemUuid;
        this.itemCode = itemCode;
        this.categoryName = categoryName;
        this.itemType = Enum.valueOf(ItemType.class,itemUseType);
        this.particular = particular;
        this.descSpec = descSpec;
        this.acquisitionType = Enum.valueOf(AcquisitionType.class, acquisitionType);
        this.acquisitionTypeText=this.acquisitionType.getAcTypeText();
        this.orderUnit = Enum.valueOf(UnitType.class,orderUnit);
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
        this.areaOfUsesMap= Arrays.asList(areaOfUseList.split(",")).stream().map(f->AreaOfUse.valueOf(f.trim())).
                collect(Collectors.toMap(f->f,f->f.getName()));
        this.cgst = cgst;
        this.igst = igst;
        this.sgst = sgst;
    }

}

