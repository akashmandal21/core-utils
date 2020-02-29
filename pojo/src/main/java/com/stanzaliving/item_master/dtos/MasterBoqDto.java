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
    private Float length;
    private Float breadth;
    private Float height;
    private DimensionUnits dimensionUnit;
    private String thumbnailUrl;
    private Set<AreaOfUse> areaOfUses;
    private String brandNames;
    private String subBrandNames;
    private Double rate;

    public MasterBoqDto(Date lastUpdatedAt, String categoryUuid, Long itemId, String itemUuid, String itemCode,
                        String categoryName, String itemUseType,
                        String particular, String descSpec,
                        String acquisitionType, String orderUnit, Float length, Float breadth, Float height,
                        String dimensionUnit, String thumbnailUrl) {
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
        if(StringUtils.isNotEmpty(dimensionUnit))
            this.dimensionUnit = Enum.valueOf(DimensionUnits.class,dimensionUnit);
        this.thumbnailUrl = thumbnailUrl;
    }



}

