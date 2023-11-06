package com.example.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.store.model.Timetable; // แก้ชื่อคลาสเป็น Timetable
import com.example.store.service.TimetableService; // แก้ชื่อคลาสเป็น TimetableService

@RestController
@RequestMapping("/api")
public class TimetableController { // แก้ชื่อคลาสเป็น TimetableController

    @Autowired
    private TimetableService timetableService; // แก้ชื่อตัวแปรเป็น timetableService

    @GetMapping(value = "/timetable/get/all") // แก้ endpoint URL เป็น /timetable/get/all
    public ResponseEntity<List<Timetable>> findAll() {
        List<Timetable> list = timetableService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/timetable/save") // แก้ endpoint URL เป็น /timetable/save
    public Timetable create(@RequestBody Timetable timetable) {
        return timetableService.create(timetable);
    }

    @PutMapping("/timetable/update/{id}") // แก้ endpoint URL เป็น /timetable/update/{id}
    public Timetable update(@PathVariable("id") int id, @RequestBody Timetable timetable) {
        return timetableService.update(id, timetable);
    }

    @DeleteMapping("/timetable/{id}") // แก้ endpoint URL เป็น /timetable/{id}
    public void delete(@PathVariable("id") int id) {
        timetableService.delete(id);
    }
}
