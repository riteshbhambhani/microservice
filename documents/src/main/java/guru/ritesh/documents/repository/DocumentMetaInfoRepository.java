package guru.ritesh.documents.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import guru.ritesh.documents.model.DocumentMetaInfo;

/**
 * Repository to manage {@link DocumentMetaInfo} instances.
 *
 */
public interface DocumentMetaInfoRepository extends CrudRepository<DocumentMetaInfo, Long> {
	
	List<DocumentMetaInfo> findDocumentByPatientId(Long patientId);

}
