package com.stanzaliving.core.transformation.client.cache;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import com.stanzaliving.core.user.acl.enums.AccessLevelEntityEnum;
import com.stanzaliving.transformations.pojo.*;
import org.apache.commons.lang3.StringUtils;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.transformation.client.api.InternalDataControllerApi;

public class TransformationCache {

	private InternalDataControllerApi internalDataControllerApi;

	public TransformationCache(InternalDataControllerApi internalDataControllerApi) {
		this.internalDataControllerApi = internalDataControllerApi;
	}

	private LoadingCache<String, List<CityMetadataDto>> allCityCache = CacheBuilder.newBuilder()
			.expireAfterWrite(30, TimeUnit.MINUTES)
			.build(
					new CacheLoader<String, List<CityMetadataDto>>() {

						@Override
						public List<CityMetadataDto> load(String key) {
							return internalDataControllerApi.getAllCities().getData();
						}
					});


	private LoadingCache<String, List<ZoneMetadataDto>> allZoneCache = CacheBuilder.newBuilder()
			.expireAfterWrite(30, TimeUnit.MINUTES)
			.build(
					new CacheLoader<String, List<ZoneMetadataDto>>() {

						@Override
						public List<ZoneMetadataDto> load(String key) {
							return internalDataControllerApi.getAllZones().getData();
						}
					});

	private LoadingCache<AccessLevel, List<LocationDto>> allLocationsCache = CacheBuilder.newBuilder()
			.expireAfterWrite(5, TimeUnit.MINUTES)
			.build(
					new CacheLoader<AccessLevel, List<LocationDto>>() {

						@Override
						public List<LocationDto> load(AccessLevel accessLevel) {
							return internalDataControllerApi.getAllLocationsDtoList(accessLevel).getData();
						}
					});

	public List<CityMetadataDto> getAllCities() {
		return allCityCache.getUnchecked("city");
	}

	public List<ZoneMetadataDto> getAllZones() {
		return allZoneCache.getUnchecked("zone");
	}

	public List<LocationDto> getAllLocations(AccessLevel accessLevel) {
		return allLocationsCache.getUnchecked(accessLevel);
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


	private LoadingCache<String, List<ResidenceUIDto>> allResidenceWithCoreCache = CacheBuilder.newBuilder()
			.expireAfterWrite(30, TimeUnit.MINUTES)
			.build(
					new CacheLoader<String, List<ResidenceUIDto>>() {

						@Override
						public List<ResidenceUIDto> load(String key) {
							return internalDataControllerApi.getResidenceDetailList().getData();
						}
					});

	public List<ResidenceUIDto> getAllResidencesWithCoreData() {
		return allResidenceWithCoreCache.getUnchecked("residenceWithCore");
	}

	// It shouldn't be done this way, especially iterating part
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

				case COUNTRY:
					if (uuid.equals(AccessLevelEntityEnum.INDIA.getUuid())) {
						name = AccessLevelEntityEnum.INDIA.toString();
					}
					break;

				default:
					break;
			}
			if (AccessLevel.locationAccessLevelList.contains(level)) {
				Optional<LocationDto> locationDtoOptional = getAllLocations(level).stream().filter(entity -> entity.getUuid().equals(uuid)).findFirst();
				name = locationDtoOptional.isPresent() ? locationDtoOptional.get().getLocationName() : "";
			}
		}

		return name;
	}

	// It shouldn't be done this way, especially iterating part
	public String getUuidByAccessLevelName(String accessLevelName, String accessLevel) {

		String uuid = "";

		if (StringUtils.isNotBlank(accessLevelName)) {
			AccessLevel level = AccessLevel.valueOf(accessLevel);
			switch (level) {
				case CITY:
					Optional<CityMetadataDto> cityMetadataDtoOptional = getAllCities().stream().filter(entity -> entity.getCityName().equals(accessLevelName)).findFirst();
					uuid = cityMetadataDtoOptional.isPresent() ? cityMetadataDtoOptional.get().getUuid() : "";
					break;

				case MICROMARKET:
					Optional<MicroMarketMetadataDto> microMarketMetadataDtoOptional = getAllMicroMarkets().stream().filter(entity -> entity.getMicroMarketName().equals(accessLevelName)).findFirst();
					uuid = microMarketMetadataDtoOptional.isPresent() ? microMarketMetadataDtoOptional.get().getUuid() : "";
					break;

				case RESIDENCE:
					Optional<ResidenceMetadataDto> residenceMetadataDtoOptional = getAllResidences().stream().filter(entity -> entity.getResidenceName().equals(accessLevelName)).findFirst();
					uuid = residenceMetadataDtoOptional.isPresent() ? residenceMetadataDtoOptional.get().getUuid() : "";
					break;

				case COUNTRY:
					if (accessLevelName.equals(AccessLevelEntityEnum.INDIA.toString())) {
						uuid = AccessLevelEntityEnum.INDIA.getUuid();
					}
					break;

				default:
					break;
			}
			if (AccessLevel.locationAccessLevelList.contains(level)) {
				Optional<LocationDto> locationDtoOptional = getAllLocations(level).stream().filter(dto -> dto.getLocationName().equals(accessLevelName)).findFirst();
				uuid = locationDtoOptional.isPresent() ? locationDtoOptional.get().getUuid() : "";
			}
		}

		return uuid;
	}

	public ResidenceDto getResidenceDataFromUuid(String residenceUuid) {
		return internalDataControllerApi.getResidenceData(residenceUuid).getData();
	}

	public MicroMarketMetadataDto getMicromarketDataFromUuid(String micromarketUuid) {
		return internalDataControllerApi.getMicromarketData(micromarketUuid).getData();
	}

}