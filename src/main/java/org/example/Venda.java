package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Venda {
    private String id;
    private Cliente cliente;
    private List<Roupa> roupa;
    private Integer quantidade;

}
