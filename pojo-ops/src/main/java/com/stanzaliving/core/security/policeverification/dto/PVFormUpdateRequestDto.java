package com.stanzaliving.core.security.policeverification.dto;

import com.stanzaliving.core.security.policeverification.enums.PoliceVerificationStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PVFormUpdateRequestDto {

    @NotEmpty(message = "Police Verification uuid can not be empty")
    private List<String> policeVerificationUuids;

    @NotNull(message = "Police Verification status can not be null")
    private PoliceVerificationStatus policeVerificationStatus;

    private String comment;

}
