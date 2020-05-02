package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.RazorpayRecon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RazorpayReconRepository extends JpaRepository<RazorpayRecon, String>, JpaSpecificationExecutor<RazorpayRecon> {

}