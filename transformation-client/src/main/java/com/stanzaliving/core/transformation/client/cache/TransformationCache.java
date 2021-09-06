package com.stanzaliving.core.transformation.client.cache;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

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
	private Map<String, CityMetadataDto> cityByUuidMap;
	private Map<String, MicroMarketMetadataDto> micromarketByUuidMap;
	private Map<String, ResidenceUIDto> residenceByUuidMap;
	private Map<String, ZoneMetadataDto> zoneByUuidMap;

	private LoadingCache<String, List<CityMetadataDto>> allCityCache = CacheBuilder.newBuilder()
			.expireAfterWrite(30, TimeUnit.MINUTES)
			.build(
					new CacheLoader<String, List<CityMetadataDto>>() {

						@Override
						public List<CityMetadataDto> load(String key) {
							List<CityMetadataDto> cities= internalDataControllerApi.getAllCities().getData();
							cityByUuidMap =cities.stream().collect(
									Collectors.toMap(CityMetadataDto::getUuid, Function.identity()));
							return cities;
						}
					});

	private LoadingCache<String, List<ZoneMetadataDto>> allZoneCache = CacheBuilder.newBuilder()
			.expireAfterWrite(30, TimeUnit.MINUTES)
			.build(
					new CacheLoader<String, List<ZoneMetadataDto>>() {

						@Override
						public List<ZoneMetadataDto> load(String key) {
							List<ZoneMetadataDto> zones= internalDataControllerApi.getAllZones().getData();
							zoneByUuidMap = zones.stream().collect(
									Collectors.toMap(ZoneMetadataDto::getUuid, Function.identity()));
							return zones;
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
							List<MicroMarketMetadataDto> micromarkets = internalDataControllerApi.getAllMicroMarkets().getData();
							micromarketByUuidMap = micromarkets.stream().collect(
									Collectors.toMap(MicroMarketMetadataDto::getUuid, Function.identity()));
							return micromarkets;
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
							List<ResidenceUIDto> residences= internalDataControllerApi.getResidenceDetailList().getData();
							residenceByUuidMap = residences.stream().collect(
									Collectors.toMap(ResidenceUIDto::getUuid, Function.identity()));
							return residences;
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


	private LoadingCache<String, Map<String,String>> allStatesNameToIdCache = CacheBuilder.newBuilder()
			.expireAfterWrite(30, TimeUnit.MINUTES)
			.build(
					new CacheLoader<String, Map<String,String>>() {

						@Override
						public Map<String,String> load(String key) {
							return internalDataControllerApi.getAllStates().getData().stream().collect(Collectors.toMap(f->f.getStateName().toLowerCase(), f->f.getUuid()));
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
	public Map<String,String> getStateNamesToIdCache() {
		return allStatesNameToIdCache.getUnchecked("stateNameToId");
	}
	public Map<String,String> getCountryNames() {
		return allCountryNameCache.getUnchecked("countryName");
	}
	public Map<String,String> getStateUuids() { return allStatesUuidCache.getUnchecked("stateName"); }

	public String getLocationNameOrElseEmptyString(String locType, String uuid) {
		String locationName = getLocationName(locType, uuid);
		if (Objects.isNull(locationName)) {
			locationName = "";
		}
		return locationName;
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

	public ResidenceUIDto getResidenceUIDtoByUuid (String residenceUuid) {
		Optional<ResidenceUIDto> residenceUIDtoOptional = getAllResidencesWithCoreData().stream().filter(dto -> dto.getUuid().equals(residenceUuid)).findFirst();
		return residenceUIDtoOptional.isPresent() ? residenceUIDtoOptional.get() : null;
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

	private LoadingCache<String, Map<String,String>> allStatesUuidCache = CacheBuilder.newBuilder()
			.expireAfterWrite(30, TimeUnit.MINUTES)
			.build(
					new CacheLoader<String, Map<String,String>>() {

						@Override
						public Map<String,String> load(String key) {
							return internalDataControllerApi.getAllStates().getData().stream().collect(Collectors.toMap(f->f.getStateName(), f->f.getUuid()));
						}
					});


	public CityMetadataDto getCityByUuid(String uuid){
		allCityCache.getUnchecked("city");
		return cityByUuidMap.get(uuid);
	}

	public MicroMarketMetadataDto getMicromarketByUuid(String uuid){
		allMicroMarketCache.getUnchecked("micromarket");
		return micromarketByUuidMap.get(uuid);
	}

	public ResidenceUIDto getResidenceByUuid(String uuid){
		allResidenceWithCoreCache.getUnchecked("residenceWithCore");
		return residenceByUuidMap.get(uuid);
	}

	public ZoneMetadataDto getZoneByUuid(String uuid){
		allZoneCache.getUnchecked("zone");
		return zoneByUuidMap.get(uuid);
	}

}