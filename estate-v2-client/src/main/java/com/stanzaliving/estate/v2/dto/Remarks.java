package com.stanzaliving.estate.v2.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Remarks implements Serializable {
  private String status;
  private List<RemarksHistory> remarksHistory;
}
