package guru.ritesh.patient.model;

import java.util.List;

public class PatientInformation {
	
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
	
	private List<Medicines> medicines;
	private List<DocumentMetaInfo> docInfo;
	/**
	 * @return the patientID
	 */
	public Long getPatientID() {
		return patientID;
	}
	/**
	 * @param patientID the patientID to set
	 */
	public void setPatientID(Long patientID) {
		this.patientID = patientID;
	}
	/**
	 * @return the gestage
	 */
	public Double getGestage() {
		return gestage;
	}
	/**
	 * @param gestage the gestage to set
	 */
	public void setGestage(Double gestage) {
		this.gestage = gestage;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the apartment
	 */
	public String getApartment() {
		return apartment;
	}
	/**
	 * @param apartment the apartment to set
	 */
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the cell
	 */
	public String getCell() {
		return cell;
	}
	/**
	 * @param cell the cell to set
	 */
	public void setCell(String cell) {
		this.cell = cell;
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the initial
	 */
	public String getInitial() {
		return initial;
	}
	/**
	 * @param initial the initial to set
	 */
	public void setInitial(String initial) {
		this.initial = initial;
	}
	/**
	 * @return the yOB
	 */
	public Integer getYOB() {
		return YOB;
	}
	/**
	 * @param yOB the yOB to set
	 */
	public void setYOB(Integer yOB) {
		YOB = yOB;
	}
	/**
	 * @return the pcode
	 */
	public Integer getPcode() {
		return pcode;
	}
	/**
	 * @param pcode the pcode to set
	 */
	public void setPcode(Integer pcode) {
		this.pcode = pcode;
	}
	/**
	 * @return the rACE
	 */
	public String getRACE() {
		return RACE;
	}
	/**
	 * @param rACE the rACE to set
	 */
	public void setRACE(String rACE) {
		RACE = rACE;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the home
	 */
	public String getHome() {
		return home;
	}
	/**
	 * @param home the home to set
	 */
	public void setHome(String home) {
		this.home = home;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the medicines
	 */
	public List<Medicines> getAppointments() {
		return medicines;
	}
	/**
	 * @param medicines the medicines to set
	 */
	public void setMedicines(List<Medicines> medicines) {
		this.medicines = medicines;
	}
	/**
	 * @return the docInfo
	 */
	public List<DocumentMetaInfo> getDocInfo() {
		return docInfo;
	}
	/**
	 * @param docInfo the docInfo to set
	 */
	public void setDocInfo(List<DocumentMetaInfo> docInfo) {
		this.docInfo = docInfo;
	}
	
	

}
