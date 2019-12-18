package com.stanzaliving.core.mongobase.service;

import com.stanzaliving.core.mongobase.entity.AbstractMongoEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface AbstractMongoService <T extends AbstractMongoEntity, I extends Serializable> {

    T insert(T entity);

    List<T> insert(Collection<T> entities);

    T findByUuid(String uuid);

    T find(I id);

    boolean delete(T entity);

    void delete(I id);
}
