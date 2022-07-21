package com.stanzaliving.wanda.response;

import com.stanzaliving.core.complaint.dto.ComplaintFAQDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class FaqVideoDetailDto {

    private String faqName;
    private FaqInfo faqDetail;

    @Data
    public static class FaqInfo{
        private List<YoutubeVideoDetailDto> videoDataList;
        private List<ComplaintFAQDto> faqList;
    }

}
