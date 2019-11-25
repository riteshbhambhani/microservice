package guru.ritesh.patient.repository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;

import guru.ritesh.patient.entity.Patient;

/**
 * Repository to manage {@link Patient} instances.
 *
 */
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
