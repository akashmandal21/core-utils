package com.stanzaliving.gamificationservice.dto.mock;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HistoryViewAllDto {

   @JsonProperty("month_name")
   private String monthName;

   @JsonProperty("month_data")
   private List<MonthDetailsDto> monthData;


}
