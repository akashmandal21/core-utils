package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.AddresssEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface ADDRESSSRepository extends JpaRepository<AddresssEntity, Integer>, JpaSpecificationExecutor<AddresssEntity> {

}