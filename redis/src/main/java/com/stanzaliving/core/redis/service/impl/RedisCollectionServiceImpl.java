/**
 * 
 */
package com.stanzaliving.core.redis.service.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.redisson.api.RMap;
import org.redisson.api.RSet;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stanzaliving.core.redis.service.RedisCollectionService;

import lombok.extern.log4j.Log4j2;

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
	public String getFromStringMap(String mapName, String key) {
		return getStringMap(mapName).get(key);
	}

	@Override
	public String addInStringMap(String mapName, String key, String value) {

		log.debug("Adding key: {} with value: {} in map: {} on redis", key, value, mapName);

		return getStringMap(mapName).put(key, value);
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

}