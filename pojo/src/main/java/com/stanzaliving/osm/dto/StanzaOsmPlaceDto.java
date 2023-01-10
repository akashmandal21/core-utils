package com.stanzaliving.osm.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StanzaOsmPlaceDto extends AbstractDto implements Serializable {

    private Long osmId;

    private String osmType;

    private String classification;

    private String type;

    private String name;

    private String displayName;

    private String urlName;

    private Integer adminLevel;

    private double latitude;

    private double longitude;

    private String websiteCityName;

    private String websiteMmName;

    private Integer websiteCityId;

    private Integer websiteMmId;

    private String transformationCityUuid;

    private String transformationMmUuid;
}
