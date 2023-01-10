package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Estilista{
    private Integer id;
    private String cpf;
    private String telefone;
    private String endereco;
    private String nome;
    private List<Roupa> roupas;
}
