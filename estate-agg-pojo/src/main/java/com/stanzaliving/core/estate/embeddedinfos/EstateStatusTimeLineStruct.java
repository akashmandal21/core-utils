package com.stanzaliving.core.estate.embeddedinfos;

import com.stanzaliving.core.estate.enums.EstateStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstateStatusTimeLineStruct implements Comparable<EstateStatusTimeLineStruct> {
    private String estateStatus;
    private String statusTrackerUuid;
    private Date createdAt;
    private String createdBy;
    private Boolean status=true;

    @Override
    public int compareTo(EstateStatusTimeLineStruct o) {
        if(o.getCreatedAt()==null)
            return -1;
        return this.getCreatedAt().compareTo(o.getCreatedAt());
    }
}
