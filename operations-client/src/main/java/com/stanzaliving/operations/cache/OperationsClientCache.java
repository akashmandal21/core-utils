package com.stanzaliving.operations.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.operations.dto.ServiceMixDto;
import com.stanzaliving.operations.client.OperationsClientApi;
import lombok.extern.log4j.Log4j2;

import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @author Vikas S T
 * @date 07-Feb-22
 **/

@Log4j2
public class OperationsClientCache {
    private final OperationsClientApi operationsClientApi;
    private final LoadingCache<String, Optional<ServiceMixDto>> serviceMixCache = CacheBuilder.newBuilder()
            .expireAfterWrite(30, TimeUnit.MINUTES)
            .build(
                    new CacheLoader<String, Optional<ServiceMixDto>>() {

                        @Override
                        public Optional<ServiceMixDto> load(String key) {
                            try {
                                ResponseDto<ServiceMixDto> responseDto = operationsClientApi.getHKCurrentServiceMix(key,"HK");

                                if (Objects.nonNull(responseDto) && responseDto.isStatus() && Objects.nonNull(responseDto.getData())) {
                                    return Optional.ofNullable(responseDto.getData());
                                }
                            } catch (Exception e) {
                                log.error("Unable to get User Profile by userUuid" + key, e);
                            }
                            return Optional.ofNullable(null);
                        }
                    });

    public OperationsClientCache(OperationsClientApi operationsClientApi) {
        this.operationsClientApi = operationsClientApi;
    }

    public ServiceMixDto getHKServiceMixDto(String residenceUuid) {
        try {
            Optional<ServiceMixDto> optionalServiceMixDto = serviceMixCache.getUnchecked(residenceUuid);
            return optionalServiceMixDto.isPresent() ? optionalServiceMixDto.get() : null;
        } catch (Exception e) {
            log.error("Unable to get ServiceMixDto from uuid {}", residenceUuid, e);
            return null;
        }
    }
}
