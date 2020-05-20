package com.developia.service.doctor;

import com.developia.dao.doctor.DoctorRepository;
import com.developia.model.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository repository;

    public DoctorService(int id, String name, String specialist) {
    }

    @PostConstruct
    public  void initDoctor(){
        repository.saveAll(Stream.of(
                new Doctor(101, "John", "Cardiac"),
                new Doctor(102, "Lion", "Eye"),
                new Doctor(103, "Cat", "Nose")).collect(Collectors.toList()));
    }
    public List<Doctor> getDoctors(){
        return repository.findAll();
    }
}
