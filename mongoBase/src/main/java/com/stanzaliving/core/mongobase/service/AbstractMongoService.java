package com.stanzaliving.core.mongobase.service;

import com.stanzaliving.core.mongobase.entity.AbstractMongoEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface AbstractMongoService <T extends AbstractMongoEntity, I extends Serializable> {

    <S extends T> S save(S entity);

    <S extends T> List<S> save(Iterable<S> entities);

    <S extends T> List<S> saveAll(Iterable<S> entities);

    T insert(T entity);

    List<T> insert(Collection<T> entities);

    T findByUuid(String uuid);

    T find(I id);

    List<T> findAll();

    List<T> findByUuidIn(Collection<String> uuids);

    boolean delete(T entity);

    void delete(I id);
}
