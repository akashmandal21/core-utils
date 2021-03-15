package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class WeeklyMenuFoundDto {

	Boolean foundMenu;

}
