package com.stanzaliving.price_strategy.request;

import com.stanzaliving.commercialcard.enums.CommercialCardStatus;
import com.stanzaliving.commercialcard.enums.CommercialCardUserType;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PriceStrategyFilterDto {

    private  List<String> residenceUuidList;

    private List<String> cityUuidList;

    private List<String> microMarketUuidList;

    private List<String> countryList;

    private String name;

    private List<CommercialCardStatus> status;

    private List<CommercialCardUserType> bookingType;

    private Date from;

    private Date to;

    private Integer pageSize;

    private Integer pageNumber;

    private String sortBy;

    private String sortOrder;

    private List<String> bookingSubTypes;

    private  List<String> strategyUuids;
}
