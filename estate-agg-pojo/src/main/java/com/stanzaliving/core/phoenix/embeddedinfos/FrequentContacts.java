package com.stanzaliving.core.phoenix.embeddedinfos;

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
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + freqContactUuid.hashCode();
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

        FrequentContacts other = (FrequentContacts) obj;
        if(this.freqContactUuid.equals(other.getFreqContactUuid()))
            return true;

        return false;
    }
}

