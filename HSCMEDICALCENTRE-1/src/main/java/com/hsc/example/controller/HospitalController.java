package com.hsc.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsc.example.model.Hospital;
import com.hsc.example.service.HospitalService;

@RestController
public class HospitalController {
	@Autowired
	private HospitalService hospitalService;
	@RequestMapping("/hospitals")
	public List<Hospital> getHospitals() {
		return hospitalService.getHospitals();
	}
}
