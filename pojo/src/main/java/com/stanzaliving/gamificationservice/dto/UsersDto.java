package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDate;

/**
 * @author Keshav Singh
 * @date 11/21/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UsersDto {

	private String uuid;

	private String firstName;

	private String lastName;

	private LocalDate dateOfJoining;

	private String emailId;
}
