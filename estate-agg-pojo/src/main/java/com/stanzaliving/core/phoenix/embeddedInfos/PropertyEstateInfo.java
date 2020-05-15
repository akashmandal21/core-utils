package com.stanzaliving.core.phoenix.embeddedinfos;

import com.stanzaliving.core.estate.embeddedInfos.Address;
import com.stanzaliving.core.estate.enums.EstateStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyEstateInfo {


    protected boolean status = true;

    @Indexed(unique = true)
    private String estateUuid;
    private String estateName;

    private Long cityId;

    private Long micromarketId;

    private Double lat;

    private Double lon;

    private String estateCode;

    private Address address;
    private String city;

    private String micromarket;

    public PropertyEstateInfo(String estateUuid){
        this.estateUuid=estateUuid;
    }

}
