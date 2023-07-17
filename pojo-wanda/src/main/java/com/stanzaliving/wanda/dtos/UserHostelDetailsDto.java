/**
 * 
 */
package com.stanzaliving.wanda.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @author naveen.kumar
 *
 * @date 28-Oct-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserHostelDetailsDto implements Serializable {

	private Integer userId;
	private String userUuid;
	private String userCode;
	private String userName;
	private String mobile;
	private String email;
	private String currentHostelId;
	private String currentHostelName;
	private String originalHostelId;
	private String originalHostelName;
    private String currentRoomNo;
	private String originalRoomNo;
	private String countryCode;
}