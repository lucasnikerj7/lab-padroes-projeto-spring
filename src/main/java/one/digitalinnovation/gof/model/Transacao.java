package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transacao {
    @Id
    private Long id;
    private String descricao;
    private double valor;

    // Getters e Setters
}