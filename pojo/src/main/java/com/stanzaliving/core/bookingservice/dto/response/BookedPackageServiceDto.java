package com.stanzaliving.core.bookingservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookedPackageServiceDto {
    private PackagedServiceResponseDto packagedServiceResponseDto;
    private String residenceUuid;
    private String roomUuid;
    private String moveInDate;
    private String bookingType;
}
