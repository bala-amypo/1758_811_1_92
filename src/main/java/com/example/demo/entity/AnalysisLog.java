package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "analysis_log")
public class AnalysisLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long zoneId;

    private String message;

    // REQUIRED by JPA
    public AnalysisLog() {
    }

    // Optional constructor
    public AnalysisLog(Long zoneId, String message) {
        this.zoneId = zoneId;
        this.message = message;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Long getZoneId() {
        return zoneId;
    }

    public String getMessage() {
        return message;
    }

    // Setters
    public void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
