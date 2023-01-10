package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Roupa {
    private String id;
    private TipoDeTecido tipoDeTecido;
    private Costureira costureira;
    private Estilista estilista;
    private Estoque estoque;
    private Venda venda;

}
