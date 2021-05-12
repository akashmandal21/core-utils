package com.stanzaliving.legal_v2.DTO.BdRemarks;

import com.stanzaliving.core.dto.AbstractMongoDto;
import com.stanzaliving.legal_v2.enums.BdRemarksStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BdRemarksDto extends AbstractMongoDto {

    @NotNull(message = "Remarks cannot be null")
    private String bdRemarks;

    @NotNull(message = "Status cannot be null")
    private BdRemarksStatus bdRemarksStatus;

    private String reason;

    @NotNull(message = "Deviation Id cannot be null")
    private String deviationUuid;

}
