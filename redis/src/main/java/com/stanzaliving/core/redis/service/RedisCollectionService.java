package com.stanzaliving.core.redis.service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public interface RedisCollectionService {

	Map<String, String> getStringMap(String mapName);

	Map<String,String> getFromStringMap(String mapName, Set<String> keys);

	String getFromStringMap(String mapName, String key);

	String addInStringMap(String mapName, String key, String value);

	Set<String> getStringSet(String setName);

	boolean existsInStringSet(String setName, String key);

	boolean addInStringSet(String setName, String key);

	Map<Object, Object> getObjectMap(String mapName);

	Object getFromObjectMap(String mapName, Object key);

	Object addInObjectMap(String mapName, Object key, Object value);

	Set<Object> getObjectSet(String setName);

	boolean existsInObjectSet(String setName, Object key);

	boolean addInObjectSet(String setName, Object key);

	void clearMap(String mapName);

	Map<String, String> getStringMapCache(String mapName);

	boolean putToMap(String mapName, String key, Object value, long ttl, TimeUnit timeUnit);

	Object getFromMap(String mapName, String key);

	String getFromStringMapCache(String mapName, String key);

	String addInStringMapCache(String mapName, String key, String value, long ttl, TimeUnit timeUnit);

	boolean existsInStringMapCache(String mapName, String key);

	void removeFromStringMapCache(String mapName, String key);

	void removeFromStringMap(String mapName, String key);

	boolean addInStringList(String listName, String key);

	boolean removeFromStringList(String listName, String key);

	List<String> getStringList(String listName);

	boolean existsInStringList(String listName , String key);
}