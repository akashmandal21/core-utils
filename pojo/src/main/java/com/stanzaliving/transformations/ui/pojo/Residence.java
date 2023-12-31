/**
 * 
 */
package com.stanzaliving.transformations.ui.pojo;

import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author naveen.kumar
 *
 * @date 23-Jan-2020
 *
 **/
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Residence implements Serializable {

	private String residenceName;
	
	private Long id;
	
	private String uuid;
}