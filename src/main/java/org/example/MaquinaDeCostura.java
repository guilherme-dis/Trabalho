package org.example;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
public class MaquinaDeCostura {
    private Integer id;

    private List<TipoDeTecido> tipoDeTecido;
    private List<TipoDeCostura> tipoDeCostura;
    private Supervisor supervisor;
    private String fabricante;
    private boolean estaEmManutencao;
    private Roupa roupaAtual;

}
