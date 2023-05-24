package com.stanzaliving.website.request.dto;

import com.stanzaliving.core.enums.LookingFor;
import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ContactUsDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int contactUsId;

    private String firstName;

    private String lastName;

    private String email;

    private String mobile;

    private String message;

    private LookingFor lookingFor;

}
