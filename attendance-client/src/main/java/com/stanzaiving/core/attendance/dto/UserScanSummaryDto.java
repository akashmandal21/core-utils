package com.stanzaiving.core.attendance.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class UserScanSummaryDto {

  private String residenceId;

 // private UserNormalMealDto userNormalMealDto;
  private Set<String> userIds = new HashSet<>();

  private String meal;
}
