package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Conta {
    @Id
    private Long id;
    private String nome;
    private double saldo;

    // Getters e Setters
}
