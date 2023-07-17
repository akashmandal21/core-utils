package com.stanzaliving.food.v2.common.dto;

import com.stanzaliving.food.v2.common.constant.ThaliType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 * @since 19-July-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ThaliMasterDto {

	private String name;
	
	private String thaliUuid;

	private ThaliType thaliType;

	private int sequence;

	private String imageUri;
}
