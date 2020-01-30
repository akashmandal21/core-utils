/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MasterBoqResponseDto {

	List<String> itemCodes;
	Map<String, String> itemCategories;
	List<String> itemParticulars;
	List<String> itemSpecifications;
}
