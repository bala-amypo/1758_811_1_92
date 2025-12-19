package com.example.demo.controller;

import com.example.demo.repository.AnalysisLogRepository;
import com.example.demo.entity.AnalysisLog;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/logs")
public class AnalysisLogController {

    private final AnalysisLogRepository repo;

    public AnalysisLogController(AnalysisLogRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/zone/{zoneId}")
    public List<AnalysisLog> getLogs(@PathVariable Long zoneId) {
        return repo.findByZone_Id(zoneId);
    }
}
