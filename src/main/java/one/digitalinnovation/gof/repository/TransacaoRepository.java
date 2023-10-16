package one.digitalinnovation.gof.repository;

import org.springframework.data.repository.CrudRepository;

import one.digitalinnovation.gof.model.Transacao;

public interface TransacaoRepository extends CrudRepository<Transacao, Long> {
}