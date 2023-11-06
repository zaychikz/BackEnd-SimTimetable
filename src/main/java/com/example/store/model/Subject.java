package com.example.store.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "subject")
@Getter
@Setter
public class Subject implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subject_id")
    private int subjectId;

    private String name;

    @Temporal(TemporalType.TIME)
    @Column(name = "start_time")
    private String startTime;

    @Temporal(TemporalType.TIME)
    @Column(name = "end_time")
    private String endTime;

    private String day; // เพิ่มฟิลด์ "day" เพื่อเก็บข้อมูลเกี่ยวกับวัน (จันทร์-ศุกร์)

    @ManyToOne
    @JoinColumn(name = "lecturer_id")
    private Lecturer lecturer;

    // Constructors, getters, setters, and other methods can remain the same.
}
