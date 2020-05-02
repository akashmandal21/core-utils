package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.PENALTY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PENALTYRepository extends JpaRepository<PENALTY, String>, JpaSpecificationExecutor<PENALTY> {

}