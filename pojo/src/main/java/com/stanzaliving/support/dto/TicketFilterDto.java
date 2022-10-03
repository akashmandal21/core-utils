package com.stanzaliving.support.dto;

import com.stanzaliving.core.dto.PageAndSortDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketFilterDto extends PageAndSortDto {

    @Builder.Default
    private List<String> status = new ArrayList<>();

    @Builder.Default
    private QuickCardFilterStatusDto quickCardFilterStatus = new QuickCardFilterStatusDto();

    @Builder.Default
    private List<String> city = new ArrayList<>();

    @Builder.Default
    private List<String> micromarket = new ArrayList<>();

    @Builder.Default
    private List<String> residence = new ArrayList<>();

    @Builder.Default
    private List<String> complaintGroup = new ArrayList<>();

    @Builder.Default
    private List<String> category = new ArrayList<>();

    @Builder.Default
    private List<String> subCategory = new ArrayList<>();

    @Builder.Default
    private List<String> priority = new ArrayList<>();

    @Builder.Default
    private List<String> tags = new ArrayList<>();

    @Builder.Default
    private List<String> team = new ArrayList<>();

    @Builder.Default
    private UserTypeDto user = new UserTypeDto();

    @Builder.Default
    private Boolean assignedToSelected = false;

    @Builder.Default
    private Boolean resolvedBySelected = false;

    @Builder.Default
    private Boolean updatedBySelected = false;

    private Date createdAtStartDate;

    private Date createdAtEndDate;

    private Date updatedAtStartDate;

    private Date updatedAtEndDate;

    private Date resolvedAtStartDate;

    private Date resolvedAtEndDate;

    private Date reopenedAtStartDate;

    private Date reopenedAtEndDate;

    @Builder.Default
    private TicketTypeDto ticketType = new TicketTypeDto();

    @Builder.Default
    private List<String> ticketSource = new ArrayList<>();

    @Builder.Default
    private String search = "";
}

