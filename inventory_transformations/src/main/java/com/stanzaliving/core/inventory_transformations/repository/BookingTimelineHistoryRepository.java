package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BookingTimelineHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookingTimelineHistoryRepository extends JpaRepository<BookingTimelineHistory, Void>, JpaSpecificationExecutor<BookingTimelineHistory> {

}