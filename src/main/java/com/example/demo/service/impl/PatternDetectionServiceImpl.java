package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.PatternDetectionService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatternDetectionServiceImpl implements PatternDetectionService {

    private final CrimeReportRepository crimeRepo;
    private final PatternDetectionResultRepository patternRepo;
    private final AnalysisLogRepository logRepo;

    public PatternDetectionServiceImpl(
            CrimeReportRepository crimeRepo,
            PatternDetectionResultRepository patternRepo,
            AnalysisLogRepository logRepo) {
        this.crimeRepo = crimeRepo;
        this.patternRepo = patternRepo;
        this.logRepo = logRepo;
    }

    @Override
    public PatternDetectionResult detectPattern(Long zoneId) {
        List<CrimeReport> crimes = crimeRepo.findAll();
        int count = crimes.size();

        String result = "No";
        if (count > 5) result = "High";
        else if (count > 0) result = "Medium";

        PatternDetectionResult p = new PatternDetectionResult();
        p.setZoneId(zoneId);
        p.setDetectedPattern(result);
        patternRepo.save(p);

        AnalysisLog log = new AnalysisLog();
        log.setZoneId(zoneId);
        log.setMessage("Pattern: " + result);
        logRepo.save(log);

        return p;
    }
}
