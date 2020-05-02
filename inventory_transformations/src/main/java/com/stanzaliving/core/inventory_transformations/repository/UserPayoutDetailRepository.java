package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.UserPayoutDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserPayoutDetailRepository extends JpaRepository<UserPayoutDetail, Integer>, JpaSpecificationExecutor<UserPayoutDetail> {

}