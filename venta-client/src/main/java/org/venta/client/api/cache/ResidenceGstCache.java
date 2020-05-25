package org.venta.client.api.cache;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.venta.client.api.VentaInternalDataControllerApi;
import org.venta.client.dto.ResidenceGstModel;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;




public class ResidenceGstCache {
	
	@Autowired
	VentaInternalDataControllerApi ventaInternalDataControllerApi;
	
	   private LoadingCache<String,Map<String,ResidenceGstModel>> allResdiencesGstDetails = CacheBuilder.newBuilder()
	            .build(
	                    new CacheLoader<String, Map<String,ResidenceGstModel>>() {
	                        @Override
	                        public Map<String,ResidenceGstModel> load(String key) {
	                        	List<ResidenceGstModel> resultMap =  ventaInternalDataControllerApi.getGstDetailsForResidences();
	                        	
	                        	return resultMap.stream().collect(
	                        		      Collectors.toMap
                      		            (item -> item.getResidenceUuid(),Function.identity()));
	                        }
	                    });
	   
	   public ResidenceGstModel getGstForAllResidences(String key) {
	        
		   try {
			   Map<String,ResidenceGstModel> resultMap = allResdiencesGstDetails.get("residence");
			return (ResidenceGstModel) resultMap.get(key);
		} catch (ExecutionException e) {
			return null;
			}
		   
	    }

}
