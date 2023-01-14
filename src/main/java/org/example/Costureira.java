package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Costureira {
    private String id;
    private String nome;
    private Roupa roupaAtual;
    private MaquinaDeCostura maquinaDeCosturaAtual;

    private List<String> tipoDeMaquinaPossuiHabilitacao = new ArrayList<>();
    private String turno;
    private Supervisor supervisor;
    private List<Roupa> roupas = new ArrayList<>();

    public void finalizarProducaoDaRoupa(Roupa roupa, Estoque estoque) {
        System.out.println("Finalizando a produção da roupa e enviando ao estoque");
        estoque.addRoupa(roupa);
        this.setRoupaAtual(null);
    }

    public Roupa criaRoupa(Roupa roupa) {
        System.out.println("Costureira produzindo a roupa ");
        roupa.setCostureira(this);
        roupa.setTipoDeTecido(maquinaDeCosturaAtual.getTipoDeTecido().get(0));
        roupas.add(roupa);
        this.setRoupaAtual(roupa);
        this.getMaquinaDeCosturaAtual().setRoupaAtual(roupa);
        return roupa;
    }

    public void gerarRelatorioDeRoupasProduzidas() {
        for (Roupa roupa : roupas) {
            System.out.println("=======Gerando relatório de ropas produzidas por COstureira");
            System.out.println("Roupa produzida: " + roupa.getId());
            System.out.println("Tipo de tecido: " + roupa.getTipoDeTecido().getNome());
            System.out.println("Produzida por: " + roupa.getEstilista().getNome());
            System.out.println("Fabricada por: " + roupa.getCostureira().getNome());
        }
    }

    public Costureira(String id, String nome, Roupa roupaAtual, MaquinaDeCostura maquinaDeCosturaAtual, String turno, Supervisor supervisor) {
        this.id = id;
        this.nome = nome;
        this.roupaAtual = roupaAtual;
        this.maquinaDeCosturaAtual = maquinaDeCosturaAtual;
        this.turno = turno;
        this.supervisor = supervisor;
    }
}
