package com.stanzaliving.transformations.projections;

import lombok.*;

import javax.persistence.Column;

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
