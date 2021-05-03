package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketFilterDto {

    private List<String> status;

    private QuickCardFilterStatusDto quickCardFilterStatus;

    private List<String> zone;

    private List<String> city;

    private List<String> micromarket;

    private List<String> residence;

    private List<String> complaintGroup;

    private List<String> category;

    private List<String> subCategory;

    private List<String> priority;

    private List<String> tags;

    private List<String> team;

    private List<String> user;

    private Date createdAtStartDate;

    private Date createdAtEndDate;

    private Date updatedAtStartDate;

    private Date updatedAtEndDate;

    private Date resolvedAtStartDate;

    private Date resolvedAtEndDate;

    private Date reopenedAtStartDate;

    private Date reopenedAtEndDate;

    private List<String> ticketType;




}
