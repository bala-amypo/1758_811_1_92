package com.example.demo.controller;

import com.example.demo.entity.PatternDetectionResult;
import com.example.demo.service.PatternDetectionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patterns")
public class PatternDetectionController {

    private final PatternDetectionService patternDetectionService;

    public PatternDetectionController(PatternDetectionService patternDetectionService) {
        this.patternDetectionService = patternDetectionService;
    }

    @PostMapping("/detect/{zoneId}")
    public PatternDetectionResult detect(@PathVariable Long zoneId) {
        return patternDetectionService.detectPattern(zoneId);
    }
}
