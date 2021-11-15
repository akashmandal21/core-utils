package com.stanzaliving.core.dto;

import com.stanzaliving.core.base.common.dto.AbstractSearchIndexDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class KycBookingSearchIndexDto extends AbstractSearchIndexDto {

    private String fullName;
    private String residentId;
    private String mobileNumber;

}