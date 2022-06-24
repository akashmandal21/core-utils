package com.stanzaliving.legal_v2.DTO.Document;

import com.stanzaliving.agreement.dto.request.EstateInvitee;
import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LeegalityRequestDTO {
    private String profileId;
    private File file;
    private String stampSeries;
    private String seriousGroup;
    private String stampValue;
    private Map<String,Object> nesl;
    private List<EstateInvitee> invitees;
    private List<Object> cc;
    private String irn;
}
