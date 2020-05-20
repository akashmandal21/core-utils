package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.WriteOffTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface WriteOffTransactionRepository extends JpaRepository<WriteOffTransactionEntity, Integer>, JpaSpecificationExecutor<WriteOffTransactionEntity> {

}