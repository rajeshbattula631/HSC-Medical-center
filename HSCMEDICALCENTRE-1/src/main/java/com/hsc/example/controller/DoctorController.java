package com.hsc.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsc.example.model.Doctor;
import com.hsc.example.service.DoctorService;

@RestController
public class DoctorController {
@Autowired
private DoctorService doctorService;

@RequestMapping("/doctorslist")
public List<Doctor> getDoctorList(){
	return doctorService.getDoctorsList();
}
}