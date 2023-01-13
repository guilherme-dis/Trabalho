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

    public void finalizarProducaoDaRoupa(Roupa roupa, Estoque estoque){
        System.out.println("Finalizando a produção da roupa e enviando ao estoque");
        estoque.addRoupa(roupa);
    }

    public Roupa criaRoupa(Roupa roupa){
        System.out.println("Costureira produzindo a roupa ");
        roupa.setCostureira(this);

        return roupa;
    }

    public void gerarRelatorioDeRoupasProduzidas(){

    }

}
