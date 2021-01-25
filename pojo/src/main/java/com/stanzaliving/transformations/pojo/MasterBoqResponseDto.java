/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import java.util.Map;
import java.util.Set;

import lombok.*;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MasterBoqResponseDto {

	Set<String> itemCodes;
	Map<String, String> itemCategories;
	Set<String> itemParticulars;
	Set<String> itemSpecifications;
}
