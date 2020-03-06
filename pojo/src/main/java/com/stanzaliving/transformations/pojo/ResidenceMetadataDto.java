package com.stanzaliving.transformations.pojo;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceMetadataDto {

    private long residenceId;

    private String uuid;

    private String residenceName;

}
