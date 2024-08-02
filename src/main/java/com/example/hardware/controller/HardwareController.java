package com.example.hardware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.hardware.domain.model.Hardware;
import com.example.hardware.domain.service.HardwareService;

import java.util.List;

@RestController
@RequestMapping("/api/hardware")
public class HardwareController {

    private final HardwareService hardwareService;

    @Autowired
    public HardwareController(HardwareService hardwareService) {
        this.hardwareService = hardwareService;
    }

    @GetMapping
    public List<Hardware> getAllHardware() {
        return hardwareService.findAll();
    }

    @GetMapping("/{id}")
    public Hardware getHardwareById(@PathVariable Long id) {
        return hardwareService.findById(id);
    }

    @PostMapping
    public Hardware createHardware(@RequestBody Hardware hardware) {
        return hardwareService.save(hardware);
    }

    @PutMapping("/{id}")
    public Hardware updateHardware(@PathVariable Long id, @RequestBody Hardware hardware) {
        return hardwareService.update(id, hardware);
    }

    @DeleteMapping("/{id}")
    public void deleteHardware(@PathVariable Long id) {
        hardwareService.delete(id);
    }
}
