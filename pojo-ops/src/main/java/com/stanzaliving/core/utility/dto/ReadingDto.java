package com.stanzaliving.core.utility.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ReadingDto extends AbstractDto {

	private static final long serialVersionUID = -3367548883134616844L;
	
	private Double reading;
	
	private Date time;
	
	private String image;
}