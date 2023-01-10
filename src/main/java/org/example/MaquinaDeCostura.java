package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class MaquinaDeCostura {
    private Integer id;

    private List<TipoDeCostura> tipoDeTecido;
    private List<String> tipoDeCostura;
    private Supervisor supervisor;
    private Manutencao manutencao;
    private String fabricante;
    private boolean estaEmManutencao;
    private Roupa roupaAtual;

}
