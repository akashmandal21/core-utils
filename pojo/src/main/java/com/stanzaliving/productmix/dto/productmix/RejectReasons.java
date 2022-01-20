package com.stanzaliving.productmix.dto.productmix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RejectReasons {
    private String label;

    private String value;

    private boolean checked;
}
