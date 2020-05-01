package com.stanzaliving.core.phoenix.embeddedInfos;

import com.stanzaliving.core.estate.embeddedInfos.LeadershipInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyBasicInfo {
    @Indexed(name = "property_ref")
    private String propertyUuid;
    private boolean status=true;
    private PropertyEstateInfo estateInfo;
    private LeadershipInfo leadershipInfo;

    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;

    @Indexed(name = "city_ref")
    private String cityUuid;

    @Indexed(name = "micromarket_ref")
    private String micromarketUuid;


    private LocalDate opsHandoverDate;
    private LocalDate landLordHandoverDate;


    private boolean opsHandoverDone;
    private boolean landlordHandedOver;

    private String sowAtlUrl;

    private Integer numBeds;
    private Integer rentFreeDays;
    private Integer numRooms;
    private Integer numPhotos;
    private String thumbnailUrl;
    private Double totalPlotArea;
    private Double totalPropArea;
    private Double totalPremiseArea;
    private Integer numFloors;
    private Integer numberOfStiltRooms;
    private List<String> propertyImages;

    public PropertyBasicInfo(PropertyEstateInfo propertyEstateInfo){
        this.estateInfo=propertyEstateInfo;
    }
}
