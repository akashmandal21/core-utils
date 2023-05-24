package com.stanzaliving.core.security.policeverification.dto;


import java.util.List;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.dto.PageAndSortDto;
import com.stanzaliving.core.operations.enums.ResidentStatus;
import com.stanzaliving.core.security.policeverification.enums.PVApplicable;
import com.stanzaliving.core.security.policeverification.enums.PVNationality;
import com.stanzaliving.core.security.policeverification.enums.PoliceVerificationStatus;
import com.stanzaliving.core.security.policeverification.enums.RegistrationType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PVListingRequestDto {

    @NotNull(message = "Police Verification Status can not be null")
    private PoliceVerificationStatus policeVerificationStatus;

    private PVApplicable pvApplicable;

    private String searchText;

    private List<String> cityNames;

    private List<String> micromarketNames;

    private List<String> residenceNames;

    private List<PVNationality> nationality;

    private List<ResidentStatus> residentStatus;

    private List<RegistrationType> registrationType;
    
    private PageAndSortDto pageDto;

    private String pvUuid;

}
