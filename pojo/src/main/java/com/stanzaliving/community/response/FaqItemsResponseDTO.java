package com.stanzaliving.community.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FaqItemsResponseDTO {

    private Long id;
    private String uuid;
    private String sortOrder;
    private String question;
    private String answer;

}
