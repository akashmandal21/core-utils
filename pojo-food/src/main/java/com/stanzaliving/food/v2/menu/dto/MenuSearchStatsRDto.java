package com.stanzaliving.food.v2.menu.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuSearchStatsRDto implements Serializable {
	private long uniqueMenu;
	private long notCreated;
	private long rulesViolated;
	private long inDraft;
	private long pendingApproval;
	private long approved;

}
