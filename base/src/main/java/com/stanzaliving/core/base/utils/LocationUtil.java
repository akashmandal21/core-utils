/**
 * 
 */
package com.stanzaliving.core.base.utils;

import lombok.experimental.UtilityClass;
import org.apache.lucene.util.SloppyMath;

/**
 * @author naveen.kumar
 *
 * @date 18-Aug-2021
 *
 **/
@UtilityClass
public class LocationUtil {

	public double calculateDistanceMeters(double userLat, double userLng, double venueLat, double venueLng) {
		return Math.abs(SloppyMath.haversinMeters(userLat, userLng, venueLat, venueLng));
	}
}