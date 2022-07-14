package ec.edu.espe.arquitectura.listaobservados.repository;

import java.util.Optional;

public interface DrugDealerRepository<DrugDealer, String> {

  Optional<DrugDealer> findByFullName(String fullName);
}
