package org.example;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
public class Costureira {
    private String id;
    private String nome;
    private Roupa roupaAtual;
    private MaquinaDeCostura maquinaDeCosturaAtual;

    private List<String> tipoDeMaquinaPossuiHabilitacao;
    private String turno;
    private Supervisor supervisor;

    private List<Roupa> roupas;

    public void finalizarProducaoDaRoupa(){

    }

    public void gerarRelatorioDeRoupasProduzidas(){

    }

}
