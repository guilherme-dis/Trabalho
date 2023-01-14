package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
public class Estilista {
    private Integer id;
    private String cpf;
    private String telefone;
    private String endereco;
    private String nome;
    private List<Roupa> roupas = new ArrayList<>();


    public Roupa projetaRoupa(String nome) {
        System.out.println("Estilista: " + this.getNome() + " esta projetando a roupa: " + nome);
        Roupa roupa = new Roupa();
        Random rand = new Random();
        roupa.setId(rand.nextInt());
        roupas.add(roupa);
        roupa.setEstilista(this);
        return roupa;
    }

    public Estilista(Integer id, String cpf, String telefone, String endereco, String nome) {
        this.id = id;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.nome = nome;
    }
}
