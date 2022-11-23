package com.stanzaliving.core.bookingservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
    private List<String> roomUuidList;
    private List<PackagedServiceResponseDto> packagedServiceResponseDtoList;

}
