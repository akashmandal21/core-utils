package com.stanzaliving.core.sqljpa.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;

public interface AbstractJpaService<T extends AbstractJpaEntity, I extends Serializable> {

	T save(T entity);

	T saveAndFlush(T entity);

	T update(T entity);

	T updateAndFlush(T entity);

	List<T> save(Collection<T> entities);

	List<T> saveAll(Collection<T> entities);

	List<T> saveAndFlush(Collection<T> entities);

	List<T> update(Collection<T> entities);

	List<T> updateAndFlush(Collection<T> entities);

	long count();

	long countByStatus(boolean status);

	T find(I id);

	List<T> find(Collection<I> ids);

	List<T> findAll();

	List<T> findAll(Sort sort);

	Page<T> findAll(Pageable pageable);

	Page<T> findAllByStatus(boolean status, Pageable pageable);

	Page<T> findAll(Specification<T> spec, Pageable pageable);

	List<T> findAll(Specification<T> spec);

	List<T> findList(List<I> ids);

	List<T> findAllList();

	T findByUuid(String uuid);

	T findByUuidAndStatus(String uuid, boolean status);

	List<T> findByUuidIn(Collection<String> uuids);

	List<T> findByUuidInAndStatus(Collection<String> uuids, boolean status);

	void flush();

	void delete(T entity);

	void delete(Collection<T> entities);

	void deleteInBatch(Collection<T> entities);

	void delete(I id);

	void deleteAll();

	List<T> findAllByStatus(boolean status);

	Boolean existsByUuid(String uuid);

	Boolean existsByUuidAndStatus(String uuid, boolean status);

}