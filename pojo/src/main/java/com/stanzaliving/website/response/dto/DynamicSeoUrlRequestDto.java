package com.stanzaliving.website.response.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DynamicSeoUrlRequestDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private long dynamicSeoUrlId;
    private String dynamicSeoUrl;
    private String dynamicSeoTitle;
    private String dynamicSeoDescription;
    private String pageDescription;
    private boolean status;
    private boolean locationCheck;
}
