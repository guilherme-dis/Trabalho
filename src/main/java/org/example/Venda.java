package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venda {
    private Integer id;
    private Cliente cliente;
    private List<Roupa> roupas;
    private Integer quantidade;

    public void addRoupas(Roupa roupa) {
        roupas.add(roupa);
    }

    public Venda(Cliente cliente, Integer quantidade) {
        Random rand = new Random();
        id = rand.nextInt();
        this.cliente = cliente;
        this.roupas = new ArrayList<>();
        this.quantidade = quantidade;
    }
}
