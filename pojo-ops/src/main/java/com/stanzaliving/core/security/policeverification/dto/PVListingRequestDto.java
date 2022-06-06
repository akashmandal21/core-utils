package com.stanzaliving.core.security.policeverification.dto;


import com.stanzaliving.core.dto.PageAndSortDto;
import com.stanzaliving.core.operations.enums.ResidentStatus;
import com.stanzaliving.core.security.policeverification.enums.PVNationality;
import com.stanzaliving.core.security.policeverification.enums.PoliceVerificationStatus;
import com.stanzaliving.core.security.policeverification.enums.RegistrationType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PVListingRequestDto {

    @NotNull(message = "Police Verification Status can not be null")
    private PoliceVerificationStatus policeVerificationStatus;

    private List<String> cityNames;

    private List<String> micromarketNames;

    private List<String> residenceNames;

    private List<PVNationality> nationality;

    private List<ResidentStatus> residentStatus;

    private List<RegistrationType> registrationType;
    
    private PageAndSortDto pageDto;

}
