package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;


/**
 * @author Pradeep Naik R
 * @description DTO for Template Search Filter Parameters
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class SectionFilterRequest implements Serializable {

    private static final long serialVersionUID = 1635296868115644218L;

    private String durationUnit;

    private int minDaysRange;

    private int maxDaysRange;

    private List<String> module;

    private String activities;

    private List<String> predecessorTasks;

    private String owner;

    private PaginationRequest pageRequest;
}