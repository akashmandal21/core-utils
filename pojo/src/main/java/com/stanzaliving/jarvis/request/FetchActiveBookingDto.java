package com.stanzaliving.jarvis.request;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class FetchActiveBookingDto {

    @NotBlank(message = "residenceUuid is mandatory")
    private String residenceUuid;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private List<String> bookingTypes;

}
