
package com.stanzaliving.core.backendlocator.client.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class RentalBreakupDto {
    private Integer sgst;
    private Integer foodServiceCgst;
    private Integer total;
    private Integer servicePrice;
    private Integer foodServicePrice;
    private Integer foodServiceIgst;
    private Integer licenseFee;
    private Integer cgst;
    private Integer igst;
    private Integer foodServiceSgst;

}
