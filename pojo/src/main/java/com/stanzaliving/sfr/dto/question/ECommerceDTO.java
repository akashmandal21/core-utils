package com.stanzaliving.sfr.dto.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ECommerceDTO implements QuestionDetails {
    private String displayType;
    private String itemName;
    private String questionName;
    private String itemType;
    private String shortDescription;
    private String longDescription;
    private List<Object> tag;
    private Double mrp;
    private String itemMasterCode;
    private String ctaType;
    private List<Object> image;

}
