package com.stanzaliving.agreement.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Signature {
    private String type;
    private Config config;
}
