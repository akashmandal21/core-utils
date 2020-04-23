package com.stanzaliving.core.phoenix.embeddedInfos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FrequentContacts implements Comparable<FrequentContacts>{
    String freqContactUuid;
    String contactUuid;
    Boolean vendor;
    Integer numHits;

    @Override
    public int compareTo(FrequentContacts o) {
        return this.numHits.compareTo(o.getNumHits());
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        FrequentContacts other = (FrequentContacts) obj;
        if(this.freqContactUuid.equals(other.getFreqContactUuid()))
            return true;

        return false;
    }
}

