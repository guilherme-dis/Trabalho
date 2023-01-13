package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
public class Supervisor {
    private String id;
    private String turno;
    private String cpf;
    private String nome;
    private String edereco;

    private List<Costureira> costureiras;
    private List<MaquinaDeCostura> maquinasDeCostura;

    public void cadastrarEstilistaEsuasroupas(){
    }

    public void cadastrarRoupas(){
    }

    public void gerarRelatorioDeMaquinasQuebradas(){
    }

    public void enviarMaquinaAoConcerto(){

    }

    public Venda venderPecaAoCliente(Estoque estoque, Roupa roupa, Integer quantidade,Cliente cliente){
        System.out.println("Realizando a venda ao cliente!");
        Venda venda = new Venda();
        estoque.getRoupas().remove(roupa);
        venda.setQuantidade(quantidade);
        venda.setCliente(cliente);
        Random rand = new Random();
        venda.setId(rand.nextInt());
        return venda;
    }
}
