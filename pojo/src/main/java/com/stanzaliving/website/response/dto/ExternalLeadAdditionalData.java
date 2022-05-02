package com.stanzaliving.website.response.dto;

import lombok.Data;

import java.util.Map;

@Data
public class ExternalLeadAdditionalData {

    private Map<String, String> additionalInfo;

}