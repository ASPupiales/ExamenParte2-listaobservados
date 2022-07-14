package ec.edu.espe.arquitectura.listaobservados.service;

import ec.edu.espe.arquitectura.listaobservados.exception.EntityNotFoundException;
import ec.edu.espe.arquitectura.listaobservados.model.DrugDealer;
import ec.edu.espe.arquitectura.listaobservados.repository.DrugDealerRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DrugDealerService {

  private final DrugDealerRepository drugDealerRepository;

  public DrugDealer obtainByName(String fullName) {
    Optional<DrugDealer> drugDealer = this.drugDealerRepository.findByFullName(fullName);
    if (drugDealer.isEmpty()) {
      throw new EntityNotFoundException("There is no drug dealer with name: " + fullName);
    }
    return drugDealer.get();
  }
}
