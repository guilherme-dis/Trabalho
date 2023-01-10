package org.example;

import lombok.Data;

import java.util.List;

@Data
public class Estoque {
    private Integer id;
    private Integer qtde;
    private List<Roupa> roupas;

    public void gerarRelatorioDePecasVendidas(){

    }
}
