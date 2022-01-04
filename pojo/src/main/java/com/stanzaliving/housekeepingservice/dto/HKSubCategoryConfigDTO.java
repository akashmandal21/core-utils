package com.stanzaliving.housekeepingservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Priyadarshini MB
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HKSubCategoryConfigDTO {

	private String subCategoryUuid;

	private String variable;

	private String variableName;

	private String variableDataType;
}