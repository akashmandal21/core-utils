package com.stanzaliving.transformations.projections;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StanzaGstView {
    private String gstin;
    private String gstStateId;
    private String gstState;
    private String address;
}
