package com.stanzaliving.complaint.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ComplaintGroupDetailDto {
    private List<ComplaintInfo> complaintGroup;

    @Data
    public static class ComplaintInfo{
        private String uuid;
        private String label;
        private String key;
        private List<ComplaintInfo> value;
    }
}
