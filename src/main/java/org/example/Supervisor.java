package org.example;

import lombok.*;

import java.util.*;

@Data
@AllArgsConstructor
public class Supervisor {
    private String id;
    private String turno;
    private String cpf;
    private String nome;
    private String edereco;
    private List<Costureira> costureiras;
    private List<MaquinaDeCostura> maquinaDeCosturaHashMap = new ArrayList<>();

    public void gerarRelatorioDeMaquinasQuebradas() {
        System.out.println("=========Gerando relatório de maquinas quebradas");
        for (MaquinaDeCostura maquinaDeCostura : maquinaDeCosturaHashMap) {
            if (maquinaDeCostura.isEstaEmManutencao()) {
                System.out.println("A maquina com o Id: " + maquinaDeCostura.getId() + " esta em manutenção!");
            }
        }
    }

    public Manutencao enviarMaquinaAoConcerto(MaquinaDeCostura maquina) {
        System.out.println("Enviando a maquina: " + maquina.getId() + " ao concerto!");
        addMaquina(maquina);
        return new Manutencao(maquina);
    }

    public Venda venderPecaAoCliente(Estoque estoque, Roupa roupa, Venda venda) {
        System.out.println("Realizando a venda ao cliente!");
        estoque.getRoupas().remove(roupa);
        venda.addRoupas(roupa);
        return venda;
    }
    public void removeDaManutencao(Manutencao manutencao, MaquinaDeCostura maquinaDeCostura) {
        System.out.println("Removendo a maquina: " + maquinaDeCostura.getId() + " da manutenção!");
        manutencao.setData_saida(new Date());
        maquinaDeCostura.setEstaEmManutencao(false);
    }
    public void addMaquina(MaquinaDeCostura maquinaDeCostura) {
            maquinaDeCosturaHashMap.add(maquinaDeCostura);
        }
    public Supervisor(String id, String turno, String cpf, String nome, String edereco) {
           this.id = id;
           this.turno = turno;
           this.cpf = cpf;
           this.nome = nome;
           this.edereco = edereco;
       }
}
