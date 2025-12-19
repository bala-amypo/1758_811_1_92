package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class AnalysisLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long zoneId;
    private String message;

    public void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
