/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import java.util.Map;

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
public class BoqCapexCalculationCost {

	Map<String, Double> boiCapexCost;
	Map<String, Double> gcCapexCost;
}
