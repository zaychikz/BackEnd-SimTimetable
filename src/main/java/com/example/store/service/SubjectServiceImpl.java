package com.example.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.store.model.Subject;
import com.example.store.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject create(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void delete(int id) {
        subjectRepository.deleteById(id);
    }

    @Override
    public Subject update(int id, Subject updatedSubject) {
        Optional<Subject> existingSubjectOptional = subjectRepository.findById(id);

        if (existingSubjectOptional.isPresent()) {
            Subject existingSubject = existingSubjectOptional.get();

            // Update the fields of the existing subject with the values from updatedSubject
            existingSubject.setName(updatedSubject.getName());
            existingSubject.setStartTime(updatedSubject.getStartTime());
            existingSubject.setEndTime(updatedSubject.getEndTime());
            existingSubject.setDay(updatedSubject.getDay());
            existingSubject.setLecturer(updatedSubject.getLecturer());

            // Save the changes to the existing subject
            return subjectRepository.save(existingSubject);
        } else {
            // Handle the case where the subject with the specified ID is not found
            // You can return null or throw an exception, depending on your requirements
            return null;
        }
    }

}
