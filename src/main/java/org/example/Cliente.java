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
    private Venda venda;

    public void comprar(){

    }

    public void solicitarRoupa(String roupa,Integer quantidade){
        System.out.println("Solicitando a roupa: " + roupa);
        compras.get(0).setCliente(this);
        compras.get(0).setQuantidade(quantidade);

    }
}
