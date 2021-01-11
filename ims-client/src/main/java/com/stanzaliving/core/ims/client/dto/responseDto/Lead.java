package com.stanzaliving.core.ims.client.dto.responseDto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author harman
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Lead {

    private String name;

    private String phone;

    private String email;

    private String status;

    private String microMarket;

    private String city;

    private Date submittedOn;

    private String preBookedOn;

    private Date bookedOn;

    private BigDecimal totalEarnings = BigDecimal.ZERO;

    private BigInteger transactionsCount = BigInteger.ZERO;

}
