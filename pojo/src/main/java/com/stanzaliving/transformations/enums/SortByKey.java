package com.stanzaliving.transformations.enums;

import lombok.Getter;

/**
 * @author dhruv.mathur
 * @date 19/04/21
 */
@Getter
public enum SortByKey {
    micromarket_name("m.micromarket_name"),stanza_cluster_name("cl.stanza_cluster_name"),city_name("c.city_name"),stanza_city("sc.stanza_city_name"),residences("recidencies"),last_updated("updated_at"),status("status"),
    zone_name("z.zone_name"), stanza_cluster_count("stanza_clusters"),  ;
    private String label;

    SortByKey(String s) {this.label=s;
    }
}
