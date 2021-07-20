package com.stanzaliving.core.bookingservice.dto.response;

import com.stanzaliving.core.residenceservice.enums.ResidentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookedPackageServiceDto {
    private PackagedServiceInfoResponseDto packagedServiceInfoResponseDto;
    private String residenceUuid;
    private String roomUuid;
    private String moveInDate;
    private ResidentType residentType;
}
