package com.stanzaliving.vms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceDeviceMappingDto {

	private int attendanceDeviceMappingId;

	private int hostelId;

	private int attendanceDeviceTypeId;

	private String attendanceDeviceType;

	private int attendanceDeviceLocationId;

	private String attendanceDeviceLocation;

	private String deviceName;

	private boolean isActive;

	private String deviceId;

	private Integer deviceType;

}