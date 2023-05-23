/**
 * Self.
 *
 * @return the internet login food request dto. internet login food request
 *         dto builder impl
 */
package com.stanzaliving.core.internet.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.internet.enums.InternetVendor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class InternetLoginFoodRequestDto {

  private List<String> residenceIdList;

  @NotNull(message = "Start Date is Mandatory")
  @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "Asia/Kolkata")
  private Date startDate;

  @NotNull(message = "End Date is Mandatory")
  @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "Asia/Kolkata")
  private Date endDate;

  private InternetVendor internetVendor;

}
