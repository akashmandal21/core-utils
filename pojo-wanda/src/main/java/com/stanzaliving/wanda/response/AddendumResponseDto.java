package com.stanzaliving.wanda.response;

import com.stanzaliving.wanda.enums.AddendumType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class AddendumResponseDto {

    private String primaryOwnerName;

    private String guestName;

    private String guestBookingUuid;

    private Date moveInDate;

    private AddendumType addendumType;

    private Date createdAt;

    private String addendumUrl;
}
