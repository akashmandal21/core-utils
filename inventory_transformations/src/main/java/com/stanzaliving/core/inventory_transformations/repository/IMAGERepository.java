package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.IMAGE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IMAGERepository extends JpaRepository<IMAGE, Integer>, JpaSpecificationExecutor<IMAGE> {

}