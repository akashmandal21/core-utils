/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import java.util.List;

import com.stanzaliving.transformations.enums.BoqStatus;

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
public class BoqScreenItemDto {

	private String propertyUuid;
	private BoqStatus boqStatus;
	private List<BoqCategoryItemDto> boqCategoryItemList;
}
