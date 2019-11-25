package guru.ritesh.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import guru.ritesh.patient.entity.Patient;
import guru.ritesh.patient.model.PatientInformation;
import guru.ritesh.patient.service.PatientService;

@RestController
@RequestMapping("/demo/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;

	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}

	@GetMapping("/all")
	public List<Patient> getPatients() {
		List<Patient> patients = patientService.retrievePatients();
		return patients;
	}

	@GetMapping("/{patientId}")
	public PatientInformation getPatient(@PathVariable(name = "patientId") Long patientId) {
		return patientService.getPatient(patientId);
	}

	@PostMapping("")
	public void savePatient(Patient patient) {
		patientService.savePatient(patient);
		System.out.println("Patient Saved Successfully");
	}

	@DeleteMapping("/{patientId}")
	public void deletePatient(@PathVariable(name = "patientId") Long patientId) {
		patientService.deletePatient(patientId);
		System.out.println("Patient Deleted Successfully");
	}

	@PutMapping("/{patientId}")
	public void patchPatient(@RequestBody Patient patient, @PathVariable(name = "patientId") Long patientId) {
		PatientInformation pat = patientService.getPatient(patientId);
		if (pat != null) {
			patientService.updatePatient(patient);
		}
	}

	@GetMapping("/{patientId}/data")
	@ResponseBody
	public PatientInformation getPatientInformation(@PathVariable long patientId,
			@RequestParam(required = false) Boolean medicines, @RequestParam(required = false) Boolean documents) {

		return patientService.getPatient(patientId);

	}

}
