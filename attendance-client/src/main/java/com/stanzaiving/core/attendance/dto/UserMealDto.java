package com.stanzaiving.core.attendance.dto;

import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class UserMealDto {

  private List<String> userIds;
  private String meal;
}
