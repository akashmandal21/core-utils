package com.stanzaliving.locator.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.user.enums.Gender;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompetitorPropertyDto extends AbstractDto {
	@NotNull(message = "latitude can not be blank")
	private Double latitude;

	@NotNull(message = "longitude can not be blank")
	private Double longitude;

	@NotEmpty(message = "property_name can not be blank")
	@JsonProperty("property_name")
	private String name;

	@JsonProperty("min_rent")
	private Double minRent;

	@JsonProperty("max_rent")
	private Double maxRent;

	private Gender gender;

	private String area;

	private String city;

	private String state;

	@NotEmpty(message = "Please enter competitor")
	private String competitor;

	private String competitionType;

	private String remarks;

	private Long beds;

	private Long totalRooms;

}
