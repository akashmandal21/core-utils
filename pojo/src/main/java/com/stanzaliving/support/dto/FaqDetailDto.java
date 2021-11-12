package com.stanzaliving.support.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Table;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "faq_detail")
@Getter
@Setter
public class FaqDetailDto  {
    private String question;
    private String answer;
    private Integer sequence;
    private boolean visible;
    @JsonIgnore
    private String faqUuid;
    private String uuid;

}
