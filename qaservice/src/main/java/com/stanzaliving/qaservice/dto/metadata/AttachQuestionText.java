/**
 * 
 */
package com.stanzaliving.qaservice.dto.metadata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author raj.kumar
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttachQuestionText {	
	String placeHolder;
    String validationRegex;
    String unitIdentifier;	
}
