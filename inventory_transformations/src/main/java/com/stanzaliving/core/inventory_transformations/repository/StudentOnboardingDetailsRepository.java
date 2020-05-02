package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentOnboardingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentOnboardingDetailsRepository extends JpaRepository<StudentOnboardingDetails, Integer>, JpaSpecificationExecutor<StudentOnboardingDetails> {

}