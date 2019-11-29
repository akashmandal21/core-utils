/**
 * 
 */
package com.stanzaliving.qaservice.dto.metadata;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author raj.kumar
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttachQuestionDropdown {
	List<OptionsMetadataDto> options = new ArrayList<>();
}
