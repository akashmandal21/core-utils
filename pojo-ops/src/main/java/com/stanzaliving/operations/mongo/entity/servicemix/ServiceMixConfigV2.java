package com.stanzaliving.operations.mongo.entity.servicemix;

import com.fasterxml.jackson.annotation.JsonInclude;
import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceMixConfigV2 {

    private List<FoodConfigV2> foodConfig;
    private List<GymConfigV2> gymConfig;
    private List<InternetConfigV2> internetConfig;
    private List<LaundryConfigV2> laundryConfig;
    private List<HouseKeepingConfigV2> houseKeepingConfig;
    private List<SecurityConfigV2> securityConfig;
    private List<ElectricityConfigV2> electricityConfig;
    private List<TransportConfigV2> transportServiceConfig;
    private List<OtherConfigV2> otherServicesConfig;
}
