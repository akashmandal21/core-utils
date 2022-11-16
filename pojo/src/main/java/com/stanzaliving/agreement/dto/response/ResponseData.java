package com.stanzaliving.agreement.dto.response;

import com.stanzaliving.agreement.dto.request.EstateInvitee;
import com.stanzaliving.agreement.dto.request.Invitee;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData {
    private String documentId;
    private String irn;
    private List<EstateInvitee> invitees;
}
