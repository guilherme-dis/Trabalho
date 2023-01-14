package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Estoque {
    private String id;
    private Integer qtde;
    private List<Roupa> roupas;

    public void addRoupa(Roupa roupa ){
        roupas.add(roupa);
    }

    public void gerarRelatorioDePecasVendidas(){
        System.out.println("Gerando relatório de peças em estoque");
        for(Roupa roupa : roupas){
            System.out.println("========Peças vendidas");
            System.out.println("Roupa com o id: "+roupa.getId());
            System.out.println("Roupa com o o tecido: "+roupa.getTipoDeTecido().getNome());
        }

    }
}
