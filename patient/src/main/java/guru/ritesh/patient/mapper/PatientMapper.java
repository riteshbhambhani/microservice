package guru.ritesh.patient.mapper;

import guru.ritesh.patient.entity.Patient;
import guru.ritesh.patient.model.PatientInformation;

public class PatientMapper {

	public static PatientInformation patientEntityToModel(Patient pEntity) {

		PatientInformation patInfo = new PatientInformation();

		patInfo.setApartment(pEntity.getApartment());
		patInfo.setCell(pEntity.getCell());
		patInfo.setCity(pEntity.getCity());
		patInfo.setCountry(pEntity.getCountry());
		patInfo.setDob(pEntity.getDob());
		patInfo.setEmail(pEntity.getEmail());
		patInfo.setFname(pEntity.getFname());
		patInfo.setGender(pEntity.getGender());
		patInfo.setGestage(pEntity.getGestage());
		patInfo.setHome(pEntity.getHome());
		patInfo.setInitial(pEntity.getInitial());
		patInfo.setLname(pEntity.getLname());
		patInfo.setPatientID(pEntity.getPatientID());
		patInfo.setPcode(pEntity.getPcode());
		patInfo.setRACE(pEntity.getRACE());
		patInfo.setRegion(pEntity.getRegion());
		patInfo.setStreet(pEntity.getStreet());

		return patInfo;

	}
	

}
