package com.stanzaliving.genericdashboard.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CampaignIdDto {

    private List<String> campaignId=new ArrayList<>();

}
