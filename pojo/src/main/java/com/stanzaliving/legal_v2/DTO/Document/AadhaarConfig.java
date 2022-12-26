package com.stanzaliving.legal_v2.DTO.Document;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class AadhaarConfig {
    private Boolean verifyName;
    private String verifyTitle;
}
