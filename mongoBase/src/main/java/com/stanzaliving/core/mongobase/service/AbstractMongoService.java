package com.stanzaliving.core.mongobase.service;

import com.stanzaliving.core.mongobase.entity.AbstractMongoEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface AbstractMongoService <T extends AbstractMongoEntity, I extends Serializable> {

	T save(T entity);

	List<T> save(Iterable<T> entities);

	List<T> saveAll(Iterable<T> entities);

	T insert(T entity);

	List<T> insert(Collection<T> entities);

	T find(I id);

	List<T> findAll();

	T findByUuid(String uuid);

	List<T> findByUuidIn(Collection<String> uuids);

	boolean delete(T entity);

	void delete(I id);
}
