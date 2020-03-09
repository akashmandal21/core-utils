/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import java.util.Map;
import java.util.Set;

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

	Set<String> itemCodes;
	Map<String, String> itemCategories;
	Set<String> itemParticulars;
	Set<String> itemSpecifications;
}
