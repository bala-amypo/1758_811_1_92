package com.example.demo.service.impl;

import com.example.demo.entity.AnalysisLog;
import com.example.demo.repository.AnalysisLogRepository;
import com.example.demo.service.AnalysisLogService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnalysisLogServiceImpl implements AnalysisLogService {

    private final AnalysisLogRepository analysisLogRepository;

    public AnalysisLogServiceImpl(AnalysisLogRepository analysisLogRepository) {
        this.analysisLogRepository = analysisLogRepository;
    }

    @Override
    public AnalysisLog saveLog(Long zoneId, String message) {
        AnalysisLog log = new AnalysisLog();
        log.setZoneId(zoneId);
        log.setMessage(message);
        return analysisLogRepository.save(log);
    }

    @Override
    public List<AnalysisLog> getLogsByZone(Long zoneId) {
        return analysisLogRepository.findByZone_Id(zoneId);
    }
}
