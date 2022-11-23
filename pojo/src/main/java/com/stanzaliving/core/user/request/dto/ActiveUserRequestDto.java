package com.stanzaliving.core.user.request.dto;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 * @date 16-June-2021
 *
 */

@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder
@Getter
@Setter
public class ActiveUserRequestDto {

	private Collection<String> userIds;

}