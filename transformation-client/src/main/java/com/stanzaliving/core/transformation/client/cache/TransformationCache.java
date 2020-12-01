package com.stanzaliving.core.transformation.client.cache;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

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

	public List<CityMetadataDto> getAllCities() {
		return allCityCache.getUnchecked("city");
	}

	public List<ZoneMetadataDto> getAllZones() {
		return allZoneCache.getUnchecked("zone");
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


	private LoadingCache<String, Map<String,String>> allStatesNameCache = CacheBuilder.newBuilder()
			.expireAfterWrite(30, TimeUnit.MINUTES)
			.build(
					new CacheLoader<String, Map<String,String>>() {

						@Override
						public Map<String,String> load(String key) {
							return internalDataControllerApi.getAllStates().getData().stream().collect(Collectors.toMap(f->f.getUuid(), f->f.getStateName()));
						}
					});

	private LoadingCache<String, Map<String,String>> allCityNameCache = CacheBuilder.newBuilder()
			.expireAfterWrite(30, TimeUnit.MINUTES)
			.build(
					new CacheLoader<String, Map<String,String>>() {

						@Override
						public Map<String,String> load(String key) {
							return internalDataControllerApi.getAllCities().getData().stream().collect(Collectors.toMap(f->f.getUuid(),f->f.getCityName()));
						}
					});

	private LoadingCache<String, Map<String,String>> allMicromarketNameCache = CacheBuilder.newBuilder()
			.expireAfterWrite(30, TimeUnit.MINUTES)
			.build(
					new CacheLoader<String, Map<String,String>>() {

						@Override
						public Map<String,String> load(String key) {
							return internalDataControllerApi.getAllMicroMarkets().getData().stream().collect(Collectors.toMap(f->f.getUuid(),f->f.getMicroMarketName()));
						}
					});


	private LoadingCache<String, Map<String,String>> allCountryNameCache = CacheBuilder.newBuilder()
			.expireAfterWrite(30, TimeUnit.MINUTES)
			.build(
					new CacheLoader<String, Map<String,String>>() {

						@Override
						public Map<String,String> load(String key) {
							return internalDataControllerApi.getAllCountries().getData().stream().collect(Collectors.toMap(f->f.getUuid(),f->f.getCountryName()));
						}
					});

	public Map<String,String> getCityNames() {
		return allCityNameCache.getUnchecked("cityName");
	}
	public Map<String,String> getMicromarketNames() {
		return allMicromarketNameCache.getUnchecked("micromarketName");
	}
	public Map<String,String> getStateNames() {
		return allStatesNameCache.getUnchecked("stateName");
	}
	public Map<String,String> getCountryNames() {
		return allCountryNameCache.getUnchecked("countryName");
	}

	public String getLocationName(String locType, String uuid){
		switch (locType){
			case "cityName":
				return getCityNames().get(uuid);

			case "micromarketName":
				return getMicromarketNames().get(uuid);

			case "stateName":
				return getStateNames().get(uuid);

			case "countryName":
				return getCountryNames().get(uuid);

			default:
				return "";
		}
	}

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

				default:
					break;
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

				default:
					break;
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