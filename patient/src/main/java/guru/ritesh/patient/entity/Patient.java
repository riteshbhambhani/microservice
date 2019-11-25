package guru.ritesh.patient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENT")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name="PID")
	private Long patientID;
	private Double gestage;
	private String city;
	private String apartment;
	private String street;
	private String cell;
	private String dob;
	private String region;
	private String initial;
	private Integer YOB;
	private Integer pcode;
	private String RACE;
	private String gender;
	private String home;
	private String country;
	private String email;
	
	private String lname;
	private String fname;

	protected Patient() {
	}

	public Patient(Long id, String firstName, String lastName) {
		this.patientID = id;
		this.fname = firstName;
		this.lname = lastName;
	}

	@Override
	public String toString() {
		return "Patient [patientID=" + patientID + ", gestage=" + gestage + ", city=" + city + ", apartment="
				+ apartment + ", street=" + street + ", cell=" + cell + ", dob=" + dob + ", region=" + region
				+ ", initial=" + initial + ", YOB=" + YOB + ", pcode=" + pcode + ", RACE=" + RACE + ", gender=" + gender
				+ ", home=" + home + ", country=" + country + ", email=" + email + ", lname=" + lname + ", fname="
				+ fname + "]";
	}

	public Long getPatientID() {
		return patientID;
	}

	public void setPatientID(Long patientID) {
		this.patientID = patientID;
	}

	public Double getGestage() {
		return gestage;
	}

	public void setGestage(Double gestage) {
		this.gestage = gestage;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public Integer getYOB() {
		return YOB;
	}

	public void setYOB(Integer yOB) {
		YOB = yOB;
	}

	public Integer getPcode() {
		return pcode;
	}

	public void setPcode(Integer pcode) {
		this.pcode = pcode;
	}

	public String getRACE() {
		return RACE;
	}

	public void setRACE(String rACE) {
		RACE = rACE;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

}
