package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasNudgeRequestDto {

  	private Set<String> userIds;

  	@NotNull(message = "nudgeDate is mandatory")
  	private LocalDate nudgeDate;

  	private Set<String> residenceIds;

    private Set<String> orderIds;

}
