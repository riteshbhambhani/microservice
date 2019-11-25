package guru.ritesh.documents.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.ritesh.documents.model.DocumentMetaInfo;
import guru.ritesh.documents.model.PatientDocuments;
import guru.ritesh.documents.repository.DocumentMetaInfoRepository;

@Service
public class DocumentMetaInfoService {

	@Autowired
	private DocumentMetaInfoRepository repository;

	public PatientDocuments retrieveDocumentMetaInfo(Long patientID) {
		
		List<DocumentMetaInfo> listPatientDocuments = repository.findDocumentByPatientId(patientID);
		PatientDocuments retObject = new PatientDocuments();
		retObject.setDocuments(listPatientDocuments);
		retObject.setPatientID(patientID);
		return retObject;
	}

	public DocumentMetaInfo getDocumentMetaInfo(Long documentMetaInfoId) {
		Optional <DocumentMetaInfo> info= repository.findById(documentMetaInfoId);
		return info.get();
	}

	public void saveDocumentMetaInfo(DocumentMetaInfo documentMetaInfo) {
		repository.save(documentMetaInfo);
		return;

	}

	public void deleteDocumentMetaInfo(Long documentMetaInfoId) {
		repository.deleteById(documentMetaInfoId);

	}

	public void updateDocumentMetaInfo(DocumentMetaInfo documentMetaInfo) {
		repository.save(documentMetaInfo);
		return;

	}
}
