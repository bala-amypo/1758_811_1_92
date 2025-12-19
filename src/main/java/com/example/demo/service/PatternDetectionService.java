package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatternDetectionService {

    private final CrimeReportRepository crimeRepo;
    private final PatternDetectionResultRepository patternRepo;
    private final AnalysisLogRepository logRepo;

    public PatternDetectionService(
            CrimeReportRepository crimeRepo,
            PatternDetectionResultRepository patternRepo,
            AnalysisLogRepository logRepo) {
        this.crimeRepo = crimeRepo;
        this.patternRepo = patternRepo;
        this.logRepo = logRepo;
    }

    public PatternDetectionResult detect(Long zoneId) {
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
        log.setMessage("Pattern detected: " + result);
        logRepo.save(log);

        return p;
    }
}
