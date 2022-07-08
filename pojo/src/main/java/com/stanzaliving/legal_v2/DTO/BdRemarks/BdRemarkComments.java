package com.stanzaliving.legal_v2.DTO.BdRemarks;

import lombok.*;
import java.util.Date;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BdRemarkComments {

    private String commentBy;

    private String commentTimeText;

    private String commentTitle;

    private String commentText;

    private Date commentDateTime;

}
