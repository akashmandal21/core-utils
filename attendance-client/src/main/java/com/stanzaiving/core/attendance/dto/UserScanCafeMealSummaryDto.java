package com.stanzaiving.core.attendance.dto;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class UserScanCafeMealSummaryDto {

  private String userId;
  private String orderId;
}
