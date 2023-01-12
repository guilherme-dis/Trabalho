package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Supervisor {
    private String id;
    private String turno;
    private String cpf;
    private String nome;
    private String edereco;

    private List<Costureira> costureiras;
    private List<MaquinaDeCostura> maquinasDeCostura;

    public void cadastrarEstilistaEsuasroupas(){
    }

    public void cadastrarRoupas(){
    }

    public void gerarRelatorioDeMaquinasQuebradas(){
    }

    public void enviarMaquinaAoConcerto(){

    }

    public void venderPecaAoCliente(){

    }
}
