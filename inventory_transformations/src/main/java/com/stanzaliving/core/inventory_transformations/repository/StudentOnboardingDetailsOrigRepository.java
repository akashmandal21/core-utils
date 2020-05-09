package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentOnboardingDetailsOrigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentOnboardingDetailsOrigRepository extends JpaRepository<StudentOnboardingDetailsOrigEntity, String>, JpaSpecificationExecutor<StudentOnboardingDetailsOrigEntity> {

}