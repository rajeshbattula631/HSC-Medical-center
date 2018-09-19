package com.hsc.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsc.example.dao.DoctorDAO;
import com.hsc.example.model.Doctor;
@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorDAO doctorDAO;
	
	@Override
	public List<Doctor> getDoctorsList() {
		// TODO Auto-generated method stub
		return (List<Doctor>) doctorDAO.findAll();
	}

}