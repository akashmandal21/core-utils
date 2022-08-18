package com.stanzaliving.support.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FaqListingResponse {
    private FaqResponse approved;
    private FaqResponse pendingApproval;
    private FaqResponse rejected;
    private FaqResponse inDraft;
}
