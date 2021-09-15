package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;


/**
 * @author Pradeep Naik R
 * @description DTO for Template Search Filter Parameters
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class SectionFilterRequestDto{

    private String durationUnit;

    private int minDaysRange;

    private int maxDaysRange;

    private List<String> module;

    private PaginationRequest pageRequest;

    private List<String> owners;

    private List<String> activityList;

    private List<String> predecessorTasks;
}