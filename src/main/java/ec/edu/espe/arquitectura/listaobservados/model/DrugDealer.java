package ec.edu.espe.arquitectura.listaobservados.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "narcotraficante")
@TypeAlias("narcotraficante")
public class DrugDealer {

  @Id private String id;

  private String fullName;

  private String sanctioned;
}
