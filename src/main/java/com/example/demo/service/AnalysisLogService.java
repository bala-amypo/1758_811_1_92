
package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.AnalysisLog;

public interface AnalysisLogService {

    AnalysisLog saveLog(Long zoneId, String message);

    List<AnalysisLog> getLogsByZoneId(Long zoneId);
}
