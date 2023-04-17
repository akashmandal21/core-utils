/**
 * 
 */
package com.stanzaliving.core.redis.service.impl;

import com.stanzaliving.core.redis.service.RedisCollectionService;
import lombok.extern.log4j.Log4j2;
import org.redisson.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author naveen.kumar
 *
 * @date 21-Apr-2020
 *
 **/
@Log4j2
@Service
public class RedisCollectionServiceImpl implements RedisCollectionService {

	@Autowired
	private RedissonClient redissonClient;

	@Override
	public Map<String, String> getStringMap(String mapName) {

		log.debug("Fetching map: {} from redis", mapName);

		RMap<String, String> rMap = getRedisStringMap(mapName);

		Map<String, String> map = new HashMap<>();
		map.putAll(rMap);

		return map;
	}

	private RMap<String, String> getRedisStringMap(String mapName) {
		return redissonClient.getMap(mapName);
	}

	@Override
	public Map<String,String> getFromStringMap(String mapName, Set<String> keys) {

		log.debug("Fetching map: {} from redis", mapName);

		RMap<String,String> rMap = getRedisStringMap(mapName);

		Map<String,String> map = rMap.getAll(keys);

		if(map==null)
			return new HashMap<>();

		return map;

	}

	@Override
	public String getFromStringMap(String mapName, String key) {
		return getRedisStringMap(mapName).get(key);
	}

	@Override
	public String addInStringMap(String mapName, String key, String value) {

		log.debug("Adding key: {} with value: {} in map: {} on redis", key, value, mapName);

		return getRedisStringMap(mapName).put(key, value);
	}

	@Override
	public Set<String> getStringSet(String setName) {

		log.debug("Fetching set: {} from redis", setName);

		RSet<String> rSet = getRedisStringSet(setName);

		Set<String> set = new HashSet<>();
		set.addAll(rSet);

		return set;
	}

	private RSet<String> getRedisStringSet(String setName) {
		return redissonClient.getSet(setName);
	}

	@Override
	public boolean existsInStringSet(String setName, String key) {
		return getRedisStringSet(setName).contains(key);
	}

	@Override
	public boolean addInStringSet(String setName, String key) {

		log.debug("Adding key: {} in set: {} on redis", key, setName);

		return getRedisStringSet(setName).add(key);
	}

	@Override
	public Map<Object, Object> getObjectMap(String mapName) {
		log.debug("Fetching map: {} from redis", mapName);

		RMap<Object, Object> rMap = getRedisObjectMap(mapName);

		Map<Object, Object> map = new HashMap<>();
		map.putAll(rMap);

		return map;
	}

	private RMap<Object, Object> getRedisObjectMap(String mapName) {
		return redissonClient.getMap(mapName);
	}

	@Override
	public Object getFromObjectMap(String mapName, Object key) {
		return getRedisObjectMap(mapName).get(key);
	}

	@Override
	public Object addInObjectMap(String mapName, Object key, Object value) {
		log.debug("Adding key: {} with value: {} in map: {} on redis", key, value, mapName);

		return getRedisObjectMap(mapName).put(key, value);
	}

	@Override
	public Set<Object> getObjectSet(String setName) {
		log.debug("Fetching set: {} from redis", setName);

		RSet<Object> rSet = getRedisObjectSet(setName);

		Set<Object> set = new HashSet<>();
		set.addAll(rSet);

		return set;
	}

	private RSet<Object> getRedisObjectSet(String setName) {
		return redissonClient.getSet(setName);
	}

	@Override
	public boolean existsInObjectSet(String setName, Object key) {
		return getRedisObjectSet(setName).contains(key);
	}

	@Override
	public boolean addInObjectSet(String setName, Object key) {
		log.debug("Adding key: {} in set: {} on redis", key, setName);

		return getRedisObjectSet(setName).add(key);
	}

	@Override
	public void clearMap(String mapName) {
		redissonClient.getMap(mapName).clear();
	}

	@Override
	public Map<String, String> getStringMapCache(String mapName) {

		log.debug("Fetching map: {} from redis", mapName);

		RMap<String, String> rMap = getRedisStringMapCache(mapName);

		Map<String, String> map = new HashMap<>();
		map.putAll(rMap);

		return map;
	}

	private RMapCache<String, String> getRedisStringMapCache(String mapName) {
		return redissonClient.getMapCache(mapName);
	}

	@Override
	public Object getFromMap(String mapName, String key) {
		return redissonClient.getMapCache(mapName).get(key);
	}

	@Override
	public boolean putToMap(String mapName, String key, Object value, long ttl, TimeUnit timeUnit) {
		Object object = redissonClient.getMapCache(mapName).put(key, value, ttl, timeUnit);
		return Objects.nonNull(object);
	}

	@Override
	public String getFromStringMapCache(String mapName, String key) {
		return getRedisStringMapCache(mapName).get(key);
	}

	@Override
	public boolean existsInStringMapCache(String mapName, String key) {
		return getRedisStringMapCache(mapName).containsKey(key);
	}

	@Override
	public void removeFromStringMapCache(String mapName, String key) {
		log.info("Removing key: {} from map: {} from redis",key,mapName);
		redissonClient.getMapCache(mapName).remove(key);
	}

	@Override
	public void removeFromStringMap(String mapName, String key) {
		log.info("Removing key: {} from map: {} from redis",key,mapName);
		redissonClient.getMap(mapName).remove(key);
	}

	@Override
	public boolean addInStringList(String listName, String key) {
		log.debug("Adding key: {} in list: {} on redis", key, listName);

		return getRedisStringList(listName).add(key);
	}

	@Override
	public boolean removeFromStringList(String listName, String key) {
		log.info("Removing key: {} from list: {} from redis",key,listName);

		return getRedisStringList(listName).remove(key);
	}

	@Override
	public List<String> getStringList(String listName) {
		log.info("Returning String List from redis for list name:{}",listName);
		RList<String> redisStringList = getRedisStringList(listName);
		return new ArrayList<>(redisStringList);
	}

	@Override
	public boolean existsInStringList(String listName, String key) {
		log.info("Checking for key:{} in list :{} in redis",key,listName);
		return getRedisStringList(listName).contains(key);
	}

	private RList<String> getRedisStringList(String listName) {
		return redissonClient.getList(listName);
	}

	@Override
	public String addInStringMapCache(String mapName, String key, String value, long ttl, TimeUnit timeUnit) {

		log.info("Adding key: {} with value: {} in map: {} on redis with TTL {} {}", key, value, mapName, ttl, timeUnit);

		return getRedisStringMapCache(mapName).put(key, value, ttl, timeUnit);
	}

}