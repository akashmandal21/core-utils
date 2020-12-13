package com.stanzaliving.core.ims.client.dto.responseDto;

import lombok.*;
import lombok.experimental.SuperBuilder;

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

    private int submittedOn;

    private String preBookedOn;

    private int bookedOn;


}
