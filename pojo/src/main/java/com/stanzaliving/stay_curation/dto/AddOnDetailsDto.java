
package com.stanzaliving.stay_curation.dto;

import com.stanzaliving.stay_curation.enums.AddOnStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AddOnDetailsDto extends SkuDetailsDto {

    private String addOnId;

    private String name;

    private String image;

    private AddOnBillingDto postPaidOption;

    private List<AddOnBillingDto> prePaidOptions;

    private GstDetailsDto gstDetails;

    @Builder.Default
    private AddOnStatus addOnStatus = AddOnStatus.ACTIVE;

    @Builder.Default
    private boolean applicableForBooking = true;

}
