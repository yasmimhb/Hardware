package com.example.hardware.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hardware.domain.model.Hardware;

public interface HardwareRepository extends JpaRepository<Hardware, Long> {
}
