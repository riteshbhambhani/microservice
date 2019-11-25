package guru.ritesh.medicines.model;

import java.util.List;

public class PatientMedicines {
	
	private long patientID;
	private List<Medicines> medicines;
	/**
	 * @return the patientID
	 */
	public long getPatientID() {
		return patientID;
	}
	/**
	 * @param patientID the patientID to set
	 */
	public void setPatientID(long patientID) {
		this.patientID = patientID;
	}
	/**
	 * @return the medicines
	 */
	public List<Medicines> getMedicines() {
		return medicines;
	}
	/**
	 * @param medicines the medicines to set
	 */
	public void setMedicines(List<Medicines> medicines) {
		this.medicines = medicines;
	}
	
	

}
