package com.example.demo.service.impl;

import com.example.demo.entity.HotspotZone;
import com.example.demo.repository.HotspotZoneRepository;
import com.example.demo.service.HotspotZoneService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HotspotZoneServiceImpl implements HotspotZoneService {

    private final HotspotZoneRepository hotspotZoneRepository;

    public HotspotZoneServiceImpl(HotspotZoneRepository hotspotZoneRepository) {
        this.hotspotZoneRepository = hotspotZoneRepository;
    }

    @Override
    public HotspotZone createZone(HotspotZone zone) {
        if (hotspotZoneRepository.findByZoneName(zone.getZoneName()) != null) {
            throw new RuntimeException("Zone already exists");
        }
        return hotspotZoneRepository.save(zone);
    }

    @Override
    public List<HotspotZone> getAllZones() {
        return hotspotZoneRepository.findAll();
    }
}
