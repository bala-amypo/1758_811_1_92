package com.example.demo.controller;

import com.example.demo.entity.HotspotZone;
import com.example.demo.service.HotspotZoneService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/zones")
public class HotspotZoneController {

    private final HotspotZoneService hotspotZoneService;

    public HotspotZoneController(HotspotZoneService hotspotZoneService) {
        this.hotspotZoneService = hotspotZoneService;
    }

    @PostMapping
    public HotspotZone createZone(@RequestBody HotspotZone zone) {
        return hotspotZoneService.createZone(zone);
    }

    @GetMapping
    public List<HotspotZone> getZones() {
        return hotspotZoneService.getAllZones();
    }
}
