package com.stanzaliving.support.dto;

import com.stanzaliving.core.dto.PageAndSortDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketFilterDto extends PageAndSortDto {

    private List<String> status;

    private QuickCardFilterStatusDto quickCardFilterStatus;

    private List<String> city;

    private List<String> micromarket;

    private List<String> residence;

    private List<String> complaintGroup;

    private List<String> category;

    private List<String> subCategory;

    private List<String> priority;

    private List<String> tags;

    private List<String> team;

    private UserTypeDto user;

    private Boolean assignedToSelected;

    private Boolean createdBySelected;

    private Boolean resolvedBySelected;

    private Boolean updatedBySelected;

    private Date createdAtStartDate;

    private Date createdAtEndDate;

    private Date updatedAtStartDate;

    private Date updatedAtEndDate;

    private Date resolvedAtStartDate;

    private Date resolvedAtEndDate;

    private Date reopenedAtStartDate;

    private Date reopenedAtEndDate;

    private TicketTypeDto ticketType;

    private List<String> ticketSource;

    private String search;
}

