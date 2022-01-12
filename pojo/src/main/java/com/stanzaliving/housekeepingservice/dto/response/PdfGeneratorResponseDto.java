package com.stanzaliving.housekeepingservice.dto.response;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 11-Jan-22
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PdfGeneratorResponseDto {
    private String shiftUuid;
    private String time;
    private List<LeftOverResponseDto> leftOverResponseDtos;
}
