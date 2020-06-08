package com.stanzaliving.transformations.pojo;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.enums.ResidenceType;
import com.stanzaliving.core.estate.enums.EstateGender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceUIDto implements Serializable{

	private static final long serialVersionUID = 1L;

	private long id;

	@NotBlank(message = "Residence UUID is Mandatory")
	private String uuid;

	@NotBlank(message = "Residence Name is Mandatory")
	private String residenceName;

	private Long cityId;

	@NotBlank(message = "Residence City is Mandatory")
	private String cityUuid;

	private String cityName;

	private Long microMarketId;

	@NotBlank(message = "Residence Micro Market is Mandatory")
	private String microMarketUuid;

	private String microMarketName;

	@NotNull(message = "Residence Type is Mandatory")
	private ResidenceType residenceType;

	@NotNull(message = "Residence Brand is Mandatory")
	private ResidenceBrand brandName;

	@NotNull(message = "Residence Gender is Mandatory")
	private EstateGender estateGender;

	private boolean status;

	@NotNull(message = "Residence Number of Beds is Mandatory")
	@Min(value = 1, message = "Number of Beds cannot be less than 1")
	private Integer numberOfBeds;

	@NotNull(message = "Residence Number of Rooms is Mandatory")
	@Min(value = 1, message = "Number of Rooms cannot be less than 1")
	private Integer numberOfRooms;
	
	private Integer coreResidenceId;
}