package guru.ritesh.documents.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.ritesh.documents.model.DocumentMetaInfo;
import guru.ritesh.documents.model.PatientDocuments;
import guru.ritesh.documents.service.DocumentMetaInfoService;

@RestController
@RequestMapping("/document")
public class DocumentController {
	
	@GetMapping("/{id}")
	public DocumentMetaInfo documentMetaInfoInformation(@PathVariable Long documentMetaInfoId) {
		return null;
	}

	@Autowired
	private DocumentMetaInfoService documentMetaInfoService;

	public void setDocumentMetaInfoService(DocumentMetaInfoService documentMetaInfoService) {
		this.documentMetaInfoService = documentMetaInfoService;
	}

	@GetMapping("/{patientID}/all")
	public PatientDocuments getDocumentMetaInfos(@PathVariable(name = "patientID") Long patientID) {
		
		if (patientID == null) {
			return null;
		}
		
		PatientDocuments documentMetaInfos = documentMetaInfoService.retrieveDocumentMetaInfo(patientID);
		return documentMetaInfos;
	}

	@GetMapping("/{documentMetaInfoId}")
	public DocumentMetaInfo getDocumentMetaInfo(@PathVariable(name = "documentMetaInfoId") Long documentMetaInfoId) {
		return documentMetaInfoService.getDocumentMetaInfo(documentMetaInfoId);
	}

	@PostMapping("")
	public void saveDocumentMetaInfo(DocumentMetaInfo documentMetaInfo) {
		documentMetaInfoService.saveDocumentMetaInfo(documentMetaInfo);
		System.out.println("DocumentMetaInfo Saved Successfully");
	}

	@DeleteMapping("/{documentMetaInfoId}")
	public void deleteDocumentMetaInfo(@PathVariable(name = "documentMetaInfoId") Long documentMetaInfoId) {
		documentMetaInfoService.deleteDocumentMetaInfo(documentMetaInfoId);
		System.out.println("DocumentMetaInfo Deleted Successfully");
	}

	@PatchMapping("/{documentMetaInfoId}")
	public void patchDocumentMetaInfo(@RequestBody DocumentMetaInfo documentMetaInfo, @PathVariable(name = "documentMetaInfoId") Long documentMetaInfoId) {
		DocumentMetaInfo emp = documentMetaInfoService.getDocumentMetaInfo(documentMetaInfoId);
		if (emp != null) {
			documentMetaInfoService.updateDocumentMetaInfo(documentMetaInfo);
		}
	}

	@PutMapping("/{documentMetaInfoId}")
	public void updateDocumentMetaInfo(@RequestBody DocumentMetaInfo documentMetaInfo, @PathVariable(name = "documentMetaInfoId") Long documentMetaInfoId) {
		DocumentMetaInfo emp = documentMetaInfoService.getDocumentMetaInfo(documentMetaInfoId);
		if (emp != null) {
			documentMetaInfoService.updateDocumentMetaInfo(documentMetaInfo);
		}

	}

}
