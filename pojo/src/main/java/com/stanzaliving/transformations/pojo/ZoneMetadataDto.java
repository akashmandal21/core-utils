/**
 *
 */
package com.stanzaliving.transformations.pojo;

import lombok.*;


@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZoneMetadataDto {

    private long zoneId;

    private String uuid;

    private String zoneName;

    private long countryId;
}