package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Roupa {
    private int id;
    private TipoDeTecido tipoDeTecido;
    private Costureira costureira;
    private Estilista estilista;
    private Estoque estoque;
    private Venda venda;

}
