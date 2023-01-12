package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Manutencao {
    private String id;
    private Date data_saida;
    private Date data_entrada;
    private List<MaquinaDeCostura> maquinasDeCostura;
}
