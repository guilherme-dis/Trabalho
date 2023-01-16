package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor

public class Cliente {
    private int id;
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private List<Venda> compras = new ArrayList<>();

    public Venda solicitarRoupa(String roupa, Integer quantidade) {
        System.out.println("Solicitando a roupa: " + roupa);
        Venda venda = new Venda(this, quantidade);
        compras.add(venda);
        return venda;
    }

    public Cliente(int id, String cpf, String nome, String endereco, String telefone) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}
