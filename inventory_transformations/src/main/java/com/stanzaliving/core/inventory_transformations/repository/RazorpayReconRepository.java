package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.RazorpayReconEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RazorpayReconRepository extends JpaRepository<RazorpayReconEntity, String>, JpaSpecificationExecutor<RazorpayReconEntity> {

}