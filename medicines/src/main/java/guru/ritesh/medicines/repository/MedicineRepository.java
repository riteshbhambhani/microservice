package guru.ritesh.medicines.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.ritesh.medicines.model.Medicines;

/**
 * Repository to manage {@link Medicines} instances.
 *
 */
public interface MedicineRepository extends JpaRepository<Medicines, Long> {
	List<Medicines> findByPatientID(long patientID);
	
}
