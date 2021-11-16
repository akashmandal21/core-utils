package com.stanzaliving.residenceservice.Dto;

import lombok.*;

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

