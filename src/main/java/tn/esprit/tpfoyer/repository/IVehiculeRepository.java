package tn.esprit.tpfoyer.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tpfoyer.domain.Vehicule;

public interface IVehiculeRepository extends CrudRepository<Vehicule, Long> {
}