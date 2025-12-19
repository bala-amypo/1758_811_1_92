package com.example.demo.controller;

import com.example.demo.entity.AnalysisLog;
import com.example.demo.service.AnalysisLogService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/logs")
public class AnalysisLogController {

    private final AnalysisLogService analysisLogService;

    public AnalysisLogController(AnalysisLogService analysisLogService) {
        this.analysisLogService = analysisLogService;
    }

    @PostMapping("/{zoneId}")
    public AnalysisLog addLog(@PathVariable Long zoneId, @RequestBody String message) {
        return analysisLogService.saveLog(zoneId, message);
    }

    @GetMapping("/zone/{zoneId}")
    public List<AnalysisLog> getLogs(@PathVariable Long zoneId) {
        return analysisLogService.getLogsByZone(zoneId);
    }
}
