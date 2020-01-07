package com.stanzaliving.core.mongobase.repository;

import com.stanzaliving.core.mongobase.entity.AbstractMongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@NoRepositoryBean
public interface AbstractMongoRepository<T extends AbstractMongoEntity, I extends Serializable> extends MongoRepository<T, I> //,QuerydslPredicateExecutor<AbstractMongoEntity> {
{

    T findFirstByUuid(String uuid);
    List<T> findByUuidIn(Collection<String> uuids);

}
