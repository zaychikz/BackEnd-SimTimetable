package com.example.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.store.model.Timetable; // แก้ชื่อคลาสเป็น Timetable
import com.example.store.repository.TimetableRepository; // แก้ชื่อ repository เป็น TimetableRepository

@Service
public class TimetableServiceImpl implements TimetableService { // แก้ชื่อคลาสเป็น TimetableServiceImpl

    @Autowired
    private TimetableRepository timetableRepository; // แก้ชื่อตัวแปรเป็น timetableRepository

    @Override
    public List<Timetable> findAll() {
        return timetableRepository.findAll(); // แก้ชื่อ repository เป็น TimetableRepository
    }

    @Override
    public Timetable create(Timetable timetable) { // แก้ชื่อคลาสเป็น Timetable
        return timetableRepository.save(timetable); // แก้ชื่อ repository เป็น TimetableRepository
    }

    @Override
    public void delete(int id) {
        timetableRepository.deleteById(id); // แก้ชื่อ repository เป็น TimetableRepository
    }

    @Override
    public Timetable update(int id, Timetable timetable) { // แก้ชื่อคลาสเป็น Timetable
        Optional<Timetable> existingTimetableOptional = timetableRepository.findById(id); // แก้ชื่อ repository เป็น TimetableRepository

        if (existingTimetableOptional.isPresent()) {
            Timetable existingTimetable = existingTimetableOptional.get();
            existingTimetable.setSubject(timetable.getSubject());
            existingTimetable.setUser(timetable.getUser());
            // อัปเดตฟิลด์อื่น ๆ ตามที่ต้องการ

            return timetableRepository.save(existingTimetable); // แก้ชื่อ repository เป็น TimetableRepository
        } else {
            // จัดการกรณีที่ไม่พบ Timetable ที่มี ID ที่ระบุ
            // คุณสามารถส่งคืน null, โยนข้อยกเว้น, หรือจัดการตามวิธีของคุณเอง
            // สำหรับตัวอย่างนี้เราจะส่งคืน null
            return null;
        }
    }
}
