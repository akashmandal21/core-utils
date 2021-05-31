package com.stanzaliving.transformations.enums;

import lombok.Getter;

/**
 * @author dhruv.mathur
 * @date 19/04/21
 */
@Getter
public enum SortByKey {

	geographicalCityName("c.city_name"),
	zoneName("z.zone_name"),
	stanzaCityName("sc.stanza_city_name"),
	stanzaClusterName("scl.stanza_cluster_name"),
	geographicalClusterName("m.micromarket_name"),
	stanzaCluster("stanza_clusters"),
	stanzaCity("stanza_cities"),
	geographicalCluster("micromarkets"),
	residences("residencies"),
	lastUpdated("updated_at"),
	status("status");


	private String label;

	SortByKey(String s) {
		this.label = s;
	}
}
