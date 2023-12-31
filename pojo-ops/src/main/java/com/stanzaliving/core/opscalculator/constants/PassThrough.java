/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
public enum PassThrough {

	ROOM_PASSTHROUGH("Room_PassThrough"),
	AC_PASSTHROUGH("AC_PassThrough"),
	NONE("None");

	private String passThrough;
}
