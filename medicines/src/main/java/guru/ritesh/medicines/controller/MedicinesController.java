package guru.ritesh.medicines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.ritesh.medicines.model.Medicines;
import guru.ritesh.medicines.model.PatientMedicines;
import guru.ritesh.medicines.service.MedicinesService;


@RestController
@RequestMapping("/medicines")
public class MedicinesController {
	
	@GetMapping("/{id}")
	public Medicines medicinesInformation(@PathVariable Long medicinesId) {
		return null;
	}

	@Autowired
	private MedicinesService medicinesService;

	public void setMedicinesService(MedicinesService medicinesService) {
		this.medicinesService = medicinesService;
	}

	@GetMapping("/{patientID}/all")
	public PatientMedicines getMediciness(@PathVariable(name = "patientID") long patientID) {
		 return medicinesService.retrieveMedicines(patientID);
	}

	@GetMapping("/{medicinesId}")
	public Medicines getMedicines(@PathVariable(name = "medicinesId") Long medicinesId) {
		return medicinesService.getMedicines(medicinesId);
	}

	@PostMapping("")
	public void saveMedicines(Medicines medicines) {
		medicinesService.saveMedicines(medicines);
		System.out.println("Medicines Saved Successfully");
	}

	@DeleteMapping("/{medicinesId}")
	public void deleteMedicines(@PathVariable(name = "medicinesId") Long medicinesId) {
		medicinesService.deleteMedicines(medicinesId);
		System.out.println("Medicines Deleted Successfully");
	}

	@PutMapping("/{medicinesId}")
	public void updateMedicines(@RequestBody Medicines medicines, @PathVariable(name = "medicinesId") Long medicinesId) {
		Medicines emp = medicinesService.getMedicines(medicinesId);
		if (emp != null) {
			medicinesService.updateMedicines(medicines);
		}

	}
	

}
