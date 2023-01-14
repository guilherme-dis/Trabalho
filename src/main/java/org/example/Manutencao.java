package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
import java.util.Random;

@Data
@AllArgsConstructor


public class Manutencao {
    private Integer id;
    private Date data_saida;
    private Date data_entrada;
    private MaquinaDeCostura maquinaDeCostura;

    public Manutencao(MaquinaDeCostura maquinaDeCostura) {
        Random rand = new Random();
        this.id = rand.nextInt();
        this.data_entrada = new Date();
    }

    public void registraManutencao(MaquinaDeCostura maquinaDeCostura) {
        System.out.println("Registrando a manutencao da maquina: " + maquinaDeCostura.getId() + "");
        maquinaDeCostura.setRoupaAtual(null);
        maquinaDeCostura.setEstaEmManutencao(true);
    }
}
