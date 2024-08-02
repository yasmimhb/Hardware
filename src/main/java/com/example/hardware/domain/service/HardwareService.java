package com.example.hardware.domain.service;


import org.springframework.stereotype.Service;

import com.example.hardware.domain.exception.ResourceNotFoundException;
import com.example.hardware.domain.model.Hardware;
import com.example.hardware.domain.repository.HardwareRepository;

import java.util.List;

@Service
public class HardwareService {

    private final HardwareRepository hardwareRepository;

    public HardwareService(HardwareRepository hardwareRepository) {
        this.hardwareRepository = hardwareRepository;
    }

    public List<Hardware> findAll() {
        return hardwareRepository.findAll();
    }

    public Hardware findById(Long id) {
        return hardwareRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Hardware not found with id " + id));
    }

    public Hardware save(Hardware hardware) {
        return hardwareRepository.save(hardware);
    }

    public Hardware update(Long id, Hardware hardware) {
        Hardware existingHardware = findById(id);
        existingHardware.setNome(hardware.getNome());
        existingHardware.setFabricante(hardware.getFabricante());
        existingHardware.setTipo(hardware.getTipo());
        existingHardware.setAno(hardware.getAno());
        existingHardware.setValor(hardware.getValor());
        return hardwareRepository.save(existingHardware);
    }

    public void delete(Long id) {
        hardwareRepository.deleteById(id);
    }
}
