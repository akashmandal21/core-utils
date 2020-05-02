package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.TRANSACTION;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TRANSACTIONRepository extends JpaRepository<TRANSACTION, Integer>, JpaSpecificationExecutor<TRANSACTION> {

}