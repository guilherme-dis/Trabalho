package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Cliente {
    private String id;
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private List<Venda> compras;

    public void comprar(){

    }
}
