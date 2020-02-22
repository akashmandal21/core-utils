package com.stanzaliving.core.dto;

import java.util.Date;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HostelDto {

    private int id;

    private String hostelName;

    private String gender;

    private String uuid;

    private String managerContact;

    private String managerName;

    private int microMarketId;

    private String microMarketName;

    private int cityId;

    private String cityName;

    private Date attendanceStartTime;

    private Date attendanceDayCloseTime;

    private Date attendanceBufferTime;

    private Date parentNotificationLagTime;

    private String address;

    private String longitude;

    private String latitude;

    private int pincode;

    private String hostelCode;

}

