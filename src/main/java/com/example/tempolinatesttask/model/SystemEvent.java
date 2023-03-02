package com.example.tempolinatesttask.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "system_event")
public class SystemEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(name = "date", nullable = false)
    @NotNull
    private LocalDate date;

    @Column(name = "message", nullable = false)
    @Size(max = 250)
    @NotNull
    private String message;
}
