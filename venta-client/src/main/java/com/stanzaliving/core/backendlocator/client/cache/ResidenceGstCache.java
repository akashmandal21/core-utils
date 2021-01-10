package com.stanzaliving.core.backendlocator.client.cache;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.stanzaliving.core.backendlocator.client.api.VentaClientApi;
import com.stanzaliving.core.backendlocator.client.dto.ResidenceGstDto;

import lombok.extern.log4j.Log4j2;


// cache for storing gst details of residences present in venta
@Log4j2
public class ResidenceGstCache {
	
	@Autowired
	VentaClientApi ventaInternalDataControllerApi;
	
	// load residence gst details in cache
	   private LoadingCache<String,Map<String,ResidenceGstDto>> allResdiencesGstDetails = CacheBuilder.newBuilder()
			   .expireAfterWrite(3, TimeUnit.HOURS) 
			   .build(
	                    new CacheLoader<String, Map<String,ResidenceGstDto>>() {
	                        @Override
	                        public Map<String,ResidenceGstDto> load(String key) {
	                        	List<ResidenceGstDto> resultMap =  ventaInternalDataControllerApi.getGstDetailsForResidences();
	                        	
	                        	return resultMap.stream().collect(
	                        		      Collectors.toMap
                      		            (item -> item.getResidenceUuid(),Function.identity()));
	                        }
	                    });
	   
	   // get gst details for particular residence
	   public ResidenceGstDto getGstForAllResidences(String key) {
	        
		   try {
			   Map<String,ResidenceGstDto> resultMap = allResdiencesGstDetails.get("residence");
			return (ResidenceGstDto) resultMap.get(key);
		} catch (ExecutionException e) {
			log.error("Error occurred while fetching gst details for residence ", key, e);
			return null;
			}
		   
	    }

}
