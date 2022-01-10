package com.stanzaliving.gamificationservice.dto.mock;

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
public class MonthDetailsDto {

   @JsonProperty("image")
   private String image;

   @JsonProperty("title")
   private String title;

   @JsonProperty("subTitle")
   private String subTitle;

   @JsonProperty("points")
   private String points;

   @JsonProperty("time")
   private String time;


}
