package com.stanzaliving.core.ims.client.dto.responseDto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * @author harman
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CityResponseDto {

   private int cityId;

   private String name;

   private String code;

   private Long stateId;

   private String stateName;

   private List<MicroMarket> microMarket;

}

