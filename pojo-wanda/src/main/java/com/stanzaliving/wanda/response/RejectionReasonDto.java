package com.stanzaliving.wanda.response;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RejectionReasonDto {

    private String document;
    private String reason;

}
