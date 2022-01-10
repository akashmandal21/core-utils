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
public class PDFTaskDetailsDto {

    private String residenceName;

    private List<String> rooms;

    private String time;

    private String generalType;

}
