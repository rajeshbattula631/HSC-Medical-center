package com.hsc.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hsc.example.model.Speciality;

@Entity
@Table(name="hsc")
public class Hospital {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer hsc_id;
private String hsc_name;
private String location;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="hsc_id", nullable=false)
private List<Speciality> specialities;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="hsc_id", nullable=false)
private List<Doctor> doctors;

public List<Doctor> getDoctors() {
	return doctors;
}
public void setDoctors(List<Doctor> doctors) {
	this.doctors = doctors;
}
public Integer getHsc_id() {
	return hsc_id;
}
public void setHsc_id(Integer hsc_id) {
	this.hsc_id = hsc_id;
}
public String getHsc_name() {
	return hsc_name;
}
public void setHsc_name(String hsc_name) {
	this.hsc_name = hsc_name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public List<Speciality> getSpecialities() {
	return specialities;
}
public void setSpecialities(List<Speciality> specialities) {
	this.specialities = specialities;
}
public Hospital() {
	super();
	// TODO Auto-generated constructor stub
}
public Hospital(Integer hsc_id, String hsc_name, String location, List<Speciality> specialities, List<Doctor> doctors) {
	super();
	this.hsc_id = hsc_id;
	this.hsc_name = hsc_name;
	this.location = location;
	this.specialities = specialities;
	this.doctors = doctors;
}
@Override
public String toString() {
	return "Hospital [hsc_id=" + hsc_id + ", hsc_name=" + hsc_name + ", location=" + location + ", specialities="
			+ specialities + ", doctors=" + doctors + "]";
}

}
