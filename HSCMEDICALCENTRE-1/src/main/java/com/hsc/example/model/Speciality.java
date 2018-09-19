package com.hsc.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="speciality")
public class Speciality {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false, updatable=false)
private Integer speciality_id;
private String speciality_name;
public Integer getSpeciality_id() {
	return speciality_id;
}
public void setSpeciality_id(Integer speciality_id) {
	this.speciality_id = speciality_id;
}
public String getSpeciality_name() {
	return speciality_name;
}
public void setSpeciality_name(String speciality_name) {
	this.speciality_name = speciality_name;
}
public Speciality(Integer speciality_id, String speciality_name) {
	super();
	this.speciality_id = speciality_id;
	this.speciality_name = speciality_name;
}
public Speciality() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Speciality [speciality_id=" + speciality_id + ", speciality_name=" + speciality_name + "]";
}

}

