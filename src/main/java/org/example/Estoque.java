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

    }
}
