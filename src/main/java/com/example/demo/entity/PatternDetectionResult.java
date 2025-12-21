package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class PatternDetectionResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long zoneId;
    private String detectedPattern;
   


    public void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }

    public void setDetectedPattern(String detectedPattern) {
        this.detectedPattern = detectedPattern;
    }
}
