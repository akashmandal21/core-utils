package com.stanzaliving.housekeepingservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PDFShiftsLeftOverRooms {

    private String shiftUuid;

    private String time;

    private List<PDFResponseDto> pdfResponseDtoList;
}
