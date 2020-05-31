package com.stanzaliving.core.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HostelDto implements Serializable{

	private static final long serialVersionUID = -2471705318252387055L;

	private Integer id;

    private String hostelName;

    private String gender;

    private String uuid;

    private String managerContact;

    private String managerName;

    private Integer microMarketId;

    private String microMarketName;

    private Integer cityId;

    private String cityName;

    private Date attendanceStartTime;

    private Date attendanceDayCloseTime;

    private Date attendanceBufferTime;

    private Date parentNotificationLagTime;

    private String address;

    private String longitude;

    private String latitude;

    private Integer pincode;

    private String hostelCode;
    
    private Integer imsResidenceId;
}

