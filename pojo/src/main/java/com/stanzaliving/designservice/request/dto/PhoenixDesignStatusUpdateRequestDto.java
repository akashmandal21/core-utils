package com.stanzaliving.designservice.request.dto;

import com.stanzaliving.designservice.enums.BedType;
import com.stanzaliving.designservice.enums.PhoenixDesignStatus;
import com.stanzaliving.transformations.enums.SubBrandName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PhoenixDesignStatusUpdateRequestDto {

    private PhoenixDesignStatus phoenixDesignStatus;

    private BedType subBrandName;

    private String propertyUuid;

    private String phoenixDesignRemark;

    private String reasonForNoSumma;

    private String reasonForNoMagna;

    private String reasonForNoPrima;

}
