package com.hsc.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hsc.example.model.Doctor;

@Repository
public interface DoctorDAO extends CrudRepository<Doctor, Long> {

}

