package com.example.demo.service;

import com.example.demo.entity.HotspotZone;
import java.util.List;

public interface HotspotZoneService {

    HotspotZone createZone(HotspotZone zone);

    List<HotspotZone> getAllZones();
}
