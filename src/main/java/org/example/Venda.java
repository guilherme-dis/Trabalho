package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venda {
    private Integer id;
    private Cliente cliente;
    private List<Roupa> roupas;
    private Integer quantidade;

}
