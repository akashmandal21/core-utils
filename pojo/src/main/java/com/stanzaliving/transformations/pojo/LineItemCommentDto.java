/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class LineItemCommentDto {

	@NotNull(message = "Property uuid is mandatory")
	private String propertyUuid;
	
	@NotNull(message = "Line item uuid is mandatory")
	private String lineItemUuid;
	
	@NotNull(message = "Comment is mandatory")
	private String comment;
	
	private String lineItemCategory;
}
