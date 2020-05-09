package com.stanzaliving.core.transformation.client.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.transformation.client.api.InternalDataControllerApi;
import com.stanzaliving.transformations.pojo.CityMetadataDto;
import com.stanzaliving.transformations.pojo.MicroMarketMetadataDto;
import com.stanzaliving.transformations.pojo.ResidenceMetadataDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class TransformationCache {

    @Autowired
    InternalDataControllerApi internalDataControllerApi;

    private LoadingCache<String, List<CityMetadataDto>> allCityCache = CacheBuilder.newBuilder()
            .expireAfterWrite(30, TimeUnit.MINUTES)
            .build(
                    new CacheLoader<String, List<CityMetadataDto>>() {
                        @Override
                        public List<CityMetadataDto> load(String key) {
                            return internalDataControllerApi.getAllCities().getData();
                        }
                    });

    public List<CityMetadataDto> getAllCities() {
        return allCityCache.getUnchecked("city");
    }


    private LoadingCache<String, List<MicroMarketMetadataDto>> allMicroMarketCache = CacheBuilder.newBuilder()
            .expireAfterWrite(30, TimeUnit.MINUTES)
            .build(
                    new CacheLoader<String, List<MicroMarketMetadataDto>>() {
                        @Override
                        public List<MicroMarketMetadataDto> load(String key) {
                            return internalDataControllerApi.getAllMicroMarkets().getData();
                        }
                    });

    public List<MicroMarketMetadataDto> getAllMicroMarkets() {
        return allMicroMarketCache.getUnchecked("micromarket");
    }


    private LoadingCache<String, List<ResidenceMetadataDto>> allResidenceCache = CacheBuilder.newBuilder()
            .expireAfterWrite(30, TimeUnit.MINUTES)
            .build(
                    new CacheLoader<String, List<ResidenceMetadataDto>>() {
                        @Override
                        public List<ResidenceMetadataDto> load(String key) {
                            return internalDataControllerApi.getAllResidences().getData();
                        }
                    });

    public List<ResidenceMetadataDto> getAllResidences() {
        return allResidenceCache.getUnchecked("residence");
    }

    //It shouldn't be done this way, especially iterating part
    public String getAccessLevelNameByUuid(String uuid, String accessLevel) {

        String name = "";

        if (StringUtils.isNotBlank(uuid)) {
            AccessLevel level = AccessLevel.valueOf(accessLevel);
            switch (level) {
                case CITY:
                    Optional<CityMetadataDto> cityMetadataDtoOptional = getAllCities().stream().filter(entity -> entity.getUuid().equals(uuid)).findFirst();
                    name = cityMetadataDtoOptional.isPresent() ? cityMetadataDtoOptional.get().getCityName() : "";
                    break;

                case MICROMARKET:
                    Optional<MicroMarketMetadataDto> microMarketMetadataDtoOptional = getAllMicroMarkets().stream().filter(entity -> entity.getUuid().equals(uuid)).findFirst();
                    name = microMarketMetadataDtoOptional.isPresent() ? microMarketMetadataDtoOptional.get().getMicroMarketName() : "";
                    break;

                case RESIDENCE:
                    Optional<ResidenceMetadataDto> residenceMetadataDtoOptional = getAllResidences().stream().filter(entity -> entity.getUuid().equals(uuid)).findFirst();
                    name = residenceMetadataDtoOptional.isPresent() ? residenceMetadataDtoOptional.get().getResidenceName() : "";
                    break;

                default:
                    break;
            }
        }

        return name;
    }




}
