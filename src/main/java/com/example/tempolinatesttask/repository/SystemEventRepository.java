package com.example.tempolinatesttask.repository;

import com.example.tempolinatesttask.model.SystemEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SystemEventRepository extends JpaRepository<SystemEvent, Integer> {
    List<SystemEvent> getSystemEventByTypeOrderByDateDesc(String type);
}
