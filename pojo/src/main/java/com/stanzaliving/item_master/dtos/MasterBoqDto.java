package com.stanzaliving.item_master.dtos;

import com.stanzaliving.item_master.enums.AcquisitionType;
import com.stanzaliving.item_master.enums.DimensionUnits;
import com.stanzaliving.item_master.enums.ItemType;
import com.stanzaliving.transformations.enums.AreaOfUse;
import com.stanzaliving.transformations.enums.UnitType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.Set;

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
    private String brandNames;
    private String subBrandNames;
    private Double rate;
    private Boolean isRentalAvailable;
    private Double rentalRate;
    private String orderUnitText;
    private String acquisitionTypeText;
    private String rateFormatted;
    private String rentalRateFormatted;
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


}

