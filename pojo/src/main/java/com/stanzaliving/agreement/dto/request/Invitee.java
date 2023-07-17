package com.stanzaliving.agreement.dto.request;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Invitee {
    private String name;
    private String email;
    private String phone;
    private List<Signature> signatures;
}
