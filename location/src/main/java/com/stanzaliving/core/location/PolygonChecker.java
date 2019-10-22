package com.stanzaliving.core.location;

import com.stanzaliving.core.base.location.GeoPointDto;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PolygonChecker {

	 
	    public static boolean onSegment(GeoPointDto p, GeoPointDto q, GeoPointDto r)
	    {
	        if (q.getLat() <= Math.max(p.getLat(), r.getLat()) && q.getLat() >= Math.min(p.getLat(), r.getLat())
	                && q.getLon() <= Math.max(p.getLon(), r.getLon()) && q.getLon() >= Math.min(p.getLon(), r.getLon()))
	            return true;
	        return false;
	    }
	 
	    public static int orientation(GeoPointDto p, GeoPointDto q, GeoPointDto r)
	    {
	        double val = (q.getLon() - p.getLon()) * (r.getLat() - q.getLat()) - (q.getLat() - p.getLat()) * (r.getLon() - q.getLon());
	 
	        if (val == 0)
	            return 0;
	        return (val > 0) ? 1 : 2;
	    }
	 
	    public static boolean doIntersect(GeoPointDto p1, GeoPointDto q1, GeoPointDto p2, GeoPointDto q2)
	    {
	 
	        int o1 = orientation(p1, q1, p2);
	        int o2 = orientation(p1, q1, q2);
	        int o3 = orientation(p2, q2, p1);
	        int o4 = orientation(p2, q2, q1);
	 
	        if (o1 != o2 && o3 != o4)
	            return true;
	 
	        if (o1 == 0 && onSegment(p1, p2, q1))
	            return true;
	 
	        if (o2 == 0 && onSegment(p1, q2, q1))
	            return true;
	 
	        if (o3 == 0 && onSegment(p2, p1, q2))
	            return true;
	 
	        if (o4 == 0 && onSegment(p2, q1, q2))
	            return true;
	 
	        return false;
	    }
	 
	    public static boolean isInside(GeoPointDto polygon[], GeoPointDto p)
	    {
	        double INF = 10000;
	        if (polygon.length < 3)
	            return false;
	 
	        GeoPointDto extreme = new GeoPointDto(INF, p.getLon());
	 
	        int count = 0, i = 0;
	        do
	        {
	            int next = (i + 1) % polygon.length;
	            if (doIntersect(polygon[i], polygon[next], p, extreme))
	            {
	                if (orientation(polygon[i], p, polygon[next]) == 0)
	                    return onSegment(polygon[i], p, polygon[next]);
	 
	                count++;
	            }
	            i = next;
	        } while (i != 0);
	 
	        return (count & 1) == 1 ? true : false;
	    }
	 

}
