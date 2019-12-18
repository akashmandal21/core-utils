package com.stanzaliving.core.mongobase.service.impl;

import com.mongodb.client.result.DeleteResult;
import com.stanzaliving.core.mongobase.entity.AbstractMongoEntity;
import com.stanzaliving.core.mongobase.repository.AbstractMongoRepository;
import com.stanzaliving.core.mongobase.service.AbstractMongoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;


@Log4j2
public abstract class AbstractMongoServiceImpl<T extends AbstractMongoEntity, I extends Serializable, R extends AbstractMongoRepository<T,I>>
    implements AbstractMongoService<T, I>
{

    protected abstract R getMongoRepository();

    protected abstract MongoTemplate getMongoTemplate();

    @Override
    public T insert(T entity) {
        return getMongoRepository().insert(entity);
    }

    @Override
    public List<T> insert(Collection<T> entities) {
        return getMongoRepository().saveAll(entities);
    }


    @Override
    public T find(I id) {
        return getMongoRepository().findById(id).orElse(null);
    }


    @Override
    public T findByUuid(String uuid) {
        return getMongoRepository().findFirstByUuid(uuid);
    }

    @Override
    public boolean delete(T entity) {
        DeleteResult result = getMongoTemplate().remove(entity);
        if(result.getDeletedCount()==0) return false;
        return true;
    }

    @Override
    public void delete(I id) {
        getMongoRepository().deleteById(id);
    }

}