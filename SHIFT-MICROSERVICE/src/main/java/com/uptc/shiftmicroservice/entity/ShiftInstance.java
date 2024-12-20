package com.uptc.shiftmicroservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ShiftInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private boolean state;

    @ManyToOne
    @JoinColumn(name = "day_assignment_id", nullable = false)
    private DayAssignment dayAssignment;

    private Day day;

    private LocalDate date;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime startTime;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime endTime;

    private int placeAvailable;

    private int fitnessCenter;

    public boolean getState(){
        return this.state;
    }
}
