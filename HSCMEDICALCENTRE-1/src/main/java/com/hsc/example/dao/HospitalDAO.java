package com.hsc.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hsc.example.model.Hospital;
@Repository
public interface HospitalDAO extends CrudRepository<Hospital, Long> {

}
