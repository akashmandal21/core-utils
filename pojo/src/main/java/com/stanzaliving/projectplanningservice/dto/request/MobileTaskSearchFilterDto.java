package com.stanzaliving.projectplanningservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Anudeep Alevoor
 * @description DTO for Property plan Search Filter Parameters
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class MobileTaskSearchFilterDto {

    private List<String> taskStatusUuidList;

    private List<String> cityList;

    private List<String> microMarketList;

    private List<String> ModuleUuidList;

    private String orderByColumnName;

    private String orderBy;

}
