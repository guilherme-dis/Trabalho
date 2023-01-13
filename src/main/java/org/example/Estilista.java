package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
public class Estilista{
    private String id;
    private String cpf;
    private String telefone;
    private String endereco;
    private String nome;
    private List<Roupa> roupas;


    public Roupa projetaRoupa(String nome){
        System.out.println("Estilista: "+this.getNome()+" esta projetando a roupa: "+nome);
        Roupa roupa = new Roupa();
        //gerar um id aleatorio
        Random rand = new Random();
        roupa.setId(rand.nextInt());
        roupas.add(roupa);
        roupa.setEstilista(this);
        return roupa;
    }
}
