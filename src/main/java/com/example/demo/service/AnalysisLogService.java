package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.AnalysisLog;

public interface AnalysisLogRepository extends JpaRepository<AnalysisLog, Long> {

    List<AnalysisLog> findByZoneId(Long zoneId);
}
