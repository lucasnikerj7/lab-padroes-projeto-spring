package one.digitalinnovation.gof.repository;

import com.seuapp.meuaplicativofinanceiro.model.Conta;
import org.springframework.data.repository.CrudRepository;

public interface ContaRepository extends CrudRepository<Conta, Long> {
}
