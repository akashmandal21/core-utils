package com.stanzaliving.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentFreqDto {
    private double rent;
    private String uuid;
    @Temporal(TemporalType.DATE)
    private Date moveIn;
    @Temporal(TemporalType.DATE)
    private Date moveOut;

}
