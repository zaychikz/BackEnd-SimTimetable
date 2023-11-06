package com.example.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.store.model.Lecturer;
import com.example.store.repository.LecturerRepository;

@Service
public class LecturerServiceImpl implements LecturerService {

    @Autowired
    private LecturerRepository lecturerRepository;

    @Override
    public List<Lecturer> findAll() {
        return lecturerRepository.findAll();
    }

    @Override
    public Lecturer create(Lecturer lecturer) {
        return lecturerRepository.save(lecturer);
    }

    @Override
    public void delete(int id) {
        lecturerRepository.deleteById(id);
    }

    @Override
    public Lecturer update(int id, Lecturer lecturer) {
        Optional<Lecturer> existingLecturerOptional = lecturerRepository.findById(id);

        if (existingLecturerOptional.isPresent()) {
            Lecturer existingLecturer = existingLecturerOptional.get();
            existingLecturer.setName(lecturer.getName());
            // Update other fields as needed

            return lecturerRepository.save(existingLecturer);
        } else {
            // Handle the case where the lecturer with the given ID is not found.
            // You can return null, throw an exception, or handle it in your own way.
            // For this example, we'll return null.
            return null;
        }
    }
}
