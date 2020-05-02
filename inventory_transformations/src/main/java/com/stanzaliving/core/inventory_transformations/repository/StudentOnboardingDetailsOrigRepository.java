package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentOnboardingDetailsOrig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentOnboardingDetailsOrigRepository extends JpaRepository<StudentOnboardingDetailsOrig, String>, JpaSpecificationExecutor<StudentOnboardingDetailsOrig> {

}