package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessHourFilterDto {

    private List<String> createdBy;
    private List<String> lastUpdatedBy;
    private List<String> city;
    private List<String> micromarket;
    private List<String> residence;
    private List<String> complaintGroup;
    private List<String> category;
    private List<String> subcategory;
    private List<String> subTicketTask;

}
