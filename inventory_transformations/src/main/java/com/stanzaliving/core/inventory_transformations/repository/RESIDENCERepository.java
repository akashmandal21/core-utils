package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.RESIDENCE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RESIDENCERepository extends JpaRepository<RESIDENCE, Integer>, JpaSpecificationExecutor<RESIDENCE> {

}