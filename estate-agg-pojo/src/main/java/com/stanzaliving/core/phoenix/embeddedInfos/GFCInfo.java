package com.stanzaliving.core.phoenix.embeddedinfos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GFCInfo implements Comparable<GFCInfo>{
    private String gfcUuid;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
    private LocalDate scheduledDueDate;
    private String gfcStatus; //Changed from GFCStatus enum to String
    private LocalDate dueDate;
    private Integer version;

    public GFCInfo(String gfcUuid){
        this.gfcUuid=gfcUuid;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + gfcUuid.hashCode();

        return result;
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        GFCInfo other = (GFCInfo) obj;
        if(this.gfcUuid.equals(other.getGfcUuid()))
            return true;

        return false;
    }

    @Override
    public int compareTo(GFCInfo o) {
       return this.getVersion().compareTo(o.getVersion());
    }
}
