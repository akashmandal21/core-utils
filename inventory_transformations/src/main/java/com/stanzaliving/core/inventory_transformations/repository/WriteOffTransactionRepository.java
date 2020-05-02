package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.WriteOffTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WriteOffTransactionRepository extends JpaRepository<WriteOffTransaction, Integer>, JpaSpecificationExecutor<WriteOffTransaction> {

}