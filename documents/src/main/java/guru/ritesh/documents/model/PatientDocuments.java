package guru.ritesh.documents.model;

import java.util.List;

public class PatientDocuments {
	
	private long patientID;
	private List<DocumentMetaInfo> documents;
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
	 * @return the documents
	 */
	public List<DocumentMetaInfo> getDocuments() {
		return documents;
	}
	/**
	 * @param documents the documents to set
	 */
	public void setDocuments(List<DocumentMetaInfo> documents) {
		this.documents = documents;
	}
	
	
	

}
