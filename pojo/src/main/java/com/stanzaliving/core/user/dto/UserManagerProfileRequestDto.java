/**
 * 
 */
package com.stanzaliving.core.user.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class UserManagerProfileRequestDto {

	List<String> userUuids;
}
