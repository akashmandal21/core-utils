/**
 * 
 */
package com.stanzaliving.core.estate.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.user.dto.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 30-Oct-2019
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class EstateDto extends AbstractDto {

	private String estateName;

	private Address address;

	private Long cityId;

	private String cityName;

	private Long micromarketId;

	private String micromarketName;

	private Double lat;

	private Double lon;

}