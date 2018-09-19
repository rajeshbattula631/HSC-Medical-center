package com.hsc.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsc.example.dao.HospitalDAO;
import com.hsc.example.model.Hospital;
@Service
public class HospitalServiceImpl implements HospitalService {
	
	@Autowired
	private HospitalDAO hospitaldao;
	@Override
	public List<Hospital> getHospitals() {
		// TODO Auto-generated method stub
		return (List<Hospital>) hospitaldao.findAll();
	}

}
