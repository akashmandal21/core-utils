package com.stanzaliving.operations.dto.servicemix;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.food.dto.request.WeekWiseMenu;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class InternetService extends BooleanService {
	private Internet internet;
}
