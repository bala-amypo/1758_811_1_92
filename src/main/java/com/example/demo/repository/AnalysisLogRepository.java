package com.example.demo.repository;

import com.example.demo.entity.AnalysisLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AnalysisLogRepository extends JpaRepository<AnalysisLog, Long> {
    List<AnalysisLog> findByZone_Id(Long zoneId);
}
