package com.hsc.example.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(nullable=false, updatable=false)
private Integer doctor_Id;
private String name;
private String dr_Location;
private String dr_Experience;
private Double dr_consultationFee;
private String fromDay;
private String toDay;
private String from_Time;
private String to_Time;
public Integer getDoctor_Id() {
	return doctor_Id;
}
public void setDoctor_Id(Integer doctor_Id) {
	this.doctor_Id = doctor_Id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDr_Location() {
	return dr_Location;
}
public void setDr_Location(String dr_Location) {
	this.dr_Location = dr_Location;
}
public String getDr_Experience() {
	return dr_Experience;
}
public void setDr_Experience(String dr_Experience) {
	this.dr_Experience = dr_Experience;
}
public Double getDr_consultationFee() {
	return dr_consultationFee;
}
public void setDr_consultationFee(Double dr_consultationFee) {
	this.dr_consultationFee = dr_consultationFee;
}
public String getFromDay() {
	return fromDay;
}
public void setFromDay(String fromDay) {
	this.fromDay = fromDay;
}
public String getToDay() {
	return toDay;
}
public void setToDay(String toDay) {
	this.toDay = toDay;
}
public String getFrom_Time() {
	return from_Time;
}
public void setFrom_Time(String from_Time) {
	this.from_Time = from_Time;
}
public String getTo_Time() {
	return to_Time;
}
public void setTo_Time(String to_Time) {
	this.to_Time = to_Time;
}
public Doctor() {
	super();
	// TODO Auto-generated constructor stub
}
public Doctor(Integer doctor_Id, String name, String dr_Location, String dr_Experience, Double dr_consultationFee,
		String fromDay, String toDay, String from_Time, String to_Time) {
	super();
	this.doctor_Id = doctor_Id;
	this.name = name;
	this.dr_Location = dr_Location;
	this.dr_Experience = dr_Experience;
	this.dr_consultationFee = dr_consultationFee;
	this.fromDay = fromDay;
	this.toDay = toDay;
	this.from_Time = from_Time;
	this.to_Time = to_Time;
}
@Override
public String toString() {
	return "Doctor [doctor_Id=" + doctor_Id + ", name=" + name + ", dr_Location=" + dr_Location + ", dr_Experience="
			+ dr_Experience + ", dr_consultationFee=" + dr_consultationFee + ", fromDay=" + fromDay + ", toDay=" + toDay
			+ ", from_Time=" + from_Time + ", to_Time=" + to_Time + "]";
}

}
