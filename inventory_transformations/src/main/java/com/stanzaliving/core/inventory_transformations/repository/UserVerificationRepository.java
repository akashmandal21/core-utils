package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.UserVerificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserVerificationRepository extends JpaRepository<UserVerificationEntity, String>, JpaSpecificationExecutor<UserVerificationEntity> {

}