package com.stanzaliving.estate_v2.dto.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class HelperImageDto implements Serializable {
    private String imageCaption;
    private String imageAlignment;
    private String imageLink;
}
