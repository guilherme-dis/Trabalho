package org.example;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
public class Costureira {
    private Integer id;
    private String nome;
    private Roupa roupaAtual;
    private MaquinaDeCostura maquinaDeCosturaAtual;

    private List<String> tipoDeMaquinaPossuiHabilitacao;
    private String turno;
    private Supervisor supervisor;

    private List<Roupa> produzidas;

    public void finalizarProducaoDaRoupa(){

    }

    public void gerarRelatorioDeRoupasProduzidas(){

    }

}
