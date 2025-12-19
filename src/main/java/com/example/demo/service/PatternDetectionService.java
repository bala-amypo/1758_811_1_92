package com.example.demo.service;

import com.example.demo.entity.PatternDetectionResult;

public interface PatternDetectionService {

    PatternDetectionResult detectPattern(Long zoneId);
}
