
package com.stanzaliving.wanda.dtos;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LocationDetailsListDto implements Serializable {

	private static final long serialVersionUID = -2471705318252387055L;

	private List<String> cityUuid;

	private List<String> micromarketUuid;

	private List<String> residenceUuid;
}