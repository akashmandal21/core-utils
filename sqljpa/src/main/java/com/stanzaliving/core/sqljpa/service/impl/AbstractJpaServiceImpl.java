package com.stanzaliving.core.sqljpa.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import com.google.common.collect.Lists;
import com.stanzaliving.core.sqljpa.entity.AbstractJpaEntity;
import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.core.sqljpa.service.AbstractJpaService;

public abstract class AbstractJpaServiceImpl<T extends AbstractJpaEntity, I extends Serializable, R extends AbstractJpaRepository<T, I>>
		implements AbstractJpaService<T, I> {

	protected abstract R getJpaRepository();

	@Override
	public T save(T entity) {
		return getJpaRepository().save(entity);
	}

	@Override
	public T saveAndFlush(T entity) {
		return getJpaRepository().saveAndFlush(entity);
	}

	@Override
	public T update(T entity) {
		return getJpaRepository().save(entity);
	}

	@Override
	public T updateAndFlush(T entity) {
		return getJpaRepository().saveAndFlush(entity);
	}

	@Override
	public List<T> save(Collection<T> entities) {
		return getJpaRepository().saveAll(entities);
	}

	@Override
	public List<T> saveAll(Collection<T> entities) {
		return getJpaRepository().saveAll(entities);
	}

	@Override
	public List<T> saveAndFlush(Collection<T> entities) {
		List<T> savedEntities = getJpaRepository().saveAll(entities);
		getJpaRepository().flush();

		return savedEntities;
	}

	@Override
	public List<T> update(Collection<T> entities) {
		return getJpaRepository().saveAll(entities);
	}

	@Override
	public List<T> updateAndFlush(Collection<T> entities) {
		List<T> updatedEntities = getJpaRepository().saveAll(entities);
		getJpaRepository().flush();

		return updatedEntities;
	}

	@Override
	public long count() {
		return getJpaRepository().count();
	}

	@Override
	public long countByStatus(boolean status) {
		return getJpaRepository().countByStatus(status);
	}

	@Override
	public T find(I id) {
		return getJpaRepository().findById(id).orElse(null);
	}

	@Override
	public List<T> find(Collection<I> ids) {
		return getJpaRepository().findAllById(ids);
	}

	@Override
	public List<T> findAll() {
		return getJpaRepository().findAll();
	}

	@Override
	public List<T> findAll(Sort sort) {
		return getJpaRepository().findAll(sort);
	}

	@Override
	public Page<T> findAll(Pageable pageable) {
		return getJpaRepository().findAll(pageable);
	}

	@Override
	public Page<T> findAllByStatus(boolean status, Pageable pageable) {
		return getJpaRepository().findByStatus(status, pageable);
	}

	@Override
	public List<T> findAllByStatus(boolean status) {
		return getJpaRepository().findByStatus(status);
	}

	@Override
	public Page<T> findAll(Specification<T> spec, Pageable pageable) {
		return getJpaRepository().findAll(spec, pageable);
	}

	@Override
	public List<T> findAll(Specification<T> spec) {
		return getJpaRepository().findAll(spec);
	}

	@Override
	public List<T> findList(List<I> ids) {
		return Lists.newArrayList(getJpaRepository().findAllById(ids));
	}

	@Override
	public List<T> findAllList() {
		return Lists.newArrayList(getJpaRepository().findAll());
	}

	@Override
	public T findByUuid(String uuid) {
		return getJpaRepository().findFirstByUuid(uuid);
	}

	@Override
	public T findByUuidAndStatus(String uuid, boolean status) {
		return getJpaRepository().findFirstByUuidAndStatus(uuid, status);
	}

	@Override
	public List<T> findByUuidIn(Collection<String> uuids) {
		return getJpaRepository().findByUuidIn(uuids);
	}

	@Override
	public List<T> findByUuidInAndStatus(Collection<String> uuids, boolean status) {
		return getJpaRepository().findByUuidInAndStatus(uuids, status);
	}

	@Override
	public Boolean existsByUuid(String uuid) {
		return getJpaRepository().existsByUuid(uuid);
	}

	@Override
	public Boolean existsByUuidAndStatus(String uuid, boolean status) {
		return getJpaRepository().existsByUuidAndStatus(uuid, status);
	}

	@Override
	public void flush() {
		getJpaRepository().flush();
	}

	@Override
	public void delete(T entity) {
		getJpaRepository().delete(entity);
	}

	@Override
	public void delete(Collection<T> entities) {
		getJpaRepository().deleteAll(entities);
	}

	@Override
	public void deleteInBatch(Collection<T> entities) {
		getJpaRepository().deleteInBatch(entities);
	}

	@Override
	public void delete(I id) {
		getJpaRepository().deleteById(id);
	}

	@Override
	public void deleteAll() {
		getJpaRepository().deleteAll();
	}

}