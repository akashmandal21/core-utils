package com.stanzaliving.residenceservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class AttributesAndGlobalUuidDto {

  private String attributeName;
  private String globalUuid;
  private String image;
}

