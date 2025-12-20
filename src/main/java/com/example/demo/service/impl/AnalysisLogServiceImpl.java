

package com.example.demo.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AnalysisLog;
import com.example.demo.repository.AnalysisLogRepository;
import com.example.demo.service.AnalysisLogService;

@Service
public class AnalysisLogServiceImpl implements AnalysisLogService {

    private final AnalysisLogRepository analysisLogRepository;

    public AnalysisLogServiceImpl(AnalysisLogRepository analysisLogRepository) {
        this.analysisLogRepository = analysisLogRepository;
    }

    @Override
    public List<AnalysisLog> getLogsByZoneId(Long zoneId) {
        return analysisLogRepository.findByZoneId(zoneId);
    }
}
