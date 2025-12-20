package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.AnalysisLog;
import com.example.demo.service.AnalysisLogService;

@RestController
@RequestMapping("/analysis-logs")
public class AnalysisLogController {

    private final AnalysisLogService analysisLogService;

    public AnalysisLogController(AnalysisLogService analysisLogService) {
        this.analysisLogService = analysisLogService;
    }

    @PostMapping
    public AnalysisLog saveLog(
            @RequestParam Long zoneId,
            @RequestParam String message) {
        return analysisLogService.saveLog(zoneId, message);
    }

    @GetMapping("/{zoneId}")
    public List<AnalysisLog> getLogsByZone(@PathVariable Long zoneId) {
        return analysisLogService.getLogsByZoneId(zoneId);
    }
}
