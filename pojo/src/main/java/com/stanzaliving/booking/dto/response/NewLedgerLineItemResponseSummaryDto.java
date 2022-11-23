package com.stanzaliving.booking.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewLedgerLineItemResponseSummaryDto implements Comparable {

    @JsonIgnore
    private Integer position = 0;

    private String key;

    private String value;

    @Override
    public int compareTo(Object o) {
        return this.position.compareTo(((NewLedgerLineItemResponseSummaryDto) o).getPosition());
    }
}
