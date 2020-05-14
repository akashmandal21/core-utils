package org.venta.client.api.cache;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.venta.client.api.VentaInternalDataControllerApi;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;




public class ResidenceGstCache {
	
	VentaInternalDataControllerApi ventaInternalDataControllerApi;
	
	   private LoadingCache<String,Map> allResdiencesGstDetails = CacheBuilder.newBuilder()
	            .build(
	                    new CacheLoader<String, Map>() {
	                        @Override
	                        public Map load(String key) {
	                        	List<Map> resultMap =  ventaInternalDataControllerApi.getGstDetailsForResidences().getData();
	                        	
	                        	return resultMap.stream().collect(
	                        		      Collectors.toMap
                      		            (item -> item.get("residenceUuid"),Function.identity()));
	                        }
	                    });
	   
	   public Map getGstForAllResidences(String key) {
	        
		   return (Map) allResdiencesGstDetails.getUnchecked("residenceUuid").get(key);
	    }

}
