package com.stanzaliving.transformations.enums;

import lombok.Getter;

/**
 * @author dhruv.mathur
 * @date 19/04/21
 */
@Getter
public enum SortByKey {

	city_name("c.city_name"),
	zone_name("z.zone_name"),
	stanza_city_name("sc.stanza_city_name"),
	stanza_cluster_name("scl.stanza_cluster_name"),
	micromarket_name("m.micromarket_name"),
	stanza_cluster_count("stanza_clusters"),
	stanza_city_count("stanza_cities"),
	micromarket_count("micromarkets"),
	residencies_count("residencies"),
	last_updated("updated_at"),
	status("status");


	private String label;

	SortByKey(String s) {
		this.label = s;
	}
}
