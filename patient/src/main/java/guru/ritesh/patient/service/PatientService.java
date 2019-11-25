package guru.ritesh.patient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import guru.ritesh.patient.entity.Patient;
import guru.ritesh.patient.mapper.PatientMapper;
import guru.ritesh.patient.model.PatientDocuments;
import guru.ritesh.patient.model.PatientInformation;
import guru.ritesh.patient.model.PatientMedicines;
import guru.ritesh.patient.repository.PatientRepository;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
public class PatientService {

	@Autowired
	private PatientRepository repository;
	
    @Autowired
    WebClient.Builder webClientBuilder;

	public List<Patient> retrievePatients() {
		return repository.findAll();
	}

	public PatientInformation getPatient(Long patientId) {
		Optional<Patient> patient = repository.findById(patientId);
		PatientInformation patientInfo = patient.map(p -> convertToPatientOutbound(p)).orElse(null);

		if (patientInfo != null) {
			Mono<PatientMedicines> patientMeds = getMedicines(patientId);
			Mono<PatientDocuments> patientDocs = getDocuments(patientId);
			
			patientInfo.setMedicines(patientMeds.block().getMedicines());	
			patientInfo.setDocInfo(patientDocs.block().getDocuments());
		}

		return patientInfo;

	}

	public void savePatient(Patient patient) {
		repository.save(patient);
		return;

	}

	public void deletePatient(long patientID) {
		repository.deleteById(patientID);

	}

	public Patient updatePatient(Patient patient) {
		Patient patientReturn = repository.save(patient);
		return patientReturn;

	}

	// Convert Entity TO Business Object
	private PatientInformation convertToPatientOutbound(Patient pEntity) {
		return PatientMapper.patientEntityToModel(pEntity);

	}

	private Mono<PatientMedicines> getMedicines(Long patientId) {

		String medicineResourceUrl = "http://app-medicines/medicines/";
		String path = patientId + "/all";
		String medicinesURL = medicineResourceUrl + path;

		return webClientBuilder.build().get().uri(medicinesURL)
				.retrieve().bodyToMono(PatientMedicines.class);

	}

	private Mono<PatientDocuments> getDocuments(Long patientId) {
		
		String documentResourceUrl = "http://app-documents/document/";
		String path = patientId + "/all";
		String documentURL = documentResourceUrl + path;
		
		return webClientBuilder.build().get().uri(documentURL)
				.retrieve().bodyToMono(PatientDocuments.class);
	}
}
