package com.example.tempolinatesttask.dto;

import com.example.tempolinatesttask.model.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Data
public class SystemEventDto {
    public Long id;
    public Type type;
    public LocalDate date;
    public String message;
}
