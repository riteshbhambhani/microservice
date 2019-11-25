package guru.ritesh.medicines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.ritesh.medicines.model.Medicines;
import guru.ritesh.medicines.model.PatientMedicines;
import guru.ritesh.medicines.repository.MedicineRepository;

@Service
public class MedicinesService {

	@Autowired
	private MedicineRepository repository;

	public PatientMedicines retrieveMedicines(long patientID) {
		List<Medicines> medicines = repository.findByPatientID(patientID);
		PatientMedicines retObject = new PatientMedicines();
		retObject.setMedicines(medicines);
		retObject.setPatientID(patientID);
		return retObject;
	}

	public Medicines getMedicines(Long medicinesId) {
		return repository.getOne(medicinesId);
	}

	public void saveMedicines(Medicines medicines) {
		repository.save(medicines);
		return;
		
	}

	public void deleteMedicines(Long medicinesId) {
		repository.deleteById(medicinesId);
		
	}

	public void updateMedicines(Medicines medicines) {
		repository.save(medicines);
		return;
		
	}
}
