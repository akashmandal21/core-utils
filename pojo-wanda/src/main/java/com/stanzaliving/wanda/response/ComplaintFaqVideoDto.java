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
public class ComplaintFaqVideoDto {
        private String uuid;
        private String name;
        private String description;
        private String imgUrl;
        private List<ComplaintFAQDto> faqList;
        private List<SupportVideoDto> videoDataList;
}
