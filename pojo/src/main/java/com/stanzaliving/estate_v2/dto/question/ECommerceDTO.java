package com.stanzaliving.estate_v2.dto.question;

import com.stanzaliving.estate_v2.enumeration.question.ECommerceDisplayType;
import com.stanzaliving.estate_v2.enumeration.question.eCommerce.CTAType;
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
    private String shortDescription;
    private String longDescription;
    private List<Object> tag;
    private Double sellingPrice;
    private Double mrp;
    private String itemMasterCode;
    private String ctaType;
    private List<Object> image;

}
