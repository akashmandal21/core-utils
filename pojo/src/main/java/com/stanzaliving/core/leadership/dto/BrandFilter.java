/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import java.util.List;

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
@AllArgsConstructor
@NoArgsConstructor
public class BrandFilter {

	private List<String> slBrand;
	private List<String> subBrand;
}
