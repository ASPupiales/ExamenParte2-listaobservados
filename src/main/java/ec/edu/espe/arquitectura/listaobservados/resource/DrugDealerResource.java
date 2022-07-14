package ec.edu.espe.arquitectura.listaobservados.resource;

import ec.edu.espe.arquitectura.listaobservados.model.DrugDealer;
import ec.edu.espe.arquitectura.listaobservados.service.DrugDealerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/drugdealer")
@RequiredArgsConstructor
public class DrugDealerResource {

  private final DrugDealerService service;

  @GetMapping("/{fullName}")
  public ResponseEntity<DrugDealer> obtainByName(@PathVariable String fullName) {
    try {
      DrugDealer dealer = this.service.obtainByName(fullName);
      return ResponseEntity.ok(dealer);
    } catch (Exception e) {
      return ResponseEntity.badRequest().build();
    }
  }
}
