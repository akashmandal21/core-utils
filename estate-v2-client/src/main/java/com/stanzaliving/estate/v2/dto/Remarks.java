package com.stanzaliving.estate.v2.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Remarks implements Serializable {
  private String status;
  private List<RemarksHistory> remarksHistory;
}
